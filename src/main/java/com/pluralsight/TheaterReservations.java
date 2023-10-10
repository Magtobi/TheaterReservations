package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fullName = myScanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String enteredDate = myScanner.nextLine();

        System.out.print("How many tickets would you like?: ");
        int ticketCount = myScanner.nextInt();

        String pluralLetter = "";

        if (ticketCount > 1) {
            pluralLetter = "s";
        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate sanitizedDate = LocalDate.parse(enteredDate, format);

        String[] names = fullName.split(" ");

        System.out.println(ticketCount + " ticket" + pluralLetter + " reserved for " + sanitizedDate + " under " + names[1] + ", " + names[0]);
    }
}
