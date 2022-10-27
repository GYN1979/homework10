import java.util.Random;
import java.util.Arrays;

public class Main {


    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] arr = generateRandomArray();

    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        int amountOfExpenses = 0;
        for (int currentValue  : arr) {
            amountOfExpenses += currentValue;
        }
        System.out.println("Сумма трат за месяц составила " + amountOfExpenses + " рублей");

        //Task2
        System.out.println("Task2");
        int minOfExpenses = arr[0];
        int maxOfExpenses = arr[0];
        for (int element : arr) {
            if (element < minOfExpenses) {
                minOfExpenses = element;
            } else if (element > maxOfExpenses) {
                maxOfExpenses = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minOfExpenses + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxOfExpenses + "рублей");

        //Task3
        System.out.println("Task3");
        int averageAmountSpent = amountOfExpenses;
            averageAmountSpent = amountOfExpenses / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageAmountSpent + " рублей");

        //Task4
        System.out.println("Task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
        System.out.print(reverseFullName[i]);

        }
    }
}




