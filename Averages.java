import java.util.Scanner;

public class Averages {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter three numbers:");
    int num1 = input.nextInt(2);
    int num2 = input.nextInt(4);
    int num3 = input.nextInt(6);

    double avg  = (num1 + num2 + num3)/3;

    System.out.println("Average:" + avg);
  }
}
