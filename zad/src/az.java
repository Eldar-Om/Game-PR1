public class az {
    public static void main(String[] args) {
        System.out.println(removeWhateSpaces("А роза упала на лапу Азора"));
    }
    public static String removeWhateSpaces (String str){
        return str.replaceAll(" " , "  ");
    }
}
