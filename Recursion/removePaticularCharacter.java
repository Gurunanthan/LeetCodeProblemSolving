package Recursion;

import java.util.*;

public class removePaticularCharacter {
    public static String remover(char c, String s, String result) {
        if (s.length() == 0) {
            return result;
        }
        if (s.charAt(0) == c) {
            return remover(c, s.substring(1), result);
        } else {
            result += s.charAt(0);
            return remover(c, s.substring(1), result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to be found");
        System.out.println(remover('a', "aabac", ""));
        sc.close();

    }
}
