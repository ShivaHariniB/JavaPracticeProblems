package Mock;
//Addition is limited by the storage size of an integer in any language. When two integers are added whose sum is greater than that allowed by the size of an integer, an overflow error is thrown. Write a function that adds two integer numbers of any size stored as strings - the function should be able to add any two integers and never throw an overflow exception. For example,
//Example:
//op1 = '1234512345123451234512345'
//op2 = '1111111111111111111111111'
//result = SuperAdd(/* your operands */)
// result = ''2345623456234562345623456'

public class additionOfStrings {
    public static void main(String[] args) {
        String op1 = "1234512345123451234512345";
        String op2 = "1111111111111111111111111";
        System.out.println(superAdd(op1, op2));
    }

    public static String superAdd(String op1, String op2) {
        int i = op1.length() - 1;
        int j = op2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? op1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? op2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }
        return result.reverse().toString();
    }
}
