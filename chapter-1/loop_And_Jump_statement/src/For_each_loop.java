public class For_each_loop {
    static void main(String[] args) {
        System.out.println("For Each Loop");
        String[] array = new String[]{
                "ayan" , "sheenam" , "kanak" , "ali"
        };
//        PrintArray(array);
        PrintArrayForEach(array);
    }
    public static void PrintArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void PrintArrayForEach(String[] array) {
        for (String name : array) {
            System.out.println(name + " ");
        }
    }
}
