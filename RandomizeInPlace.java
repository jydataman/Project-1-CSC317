// you can erase line 2 once you copied code into your ide of prefrence.
package week14FinalWeek;

import java.util.Random;
import java.util.Arrays;

public class RandomizeInPlace {

    public static void randomizeInPlaceFunc(int[] A) {

        int n = A.length;
        Random rand = new Random();

        System.out.println("Starting Randomize-in-place (n=" + n + ")");
        System.out.println("Initial Array: " + Arrays.toString(A));
        System.out.println("-----------------------------------");

        // 1. For i = 0 to n-1
        for (int i = 0; i < n; i++) {

            // like rolling dice
            int j = rand.nextInt(n - i) + i;

            // Print Program State Clearly
            System.out.println("Iteration is at " +  i + " (A[" + i + "] = " + A[i] + ")");
            System.out.println("Before swap: " + Arrays.toString(A));
            System.out.println("Random function iteration j chooses " + j + " (A[" + j + "] = " + A[j] + ")");

            // 2. Perform the swap: A[i] with A[j]
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            System.out.println("Swapped A[" + i + "] and A[" + j + "]");
            System.out.println("Array State after swap: " + Arrays.toString(A));
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {

        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        randomizeInPlaceFunc(myList);
        System.out.println("Final List: " + Arrays.toString(myList));
    }
}

