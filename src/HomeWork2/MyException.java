package HomeWork2;

public class MyException {
    public static void main(String[] args) throws Exception {

        String [][] arr = {{"11","12","13","14"},{"21","22","23","24"},{"31","32","33","34"},{"41","42","43","54"}};
        myArray(arr);
        System.out.println("First " + arr.length);
    }

    public static void myArray (String [][] arr) throws MyArrayDataException,MySizeArrayException {
        if (arr.length > 4) throw new MySizeArrayException("Размер массива более 4*4, превышение ", arr.length);
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length > 4) {
                    throw new MySizeArrayException("Размер массива более 4*4, превышение ", arr[i].length);
                }

            for (int j = 0; j < arr.length; j++) {
                try {
                    int arr2  = Integer.parseInt( arr[i][j]);
                }catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не корректный элемент ", i, j);
                }
            }
        }
    }
}
