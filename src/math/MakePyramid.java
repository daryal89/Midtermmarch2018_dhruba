package math;

public class MakePyramid {

    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
        int a = 20;
        makePyramid(a);
    }

    //  Method for printing pyramid
    public static void makePyramid(int a) {
        int k = 2 * a - 2;  // number of spaces

        // outer loop to handle number of rows n in this case
        for (int i = 0; i < a; i++) {

            // inner loop to handle number space. values changing according to requirement
            for (int j = 0; j < k; j++) {
                System.out.print(" ");  // printing spaces
            }

            k = k - 1;  // decrementing k after each loop

            //  inner loop to handle number of column. values changes according to outer loop
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // ending line after each row
        }
    }
}
