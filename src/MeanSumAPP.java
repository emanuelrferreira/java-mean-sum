public class MeanSumAPP {

    public static void main(String[] args) {

        // obj
        MeanSum ms = new MeanSum();

        // process
        ms.computeMeanSum();

        // output
        ms.printArray();
        System.out.println("Total sum of all elements: " + ms.getSum());
        System.out.println("Average (mean) value: " + ms.getMean());
    }
}