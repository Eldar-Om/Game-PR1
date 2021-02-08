import java.util.Scanner;

public class calcul {
    private static Object system;

    public static void main(String[] args) {
        int operand1;
        int operand2;
        Scanner scanner = new Scanner(System.in);
            operand1 = scanner.nextInt();
            operand2 = scanner.nextInt();
            char operation = scanner.next().charAt(0);

        switch(operation) {
            case '+':
            System.out.println(operand1+operand2);
                break;
            case '-':
            System.out.println(operand1-operand2);
                break;
            case '*':
            System.out.println(operand1*operand2);
                break;
            case '/':
            System.out.println(operand1/operand2);
                break;
            default: System.out.println("Ошибка! Введите заново");
                return;

        }
    }


}

