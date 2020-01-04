package com.jgdy3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Podaj datę urodzenia:");
        String dateOfBirth = scanner.nextLine();

        LocalDate date = LocalDate.parse(dateOfBirth, formatter);
        LocalDate death = date.plusYears(100);

        System.out.println("Male or female? (m/f)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("m")) {
            death = death.minusYears(10);
        }

        System.out.println("Do You smoke?");
        answer = scanner.next();
        if (answer.equalsIgnoreCase("y")) {
            death = death.minusYears(9).minusMonths(3);
        }

        System.out.println("Are You stressed?");
        answer = scanner.next();
        if (answer.equalsIgnoreCase("y")) {
            Random generator = new Random();
            int losowaLiczba = generator.nextInt(100);
            if (losowaLiczba < 10) {
                death = date.plusYears(60);
            }
        }

        System.out.println("You will die soon. Date is: " + death);
    }
}