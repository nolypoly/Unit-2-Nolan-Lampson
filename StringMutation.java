import java.util.*;


/**
 * Play with Strings
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMutation
{
    public static void main(String[] args)
    {
      String phrase= new String("Change is inevitable");
      System.out.println(phrase);
      int phraseLength = phrase.length();
      System.out.println("Length of Phrase =" + phraseLength);
      String mut1, mut2, mut3, mut4;

       mut1 = phrase + ", except from vending machines.";
       System.out.println(mut1);
       System.out.println("Length of mut1 =" + mut1.length());

       mut2 = mut1.toUpperCase();
       System.out.println(mut2);

       mut3 = mut2.replace('E", "X"');
       System.out.println(mut3);
       System.out.println("Length of mut3 =" + mut3.length());

int num = 123;
double result = num % 100 / 10;
System.out.println(result); 


    }
}
