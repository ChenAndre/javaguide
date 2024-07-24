import java.util.*;


// This line of code imports the `java.util` package, which contains various utility classes and interfaces.
// Importing this package allows us to use the classes and interfaces defined in it in our code.
// The `java.util` package provides classes for data structures like ArrayList, LinkedList, HashMap, etc.,
// as well as utility classes for handling input/output, date and time, and other common operations.
// By importing this package, we gain access to these useful classes and can use them in our program.

// Java code template
public class guide {
    public static void main(String[] args) {
        // Variables and data types
        int number = 10;
        double decimal = 3.14;
        boolean flag = true;
        String message = "Hello, world!";

        // Control flow statements
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is less than or equal to 5");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element: " + numbers[0]);

        // ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Size of names: " + names.size());

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("First element of linkedList: " + linkedList.getFirst());

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("Size of hashSet: " + hashSet.size());

        // HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        System.out.println("Score of Bob: " + scores.get("Bob"));

        // Sorting
        int[] unsortedArray = {5, 2, 8, 1, 9};

        // Bubble Sort
        bubbleSort(unsortedArray);
        System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(unsortedArray));

        // Insertion Sort
        insertionSort(unsortedArray);
        System.out.println("Sorted array (Insertion Sort): " + Arrays.toString(unsortedArray));

        // Searching
        int index = binarySearch(unsortedArray, 8);
        System.out.println("Index of 8 (Binary Search): " + index);
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort algorithm
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Binary Search algorithm
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}