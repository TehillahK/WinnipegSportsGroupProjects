package comp3350.winSport.persistence;

public class InvalidNameException extends Exception{
    public InvalidNameException(String errorMessage) {
        super(errorMessage);
    }
}
