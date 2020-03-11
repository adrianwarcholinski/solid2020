package pl.zzpj2020.cleancode;

public class EmptyCollectionException extends Exception {
    public EmptyCollectionException() {
        super();
    }

    public EmptyCollectionException(String message) {
        super(message);
    }
}
