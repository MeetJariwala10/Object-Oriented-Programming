import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class TrainTicketReservationDemo extends Application {

    /* Total seats */
    private static final int TOTAL_SEATS = 5;

    /* Array list for booked tickets and waiting list */
    private final List<BookedTicket> bookedTickets = new ArrayList<>();
    private final List<BookedTicket> waitingList = new ArrayList<>();

    public static void main(String[] args) {

        /* Launching application */
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Train Ticket Reservation System");

        /* Creating borderPane */
        BorderPane borderPane = new BorderPane();

        /* Creating VBox for the title */ 
        VBox titleVBox = new VBox();

        /* Setting margins for title */
        titleVBox.setPadding(new Insets(20, 40, 20, 40));
        titleVBox.setAlignment(Pos.TOP_CENTER);

        /* For title */
        Text txt = new Text("Welcome to Indian Railways");
        txt.setFont(Font.font("Algerian"));
        txt.setFill(Color.BLACK);
        txt.getStyleClass().add("title-label");

        Text text = new Text("Train ticket reservation system");
        text.setFont(Font.font("Algerian"));
        text.setFill(Color.BLUEVIOLET);
        text.getStyleClass().add("title-label");

        /* Adding txt and text */
        titleVBox.getChildren().addAll(txt, text);

        // Creating vBox for buttons
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(20, 40, 50, 40));
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(80); // Vertical spacing between buttons

        /* Creating buttons for various actions */
        Button checkAvailabilityButton = new Button("Check Seat Availability");
        checkAvailabilityButton.setPadding(new Insets(20, 30, 20, 30));
        checkAvailabilityButton.getStyleClass().add("btn");
        checkAvailabilityButton.setOnAction(e -> checkSeatAvailability());

        Button bookTicketButton = new Button("Book Ticket");
        bookTicketButton.getStyleClass().add("btn");
        bookTicketButton.setOnAction(e -> bookTicket());
        bookTicketButton.setPadding(new Insets(20, 30, 20, 30));

        Button cancelTicketButton = new Button("Cancel Ticket");
        cancelTicketButton.getStyleClass().add("btn");
        cancelTicketButton.setOnAction(e -> cancelTicket());
        cancelTicketButton.setPadding(new Insets(20, 30, 20, 30));

        Button displayTicketsButton = new Button("Display Booked Tickets");
        displayTicketsButton.getStyleClass().add("btn");
        displayTicketsButton.setOnAction(e -> displayBookedTickets());
        displayTicketsButton.setPadding(new Insets(20, 30, 20, 30));

        Button displayWaitlistTicketsButton = new Button("Display Waitlist Tickets");
        displayWaitlistTicketsButton.getStyleClass().add("btn");
        displayWaitlistTicketsButton.setOnAction(e -> displayWaitlistTickets());
        displayWaitlistTicketsButton.setPadding(new Insets(20, 30, 20, 30));

        Button waitlistSpace = new Button("Waitlist Space");
        waitlistSpace.getStyleClass().add("btn");
        waitlistSpace.setOnAction(e -> displayWaitlistSpace());
        waitlistSpace.setPadding(new Insets(20, 30, 20, 30));

        // Creating HBox instances for each row of buttons
        HBox row1 = new HBox(checkAvailabilityButton, bookTicketButton, cancelTicketButton);
        row1.setAlignment(Pos.CENTER);
        row1.setSpacing(150);

        HBox row2 = new HBox(displayTicketsButton, displayWaitlistTicketsButton, waitlistSpace);
        row2.setAlignment(Pos.CENTER);
        row2.setSpacing(100);


        // Adding HBox instances to VBox
        vbox.getChildren().addAll(row1, row2);

        // Set background color
        vbox.setStyle("-fx-background-color: lightblue;");

        // Set titleVBox to the top of the borderPane
        borderPane.setTop(titleVBox);

        // Set vbox to the center of the borderPane
        borderPane.setCenter(vbox);

        // Passing borderPane to scene
        Scene scene = new Scene(borderPane, 600, 400);

        // Loading CSS file
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // Passing scene to stage
        primaryStage.setScene(scene);

        // Showing the stage
        primaryStage.show();
    }

    /* Checking number of available seats */
    private void checkSeatAvailability() {
        int remainingSeats = TOTAL_SEATS - getTotalBookedSeats();
        displayMessage("Total seats available: " + remainingSeats);
    }

    /* Total booked seats */
    private int getTotalBookedSeats() {
        int totalBookedSeats = 0;

        /* for-each loop for iterating through list */
        for (BookedTicket ticket : bookedTickets) {
            totalBookedSeats += ticket.getNumberOfSeats();
        }
        return totalBookedSeats;
    }

    /* For booking tickets */
    private void bookTicket() {

        /* It shows a small window where user can enter data */
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Book Ticket");
        dialog.setHeaderText("Booking Page");
        dialog.setContentText("Number of Seats:");

        int numberOfSeats = 0;

        /* While entering number of seats for booking */
        try {
            /*
             * showAndWait() will wait for user to enter data. If not entered orElse() will
             * return 0
             */
            numberOfSeats = Integer.parseInt(dialog.showAndWait().orElse("0"));
        } 
        catch (NumberFormatException e) {
            displayMessage("Invalid input! Please enter integer number.");
            return;
        }

        int remainingSeats = TOTAL_SEATS - getTotalBookedSeats();

        /* If seats are more than total seats */
        if (numberOfSeats > remainingSeats) {

            displayMessage("Sorry.... Insufficient seats available");

            /* Alert will show a small window that will ask the user for confirmation */
            /* 2 buttons -> OK and CANCEL */
            Alert waitlistAlert = new Alert(Alert.AlertType.CONFIRMATION);
            waitlistAlert.setTitle("Waitlist Confirmation");
            waitlistAlert.setHeaderText("Do you want to be added to the waitlist?");

            /* Asking user whether to enter in waitlist or not */
            ButtonType yesButton = new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.NO);

            waitlistAlert.getButtonTypes().setAll(yesButton, noButton);

            final int finalNumberOfSeats = numberOfSeats;

            /* If user clicks YES button */
            waitlistAlert.showAndWait().ifPresent(buttonType -> {

                if (buttonType.equals(yesButton)) {

                    /* Getting names for booking */
                    for (int i = 1; i <= remainingSeats; i++) {

                        String name = promptForName("Ticket " + i + ": ");

                        /* If name is empty or it is not an alphabet */
                        if (name.isEmpty() || !name.matches("^[a-zA-Z]+$")) {
                            displayMessage("Invalid input! Please enter a valid name (alphabetic characters only).");
                            return;
                        }

                        BookedTicket ticket = new BookedTicket(name, 1);

                        /* Adding tickets to arraylist -> bookedTickets */
                        bookedTickets.add(ticket);

                        displayMessage("Ticket successfully booked for: " + name);
                    }

                    int remainingWaitlistSeats = finalNumberOfSeats - remainingSeats;

                    for (int i = 1; i <= remainingWaitlistSeats; i++) {

                        String waitListName = promptForName("Waitlist Ticket " + i + ": ");

                        /* .matches() match the name with the regular expression */
                        if (waitListName.isEmpty() || !waitListName.matches("^[a-zA-Z]+$")) {
                            displayMessage("Invalid input! Please enter a valid name (alphabetic characters only).");
                            return;
                        }

                        /* Adding tickets to waitlist */
                        addToWaitingList(waitListName, 1);

                        displayMessage("Your ticket is added in waitlist");
                    }
                }
            });
            return;
        }

        /* For taking names in a list */
        List<String> names = new ArrayList<>();

        for (int i = 1; i <= numberOfSeats; i++) {

            String name = promptForName("Ticket " + i + ": ");

            if (name.isEmpty() || !name.matches("^[a-zA-Z]+$")) {

                displayMessage("Invalid input! Please enter a valid name (alphabetic characters only).");
                return;
            } 
            else {
                /* Adding name to list (names) */
                names.add(name);
            }
        }

        /* Adding all names and number of seats to list (bookedTickets) */
        for (String name : names) {

            BookedTicket ticket = new BookedTicket(name, 1);
            bookedTickets.add(ticket);

            displayMessage("Ticket successfully booked for: " + name);
        }
    }

    // Prompt the user for a name and return the entered value
    private String promptForName(String message) {

        /* Making text dialog box for entering names */
        TextInputDialog nameDialog = new TextInputDialog();
        nameDialog.setHeaderText(message);
        nameDialog.setContentText("Name:");

        try {
            return nameDialog.showAndWait().orElse("0");
        } 
        catch (InputMismatchException e) {
            displayMessage("Invalid input! Please enter a valid name.");
            return promptForName(message);
        }
    }

    /* Adding tickets to waiting list */
    private void addToWaitingList(String name, int numberOfSeats) {

        BookedTicket waitingTicket = new BookedTicket(name, numberOfSeats);
        waitingList.add(waitingTicket);
    }

    /*
     * To Cancel a booked ticket and simultaneously book ticket from the waiting
     * list
     */
    private void cancelTicket() {

        String name = promptForName("Enter the name on ticket to cancel: ");

        if (name.isEmpty() || !name.matches("^[a-zA-Z]+$")) {
            displayMessage("Invalid input! Please enter a valid name (alphabetic characters only).");
            return;
        }

        BookedTicket ticketToCancel1 = null;
        BookedTicket ticketToCancel2 = null;

        /* If ticket to be deleted is from booked tickets */
        for (BookedTicket ticket : bookedTickets) {
            if (ticket.getName().equals(name)) {
                ticketToCancel1 = ticket;
                break;
            }
        }

        /* If ticket to be deleted is from waitlist tickets */
        if (ticketToCancel1 == null) {
            displayMessage("Ticket not found in booked tickets!");

            for (BookedTicket ticket : waitingList) {
                if (ticket.getName().equals(name)) {
                    ticketToCancel2 = ticket;
                    break;
                }
            }

            if (ticketToCancel2 == null) {
                displayMessage("Ticket not found in waitlist! Please check again");
                return;
            } 
            else {
                waitingList.remove(ticketToCancel2);
                displayMessage("\n From Waitlist \n Ticket successfully cancelled for: " + name);
            }

        } 
        else if (ticketToCancel1 != null) {

            bookedTickets.remove(ticketToCancel1);
            displayMessage("\n From Booked Tickets \n Ticket successfully cancelled for: " + name);

            /*
             * If ticket is cancelled from booked tickets the 1st ticket from waitlist is
             * booked
             */
            if (!waitingList.isEmpty()) {

                /* Removing 1st ticket from waitlist */
                BookedTicket waitingTicket = waitingList.remove(0);

                /* Adding this ticket to booked tickets */
                addToBookedTickets(waitingTicket.getName(), waitingTicket.getNumberOfSeats());

                displayMessage("Ticket successfully booked from waiting list for: " + waitingTicket.getName());
                return;
            }
            return;
        }
    }

    /* Add a ticket to the booked tickets list */
    private void addToBookedTickets(String name, int numberOfSeats) {
        BookedTicket bookedTicket = new BookedTicket(name, numberOfSeats);
        bookedTickets.add(bookedTicket);
    }

    /* Display the booked tickets */
    private void displayBookedTickets() {

        if (!bookedTickets.isEmpty()) {

            /* StringBuilder is used to build a string containing information about the booked tickets */
            StringBuilder ticketsInfo = new StringBuilder();
            ticketsInfo.append("<BOOKED TICKETS>\n");
            ticketsInfo.append("%-20s%-40s\n".formatted("Seats", "Name"));

            for (BookedTicket ticket : bookedTickets) {
                ticketsInfo.append("%-20d%-40s\n".formatted(ticket.getNumberOfSeats(), ticket.getName()));
            }

            /* Converting the content of StringBuilder to String */
            displayMessage(ticketsInfo.toString());
        } 
        else {
            displayMessage("No tickets are booked!");
        }

    }

    /* Displaying waitlist tickets */
    private void displayWaitlistTickets() {

        if (!waitingList.isEmpty()) {

            /* StringBuilder is used to build a string containing information about the booked tickets */
            StringBuilder ticketsInfo = new StringBuilder();
            ticketsInfo.append("<BOOKED TICKETS>\n");
            ticketsInfo.append("%-20s%-40s\n".formatted("Seats", "Name"));

            for (BookedTicket ticket : waitingList) {
                ticketsInfo.append("%-20d%-40s\n".formatted(ticket.getNumberOfSeats(), ticket.getName()));
            }

            /* Converting the content of StringBuilder to String */
            displayMessage(ticketsInfo.toString());
        } 
        else {
            displayMessage("Waiting list is empty!");
        }
    }

    /* Displaying a message using a alert box */
    private void displayMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION); // Informational type alert
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message); // message will be displayed in alert box
        alert.showAndWait(); // This will wait for the user to close it
    }

    /* Displayig waiting list number for particular ticket */
    private void displayWaitlistSpace() {

        int index = 1;
        String name;

        /* If waiting list is not empty */
        if (!waitingList.isEmpty()) {

            name = promptForName("Enter name for waitlist status: ");

            if (name.isEmpty() || !name.matches("^[a-zA-Z]+$")) {
                displayMessage("Invalid input! Please enter a valid name (alphabetic characters only).");
                return;
            }

            /* Comparing names in waitlist */
            for (BookedTicket ticket : waitingList) {

                if (ticket.getName().equals(name)) {
                    displayMessage("Waitlist Status: WL " + index);
                    break;
                }
                index++;
            }

            if (index > waitingList.size()) {
                displayMessage("Ticket not found for: " + name);
            }

        } 
        else {
            displayMessage("Waitlist is empty!");
        }
    }

    /* Class representing a booked ticket */
    static class BookedTicket {
        private String name;
        private int numberOfSeats;

        public BookedTicket(String name, int numberOfSeats) {
            this.name = name;
            this.numberOfSeats = numberOfSeats;
        }

        /* Getting name */
        public String getName() {
            return name;
        }

        /* Getting number of seats */
        public int getNumberOfSeats() {
            return numberOfSeats;
        }
    }
}
