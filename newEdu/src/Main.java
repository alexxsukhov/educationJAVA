import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество символов для генерации массива: ");
        int countArray = new Scanner(System.in).nextInt();
        System.out.print("Введите количество символов для сдвига вправо: ");
        int countNumbers = new Scanner(System.in).nextInt();
        int[] array = new int[countArray];
        for(int i = 0; i < countArray; i++){
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < countNumbers; i++){
            for(int j = 0; j < array.length - 1; j++){
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}