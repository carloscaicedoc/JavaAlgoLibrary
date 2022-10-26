public class TestSum {
    public static void main(String[] args) {

        SumArray test = new SumArray();

        double[] dbs = {2.5, 4.5, 7.9, 5.1, 10.54};
        System.out.println(test.sum(dbs));
        System.out.println(test.sum(new double[] {1, 5.2, 4, 0, -1}));
        System.out.println(test.sum(new double[] {30, 89, 100, 101}));
        System.out.println(test.sum(new double[] {300.5, 64.78}));
    }
}
