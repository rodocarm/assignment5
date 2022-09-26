package us.rodolfocarmen;

public class MissingNameException extends Exception {
    public MissingNameException(String nameType) {
        super(nameType + " may not be blank ");
    }
}