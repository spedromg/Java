public class App {
    public static void main(String[] args) throws Exception {
        App.arithmeticOperators(10, 5);
        App.comparationOperators(10, 5);
        App.booleanOperators(true, false);
        App.classMath(10.85, 50.258);
    }

    private static void arithmeticOperators(int numb1, int numb2) {
        // sum
        int numTotal = numb1 + numb2;
        System.out.println(numTotal);
        // subtraction
        numTotal = (numb1 - numb2);
        System.out.println(numTotal);
        // division
        numTotal = (numb1 / numb2);
        System.out.println(numTotal);
        // multiplication
        numTotal = numb1 * numb2;
        System.out.println(numTotal);
    }

    private static void comparationOperators(int numb1, int numb2) {
        System.out.println("numb1 = " + numb1 + ", " + "numb2 = " + numb2);

        // equals
        String flag = ("numb1 == numb2 => " + (numb1 == numb2));
        System.out.println(flag);

        // different
        flag = ("numb1 != numb2 => " + (numb1 != numb2));
        System.out.println(flag);

        // bigger then
        flag = ("numb1 > numb2 =>" + (numb1 > numb2));
        System.out.println(flag);

        // greater or equal to
        flag = ("numb1 >= numb2 => " + (numb1 >= numb2));
        System.out.println(flag);

        // less than
        flag = ("numb1 < numb2 => " + (numb1 < numb2));
        System.out.println(flag);

        // less than or equal to
        flag = ("numb1 <= numb2 => " + (numb1 <= numb2));
        System.out.println(flag);
    }

    private static void booleanOperators(boolean oper1, boolean oper2) {
        // and operator
        boolean result = oper1 && oper2;
        System.out.println(oper1 + " && " + oper2 + " = " + result);

        // or operator
        result = oper1 || oper2;
        System.out.println(oper1 + " || " + oper2 + " = " + result);

        // xor operator
        result = oper1 ^ oper2;
        System.out.println(oper1 + " ^ " + oper2 + " = " + result);

        // not operator
        System.out.println("not " + oper1 + " = " + !oper1 + ",  not " + oper2 + " = " + !oper2);
    }

    private static void classMath(double number1, double number2) {
        // max number
        System.out.println(Math.max(number1, number2));
        // min number
        System.out.println(Math.min(number1, number2));
        // round number
        System.out.println(Math.round(number1));
        // round max
        System.out.println(Math.ceil(number2));
        // round min
        System.out.println(Math.floor(number2));
        // potetion
        System.out.println(Math.pow(10, 2));
        // randomize
    }
}
