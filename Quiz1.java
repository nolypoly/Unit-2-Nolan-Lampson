public class Quiz1 {
  public static void main (String[] args) {
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";

    String firstInit = firstName.substring(0,1);
    String middleInit = middleName.substring(0,1);
    String lastInit = lastName.substring(0,1);

    String Init = firstInit + middleInit + lastInit;
    System.out.println("" + Init.toLowercase() + "");
  }
}
