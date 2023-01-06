public class Kata {
    public static int rentalCarCost(int d) {
        int total = d * 40;
        if (d >= 7) {
            total -= 50;
        } else if (d >= 3) {
            total -= 20;
        } 
        return total;
    }

    // Alternative Solutions
    public static int rentalCarCostTernary(int d) {
        int total = d * 40;
        return d < 3 ? total : d < 7 ? total - 20 : total - 50;
    }

    public static int rentalCarCostSwitch(int d) {
        int total = d * 40;
           
        switch (d) {
            case 0: case 1: case 2:
            return total;

            case 3: case 4: case 5: case 6:
            return total - 20;

            default: return total - 50;
        }
    }
}
