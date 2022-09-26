package us.rodolfocarmen;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day) {
        super(year + month + day + " is an invalid day");
    }
}