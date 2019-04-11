//Adam Dressel
// Inheritance is when one class obtains all of the fields and methods of another class. 
// This is done with the extends keyword. This allows for more concisely written code,
// as methods can be reused, without having to create the same fields and methods.
// This also allows for organization in a program so that similar objects can be used
// and grouped in a set of super and sub classes.
public class Integration {
  private static int num1;
  private static int num2;
  private static int num3;
  private static int[] numSort = {1, 5, 12, 15, 32, 64};
  private static int[][] numSort2D = {{4, 6, 32, 55, 61}, {13, 43, 11, 20, 7}};

  public static void smallElement() {
    for (int i = num1; i < numSort.length; i++) {
      if (i != 0 && num1 < numSort[i]) {

      } else {
        num1 = numSort[i];
      }
    }
    System.out.println("The smallest element is " + num1);
  }


  public static void findIndex() {
    while (num2 < numSort.length) {
      if (numSort[num2] == 15) {
        break;

      } else {
        num2++;
      }
    }
    if (num2 >= numSort.length) {
      System.out.println("Could not find value.");
    } else {
      System.out.println("The value " + numSort[num2] + " was found at index " + num2);
    }
  }

  public static void findCoordinates() {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 5; j++) {
        if (numSort2D[i][j] == 20) {
          num3 = numSort2D[i][j];
          System.out
              .println("The value " + num3 + " is at the " + "coordinates (" + i + "," + j + ")");
          break;
        }
        num3 = numSort2D[i][j];
      }
      if (num3 == 20) {
        break;
      }
    }
  }
}
