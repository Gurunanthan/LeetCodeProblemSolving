package Simple;

public class Verify {
    public static void main(String[] args) {
        int n1[] = {8, 5, 1};
        int n2[] = {5, 5, 2};
        int result = 0;
        int carry = 0;

        for (int i = 0; i < n1.length; i++) {
            int sum = n1[i] + n2[i] + carry;
            result = result * 10 + sum % 10;
            carry = sum / 10;
        }

        // If there is a carry after the loop, add it to the result
        if (carry > 0) {
            result = result * 10 + carry;
        }

        System.out.println(result);
    }
}
