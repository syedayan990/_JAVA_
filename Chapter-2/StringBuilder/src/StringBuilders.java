public class StringBuilders {
    static void main(String[] args) {
        // there are two concept String buffer and String builder
        // but in single-threading we use String builder but in multi-threading we use String buffer
        System.out.println("Here we use StringBuilder");
        int marks = 90;
        String name = "Ayan";
        StringBuilder sb = new StringBuilder("First ");
        sb.append("my name is ").append(name).append('\n');
        sb.append("and my marks is : ").append(marks);
        sb.toString();
        System.out.println(sb.toString());

    }
}
