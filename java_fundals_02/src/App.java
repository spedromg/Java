import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        fundalJavaVariables();
        fundalJavaScannerIO();
    }

    public static void fundalJavaVariables() {
        int age;
        age = 44;
        double note = 9.0;
        String firstName = "Simão Pedro";

        System.out.println(age + ", " + note + ", " + firstName);

    }

    public static void fundalJavaScannerIO() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o seu nome =>_ ");
        String firstName = keyboard.nextLine();
        System.out.println("Seu nome é " + firstName);
        System.out.println("Digite a sua idade =>_ ");
        int age = keyboard.nextInt();
        System.out.println("Sua idade é " + age);
    }
}
