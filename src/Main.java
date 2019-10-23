
public class Main {
  public static void main(String[] args) {
    // 1.Create a loop that will print numbers from 1 to 10, except number 7
    for (int i = 1; i < 11; i++) {
      if (i != 7) System.out.println(i);
    }

    // 2.Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
    int[] newArr = {1,2,3,4,5};
    System.out.println(newArr[0]);

    // 3.Call index outside of the bound. Handle this exception printing “Outside of bound message.”
    try{
      System.out.println(newArr[5]);
    }
    catch(Exception e) {
      System.out.println("Outside of bound message.");
    }


  }
}
