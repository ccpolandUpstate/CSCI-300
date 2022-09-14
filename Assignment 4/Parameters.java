//*******************************************************
// Parameters.java
//
// Illustrates the concept of a variable parameter list.
//*******************************************************
import java.util.Scanner;
public class Parameters {
//-----------------------------------------------
// Calls the average method with
// different numbers of parameters.
//-----------------------------------------------
    public static void main(String[] args) {
        double mean1, mean2, mean3, mean4, max1, max2, max3, max4;
        // Means
        mean1 = average(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);
        mean3 = average(13);
        mean4 = average();
        // Max
        max1 = maximum(42, 69, 37);
        max2 = maximum(35, 43, 93, 23, 40, 21, 75);
        max3 = maximum(13);
        max4 = maximum();
        System.out.println("mean1 = " + mean1 + " and the maximum = " + max1);
        System.out.println("mean2 = " + mean2 + " and the maximum = " + max2);
        System.out.println("mean3 = " + mean3 + " and the maximum = " + max3);
        System.out.println("mean4 = " + mean4 + " and the maximum = " + max4);
    }
//----------------------------------------------
// Returns the average of its parameters.
//----------------------------------------------
    public static double average(int... list) {
        double result = 0.0;
        if (list.length != 0) {
            int sum = 0;
            for (int num : list)
                sum += num;
            result = (double) sum / list.length;
        }
        // System.out.println("The maximum is " + maximum(list));
        return result;
    }
    // ----------------------------------------------
    // Returns the maximum of its parameters.
    // ----------------------------------------------
    public static int maximum(int... list) {
        int max = 0;
        for (int num : list) {
            if (num > max)
                max = num;
        }
        return max;
    }
}

