public class z {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "вован";
        checkUserName(user1, user2);
    }
    public static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2) == true) {
            System.out.println("отличное имя!");
        } else {
          //  System.out.println("выберете другое имя");
            System.out.println("ваше имя имеет дляну" + user2.length() + "символов");
            System.out.println("а без пробелов ваше имя занимает" + user2.length() + "сиьволов");
        }
    }
}
