package StringsAndArrays;

public class StringSearch {
    public static void main(String[] args) {
        System.out.println("First Index " + searchString());
        System.out.println("Last Index " + searchLast());
        System.out.println("Contains search " + searchContain());
        System.out.println("subString search " + searchSubString());
    }

    public static int searchString() {
        String text = "Hello Peter, Peter is my neighbour";
        return text.indexOf("Peter");
    }

    public static int searchLast() {
        String text = "Hello Peter, Peter is my neighbour";
        return text.lastIndexOf("Peter");
    }
    public static Boolean searchContain(){
        String text = "Hello Peter, Peter is my neighbour";
        return text.contains("Apple");
    }

    public static String searchSubString(){
        String str1 = "Hello Java";
        return str1.substring(6);
    }
}
