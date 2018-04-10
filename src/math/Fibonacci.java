package math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int num1 = 0, num2 = 1, num3, i, count = 40;
        System.out.print(num1 + ", " + num2);  //printing 0 and 1

        for (i = 2; i < count; ++i)  //loop starts from 2 because 0 and 1 are already printed
        {
            num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}