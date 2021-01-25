import java.util.Random;
import java.util.Scanner;

/**
* The MultiArray program implements an application that
* outputs a random 4 x 6 Multi-Dimensional Array.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-25
*/
public class MultiArray {

  /**
  * The avgArray method returns the avg
  * number in the random Array.
  */
  public static int avgArray(int[][] random) {
    int sum = 0;
    int size = 0;

    for (int counter = 0; counter < random.length; counter++) {
      for (int counter2 = 0; counter2 < random[counter].length; counter2++) {
        sum += random[counter][counter2];
      }
      size += random[counter].length;
    }
    return sum / size;
  }

  /**
  * The Main method creates the random array.
  */
  public static void main(String[] args) {
    int[][] random = new int[4][6];

    Random rand = new Random();
    System.out.println("The random class marks are: ");
    for (int counter = 0; counter < random.length; counter++) {
      for (int counter2 = 0; counter2 < random[counter].length; counter2++) {
        int randomNumber = 1 + rand.nextInt(99);
        if (counter2 == random[counter].length - 1) {
          System.out.println(randomNumber);
        } else {
          System.out.printf(randomNumber + ", ");
        }
        random[counter][counter2] = randomNumber;
      }
    }

    int avg = avgArray(random);

    System.out.printf("\nThe class average is %d.", avg);
  }
}
