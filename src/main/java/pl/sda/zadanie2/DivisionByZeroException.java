package pl.sda.zadanie2;

public class DivisionByZeroException extends RuntimeException{
    DivisionByZeroException(String message){
        super(message);
    }
}
