import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //TaskPart1()
        task1();
        task2();
        task3();
        task4();
    }


    private static void task1() {
        System.out.println("Задание 1");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    private static void task2() {
        System.out.println("Задание 2");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int maxPayment = 0;
        int minPayment = 200000;
        for (int j : salaryArray) {
            if (j > maxPayment) {
                maxPayment = j;
            }
        }
        for (int j : salaryArray) {
            if (j < minPayment) {
                minPayment = j;
            }
        }
        final int maxPayment1 = maxPayment;
        System.out.println("Максимальная сумма трат за день составила " + maxPayment1 + " рублей");
        final int minPayment1 = minPayment;
        System.out.println("Минимальная сумма трат за день составила " + minPayment1 + " рублей");
    }


    private static void task3() {
        System.out.println("Задание 3");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        float averagePayment = 0f;
        int totalPayment = IntStream.of(salaryArray).sum();
        averagePayment = totalPayment / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + "рублей");

    }

    private static void task4() {
        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print (reverseFullName[i]);
        }
    }
}






