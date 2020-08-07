package J2_L2_hw;

public class Java2_Lesson2_hw {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array44 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array22 = {{"1", "2"}, {"1", "2"}};
        getArray(array44);
        getArray(array22);
    }

    public static void getArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int row, column, sum = 0;

        row = array.length;
        column = array[0].length;

        if (array.length == 4 && array[0].length == 4) {
            System.out.println("Я проверил, массив точно 4х4!");
        } else {
            throw new MyArraySizeException("MyArraySizeException: Ошибка, размер массива выходит за пределы 4х4!");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("MyArrayDataException: Конвертирую в числа " + i + " : " + j);
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
