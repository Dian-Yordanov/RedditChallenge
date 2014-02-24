/**
 * Created by Xelnect on 2/24/14.
 */

import java.util.Scanner;

public class Disemvoweler {
    public static void main(String[] args) {

        String input1 = "two drums and a cymbal fall off a cliff";
        String input2 = "all those who believe in psychokinesis raise my hand";
        String input3 = "did you hear about the excellent farmer who was outstanding in his field";

        disemvolerMethod(input1);
        disemvolerMethod(input2);
        disemvolerMethod(input3);
    }

    public static void disemvolerMethod(String input) {
        String endString1 = "";
        String endString2 = "";
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                    endString2 += input.charAt(i);
                    break;
                case 'u':
                    endString2 += input.charAt(i);
                    break;
                case 'o':
                    endString2 += input.charAt(i);
                    break;
                case 'i':
                    endString2 += input.charAt(i);
                    break;
                case 'e':
                    endString2 += input.charAt(i);
                    break;
                case ' ':
                    break;
                default:
                    endString1 += input.charAt(i);
            }
        }
        System.out.println(endString1);
        System.out.println(endString2);
    }
}
