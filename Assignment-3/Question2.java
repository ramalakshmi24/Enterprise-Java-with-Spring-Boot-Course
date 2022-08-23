import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        String s1[] = str.split(" ");
        String s2 = "";

        for (int i = 0; i < s1.length; i++) {
            for (int j = s1[i].length() - 1; j >= 0; j--) {
                s2 = s2 + s1[i].charAt(j);
            }
            s2 = s2 + " ";
        }

        System.out.println("Output: " + s2);
    }
}
