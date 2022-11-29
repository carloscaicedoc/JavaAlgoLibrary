public class BasicOperations {
    public static int basicMath(String op, int v1, int v2) {
        if (op == "+") {
            return v1 + v2;
        } else if (op == "-") {
            return v1 - v2;
        } else if (op == "*") {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

    // Switch() approach
    public static int basicMathSwitch(String op, int v1, int v2) {
        switch (op) {
            case "+" : return v1 + v2;  
            case "-" : return v1 - v2;
            case "*" : return v1 * v2;
            case "/" : {
                if (v2 == 0)
                    throw new IllegalArgumentException("Division by zero");
                    return v1 / v2;
                }
            default: 
            throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }

    // Ternary Operator approach
    public static int basicMathTernaryOperator(String op, int v1, int v2) {
        return (op == "+") ? (v1 + v2)
                : (op == "-") ? (v1 - v2) : (op == "*") ? (v1 * v2) : (v2 == 0) ? null : (v1 / v2);
    }
}
