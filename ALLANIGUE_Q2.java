
import java.util.Scanner;

public class ALLANIGUE_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Step 1: Input Power Levels
        System.out.println("Enter 10 power levels of creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        // Step 2: Bubble Sort (Ascending Order)
        int[] bubbleSorted = powerLevels.clone();
        bubbleSort(bubbleSorted);
        System.out.println("\nBubble Sort (Ascending):");
        displayArray(bubbleSorted);

        // Step 3: Selection Sort (Descending Order)
        int[] selectionSorted = powerLevels.clone();
        selectionSort(selectionSorted);
        System.out.println("\nSelection Sort (Descending):");
        displayArray(selectionSorted);

        // Step 4: Calculate and Display Analysis
        int sumEven = calculateSumEven(powerLevels);
        int sumOdd = calculateSumOdd(powerLevels);
        int min = findMin(powerLevels);
        int max = findMax(powerLevels);

        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power Level: " + min);
        System.out.println("Maximum Power Level: " + max);

        scanner.close();
    }

    // Bubble Sort (Ascending Order)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort (Descending Order)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap arr[i] and arr[maxIndex]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Display Array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Calculate Sum of Even Numbers
    public static int calculateSumEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Calculate Sum of Odd Numbers
    public static int calculateSumOdd(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Find Minimum Power Level
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Find Maximum Power Level
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
