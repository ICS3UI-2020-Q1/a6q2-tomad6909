import java.util.Scanner;
/**
 * This program will populate a 10 element array with integers and have the user enter a number to search for. The program will then search through the array and state the index that the number is at
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create an array with 10 spots
    int[] integers = new int[10];

    // ask the user to enter in 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    // create a for loop and put in integers
    for(int i = 0; i < 10; i++){
      integers[i] = input.nextInt();
    } 

    // ask the user to enter a number to find
    System.out.println("Please enter a number to find");
    int numberFind = input.nextInt();

    for(int i = 0; i < integers.length; i++){
      if(integers[i] == numberFind){
        System.out.println(numberFind + " is located at index " + i);
      }else{
        
      }
    }


    
  }
}
