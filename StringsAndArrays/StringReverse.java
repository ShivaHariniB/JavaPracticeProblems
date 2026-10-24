package StringsAndArrays;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println("Reverse Function " + ReverseFunction());
        System.out.println("Reverse Loop " + ReverseLoop());
    }

    public static String ReverseFunction() {
        String str1 = "Apple";
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();

        return sb.toString();
    }

    public static String ReverseLoop() {
        String str1 = "Banana";
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        return reversed;
    }
}
