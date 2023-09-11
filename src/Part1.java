public class Part1 {
    public static void main(String[] args) {
        //1. Demonstrate array creation:
        int[] array1 = new int[10];
        int size = 5;
        boolean[] array2 = new boolean[size];
        double[] array3 = {1.5, 4, 2.2, 5, 6.1};
        String[] pets = {"cat", "dog", "hamster", "fish", "parrot"};
        char[] array4 = {'a', 'b', 'c'};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //2. Set and access array elements by index:
        array1[4] = 45;
        System.out.println("5th element value: " + array1[4]);
        //array1[1000] = 0;

        //3. Iterate over array (array traversal):
        System.out.println("for loop working:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("enhanced for loop working:");
        for (int value : array1) {
            System.out.println(value);
        }

        System.out.println("while loop working:");
        int i = 0;
        while (i < array1.length) {
            System.out.println(array1[i]);
            i++;
        }
    }
}
