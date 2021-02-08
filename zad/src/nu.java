import java.util.Scanner;

public class nu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            String phoneNumber = scanner.nextLine();
            isCorrectNumber = checkPhoneNumberslsCorrect(phoneNumber);
            if (!isCorrectNumber) {
                System.out.println("введите корректный номер");
            }else {
                System.out.println(formatNumber(phoneNumber));
            }

        }
    }

    private static String formatNumber(String phoneNumber) {
        String clear = phoneNumber.replaceAll("[^0-9]","");
        String result = "+7" + " " +  clear.substring(1,4) + "" +
                clear.substring(1,4) + " " + clear.substring(7,9) + " " + clear.substring(9);
        return result;
    }

    private static boolean checkPhoneNumberslsCorrect(String phoneNumber) {
        String clear = phoneNumber.replaceAll("[^0-9]","");
        return clear.length() == 11;
    }


}
