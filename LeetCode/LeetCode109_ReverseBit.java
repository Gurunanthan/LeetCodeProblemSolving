package LeetCode;

public class LeetCode109_ReverseBit {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >>> i) & 1;  
            int reversedBit = bit << (31 - i);  
            result |= reversedBit;  
        }
        return result;
    }

    public static void main(String[] args) {
        int originalNumber = 964176192;
        LeetCode109_ReverseBit solution = new LeetCode109_ReverseBit();
        int reversedNumber = solution.reverseBits(originalNumber);

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
        System.out.println("Binary representation of reversed number: " + Integer.toBinaryString(reversedNumber));
    }
}
