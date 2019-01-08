package HomeWork2;

public class MySizeArrayException extends Exception {
    public int size;

    public int getSize() {
        return size;
    }

    public MySizeArrayException() {
    }

    public MySizeArrayException(String message, int size) {
        super(message + size);
        this.size = size;

    }
}
