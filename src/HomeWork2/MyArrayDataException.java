package HomeWork2;

public class MyArrayDataException extends Exception {
    public int i ,j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public MyArrayDataException(String message, int i, int j) {
        super(message + " [" + i + "] [" + j +"]");
        this.i = i;
        this.j = j;
    }

}
