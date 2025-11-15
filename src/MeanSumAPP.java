public class MeanSumAPP {

    public static void main(String[] args) {

        // obj
        MeanSum ms = new MeanSum();

        // process
        ms.computeMeanSum();

        // output
        ms.printArray();
        System.out.println("Sum of array: " + ms.getSum());
        System.out.println("Mean of array: " + ms.getMean());
    }
}