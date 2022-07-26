class ineuron {
    public static void main(String[] args) {
        int i, j, n = 7;

        for (i = 0; i < n; i++) {

            // print I
            for (j = 0; j < n; j++) {
                if (j == 0)
                    System.out.print("*");

            }
            System.out.print("  ");
            // print N

            for (j = 0; j < n; j++) {

                if (j == 0 || j == (n - 1) || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");

            // Print E

            for (j = 0; j < n; j++) {

                if (j == 0 || i == 0 || i == (n - 1) || i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");
            // Print U

            for (j = 0; j < n; j++) {

                if (j == 0 || j == (n - 1) || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            // Print R

            for (j = 0; j < n; j++) {

                if (j == 0 || i == 0 || i == n / 2)
                    System.out.print("*");

                else if (j == n - 1 && i < (n / 2))
                    System.out.print("*");
                else if (j == (n / 2 - 1) && i == (n / 2 + 1))
                    System.out.print("*");
                else if (j == (n / 2 + 1) && i == (n / 2 + 2))
                    System.out.print("*");
                else if (j == (n - 1) && i == (n - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");
            // Print O

            for (j = 0; j < n; j++) {

                if (j == 0 || j == (n - 1) || i == n - 1 || i == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");
            // print N

            for (j = 0; j < n; j++) {

                if (j == 0 || j == (n - 1) || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println("");

        }

    }
}