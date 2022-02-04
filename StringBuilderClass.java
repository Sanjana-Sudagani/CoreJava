public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John Doe");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5, "Jake ");
        System.out.println(sb);

        sb.replace(22, 29, "amazing");
        System.out.println(sb);

        sb.delete(5, 13);
        System.out.println(sb);
    }
}