public class App {
    public static void main(String[] args) throws Exception {
        // condicionais
        int number1 = 100;
        int number2 = 200;
        App.condictionsMethod(number1, number2);
        App.loops(number2, number1);
        App.tabuada(2);
        double numb = App.poliSecGrau(2, 2, 5, 5);
        System.out.println("Polinômio de Segundo Grau => " + numb);
    }

    public static void condictionsMethod(int number1, int number2) {
        if (number1 != number2) {
            System.out.println(number1 + " é diferente de " + number2);
        }

        if (number1 > number2) {
            System.out.println(number1 + " é maior que " + number2);
        } else {
            System.out.println(number2 + " é maior que " + number1);
        }
    }

    public static void loops(int numMax, int numMin) {
        do {
            System.out.println(numMin);
            numMin++;
        } while (numMin < numMax);

        System.out.println();

        numMin = 0;
        numMax = 10;

        while (numMax > numMin) {
            System.out.println(numMax);
            numMax--;
        }

        System.out.println();

        for (int x = 0; x < 10; x++) {
            System.out.println(x);
        }
    }

    public static void tabuada(int num) {
        System.out.println();

        for (int x = 0; x <= 10; x++) {
            System.out.println(num + " x " + x + " = " + (num * x));
        }
    }

    public static double poliSecGrau(int a, int b, int x, int c) {
        return a * Math.pow(x, 2) + b * x + c;
    }
}
