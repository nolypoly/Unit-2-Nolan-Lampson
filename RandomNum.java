import java.util.Random;

public class RandomNum {
  public static void main (String[] args) {
    Random rand = new Random();

    System.out.println("# [0,10] = " + (int) (Math.random()*11));
    System.out.println("# [0, 500] = " + (int) (Math.random()*501));
    System.out.println("# [1, 10] = " + (int) (Math.random()*10 + 1));
    System.out.println("# [0,10] = " + rand.nextInt(11));
    System.out.println("# [0,6) =" + rand.nextInt(6));
  }

}
