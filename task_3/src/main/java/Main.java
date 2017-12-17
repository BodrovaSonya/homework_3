import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
                System.out.print("Input first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Input second number: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("Choose operation (+,-,*,/): ");
                char op = scanner.next().charAt(0);
                Calc calc = new Calc(op, firstNumber, secondNumber);

            System.out.println("Continue? Y/N");
            char answer = scanner.next().charAt(0);

            switch (answer){
                case 'Y':
                    flag = true;
                    break;
                case 'N':
                    flag = false;
                    break;
                default:
                    flag = true;
                    break;
            }
        }
    }
}
