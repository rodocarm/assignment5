package us.rodolfocarmen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MissingNameException, UnknownGenderCodeException, InvalidBirthdayException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last Name >");
        String lastName = scanner.nextLine().toLowerCase();
        System.out.print("First Name >");
        String firstName = scanner.nextLine().toUpperCase();
        System.out.print("Middle Initial >");
        String middleInitial = scanner.nextLine().toUpperCase();
        System.out.print("Month of birth (1-12) >");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Day of birth (1-31) >");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.print("Year of birth (YYYY) >");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Gender (M or F) >");
        char gender = scanner.nextLine().toUpperCase().charAt(0);
        FirstNameUtility firstNameUtility = new FirstNameUtility();
        LastNameUtility lastNameUtility = new LastNameUtility();
        MonthDayGenderUtility monthDayGenderUtility = new MonthDayGenderUtility();
        DriversLicense driversLicense = new DriversLicense();
        try {
            driversLicense.setSoundCodex(lastNameUtility.encodeLastName(lastName));
            driversLicense.setFFF(firstNameUtility.encodeFirstName(firstName, middleInitial));
            driversLicense.setYY(year);
            driversLicense.setDDD(monthDayGenderUtility.encodeMonthDayGender(year, month, day, gender));
            driversLicense.setNN(0);
        } catch (MissingNameException | UnknownGenderCodeException | InvalidBirthdayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Wisconsin: " + new WisconsinFormatter().formatLicenseNumber(driversLicense));
        System.out.println("Florida: " + new FloridaFormatter().formatLicenseNumber(driversLicense));
    }
}