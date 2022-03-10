public class StringBuilderExample {

    public static void main(String[] args) {
        String s = "Hello";

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append(" World").append("!");

        int pointerIndex = stringBuilder.indexOf("World");
        stringBuilder.insert(pointerIndex-1, " test");
        stringBuilder.deleteCharAt(7);
        stringBuilder.reverse();

        System.out.println(stringBuilder);
        String output = stringBuilder.toString();
    }

}
