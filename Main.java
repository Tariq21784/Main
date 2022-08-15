// Write Java program that randomly generate two Integers between 1 and 10 as input 
//and perform an operation (+,-,*,x,/) on them and displays the result of that operation.
//The program should tell the user whether the result is an even number or odd number. 
//If the result is an even number the program should generate again two integers and repeat the process again. 
//The program will only stop when the result of the operation is an odd number.
// Hint: (An even number is a number that can be divided into two equal groups. 
//An odd number is a number that cannot be divided into two equal groups)
// Expected output of the program
// The number of time the program generated the random number.
// The value of the odd that stops the program.
// Marks allocation
// 1. Use of a random function - 10 Marks
// 2. Use of a loop - 10 Marks
// 3. Use of a switch case 10 Marks
// 4. The use of a sentinel value - Odd number to stop the program - 10
// 5. correct output- 10
import java.util.Scanner;

/**
 *
 * @author arnol
 */
public class Main {
  public static void main(String[] args) {

    try (Scanner in = new Scanner(System.in)) {
      int result = 0;
      int Iterations = 0;

      Scanner console = new Scanner(System.in);
      System.out.println("Enter operation: 1)+,\n2)-,\n3)*,\n4)x,\n5)/");
      int operation = console.nextInt();

      // Use of a loop
      do {
        // Write Java program that randomly generate two Integers between 1 and 10 as
        // input

        Iterations++;
        // Use of a random function
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;

        // perform an operation (+,-,*,x,/)
        // Use of a switch case
        switch (operation) {
          case 1:
            result = a + b;
            break;

          case 2:
            result = a - b;
            break;

          case 3:
            result = a * b;
            break;

          case 4:
            result = a % b;
            break;

          case 5:
            result = a / b;
            break;

          case 06:
            System.out.println("Please enter one of the operations to continue");
            break;
        }

      }

      // Hint: (An even number is a number that can be divided into two equal groups.
      // An odd number is a number that cannot be divided into two equal groups)
      // The program will only stop when the result of the operation is an odd number.
      // If the result is an even number the program should generate again two
      // integers and repeat the process again.
      // The use of a sentinel value - Odd number to stop the program

      while (result % 2 == 0);
      // displays the result of that operation.
      // Expected output of the program
      // The number of time the program generated the random number.
      System.out.printf("Number of generations: ", Iterations);

      // The program should tell the user whether the result is an even number or odd
      // number.
      // The value of the odd that stops the program.
      System.out.printf("Value of the odd number: ", result);
    }
  }
}