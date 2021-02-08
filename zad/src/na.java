import java.util.Scanner;

public class na {
    private static String[] Words;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        String[] Words = name.trim().split(" ");
        return Words.length == 3;
    }

    private static String formatName(String name) {
        String[] Words = name.trim().split(" ");
        sortByLength(Words);
        String result = "";
        for (int i = 0; i < Words.length; i++) {
            String str = Words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;  
    
    }
        private static void sortByLength (String[]words){
            for (int i = 0; i < Words.length - 1; i++) {
                for (int j = 0; j < Words.length - 1; j++) {
                    if (Words[j].length() > Words[j + 1].length()) {
                        String tmp = Words[j];
                        Words[j] = Words[j + 1];
                        Words[j + 1] = tmp;
                    }

                }
            }
        }
    
}

