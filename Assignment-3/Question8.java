import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))) {

                count++;
            }
        }

        if (count == 0)

            System.out.println(
                    "No Special Characters found.");
        else

            System.out.println(
                    "Number of Special Characters: " + count);
    }
}
