import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        int[] alpha = new int[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alpha[index] = 1;
        }
        for (int i = 0; i <= 25; i++) {
            if (alpha[i] == 0)
                flag = 0;
        }

        if (flag == 1)
            System.out.print("\nThe above string is a pangram.");
        else
            System.out.print("\nThe above string is not a pangram.");
    }
}
