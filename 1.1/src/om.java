public class om {
    public static void main(String[] args) {
        int[] array = new int[11];
        int value = 5;
        for (int i = 0; i < array.length; i++) ;
        {
            array[0] = value;
            value++;
        }
        for (int i = 0; i < array.length; i++) ;{
            System.out.println(array[0]);
        }
    }

}
