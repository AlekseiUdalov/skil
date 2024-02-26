import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, -, /): ");
        String operation = scanner.next();

        System.out.println("Введите второе число: ") ;
        double number2 = scanner.nextDouble();

        double result = 0.0;

        switch (operation) {
            case "+" :
                result = number1 + number2 ;
                break;
            case "-" :
                result = number1 - number2 ;
                break;
            case "*" :
                result = number1 * number2 ;
                break;
            case "/" :
                result = number1 / number2 ;
                break;
            default:
                System.out.println("Некоректрая операция!");
                return;
        }

        System.out.println("Результат:" + result);
    }
}
