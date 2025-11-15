/*
MeanSum.java
Mini program to calculate the sum and mean of an integer array
*/

public class MeanSum {

    // vars
    private int[] numbers;
    private int sum;
    private double mean;

    // constructor
    public MeanSum() {
        // default values
        numbers = new int[]{2, 4, 6, 8};
        sum = 0;
        mean = 0.0;
    }

    // compute
    public void computeMeanSum() {
        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // accumulate values
        }

        // cast to double to avoid integer division
        mean = (double) sum / numbers.length;
    }

    // getters
    public int getSum() {
        return sum;
    }

    public double getMean() {
        return mean;
    }

    // iterates through the array to compute the total sum
    public void printArray() {
        System.out.println("Values in the array:");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println();
    }
}