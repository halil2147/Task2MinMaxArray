import java.util.Random;

public class MinMaxArray{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSmallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
