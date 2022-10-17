public class Test {
    public static void main(String[] args) {

        Kata averageTest = new Kata();
        int[] myArray = {15, 10, 25, 12, 18};
        System.out.println(averageTest.calculateAverage(myArray));
        System.out.println(averageTest.averageStream(myArray));
    }    
}

