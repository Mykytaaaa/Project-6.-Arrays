import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public static Random random = new Random();
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        printArray(inputArray(in.nextInt()));
        sumArray();
        findLargest();
        System.out.println("Enter array length");
        int[] array = inputArray(in.nextInt());
        System.out.println("Enter value to find");
        System.out.println(findValue(array, in.nextInt()));
    }

    public static int[] inputArray(int length) {
        int[] array = new int[length];
        System.out.println("Enter the array members");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    public static int[] randomIntArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sumArray() {
        System.out.println("Enter the length of the array");
        int[] array = inputArray(in.nextInt());
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("the sum is " + sum);
    }

    public static void findLargest() {
        System.out.println("Enter the length of the array");
        int[] array = randomIntArray(in.nextInt());
        int largest = 0;
        for (int value : array) {
            if (value > largest)
                largest = value;
        }
        System.out.println("the largest value is " + largest);
    }

    public static int findValue(int[] array, int value) {
        System.out.println("Enter the length of the array");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return  i;
        }
        return -1;
    }
}
