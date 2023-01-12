public class TestGoals {
    public static void main(String[] args) {
        Goals goalBoard = new Goals();

        System.out.println(goalBoard.goals(33, 12, 15));
        System.out.println(goalBoard.goalsStream(33, 12, 15));
        System.out.println(goalBoard.goalsStream2(33, 12, 15));
        System.out.println(goalBoard.goalsAsList(33, 12, 15));
        System.out.println(goalBoard.goals4(33, -12, 15));
    }
}