import java.util.Scanner;
public class Store{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double BOOKS = 9.0;
        final double MOVIES = 13.97;
        final double NUTS_PER_POUND = 1.72;
        final double BOOK_SHIP = 0.95;
        final double MOVIE_SHIP = .04;
        final double NUT_SHIP_POUND = 0.30;
        final double TAX = 0.072;

        System.out.println ("Enter number of books ordered:");
        double totBook = scan.nextDouble();
        System.out.println ("Enter number of movies ordered:");
        double totMovie = scan.nextDouble();
        System.out.println("Enter amount of peanuts (pounds) ordered:");
        double totNutPound = scan.nextDouble();

        double book$ = (totBook * BOOKS);
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Book Price: " + fmt.format(book$));
        double movie$ = (totMovie * MOVIES);
        System.out.println("Movie Total Price: " + movie$);
        double nut$ = (totNutPound * NUTS_PER_POUND);
        System.out.println("Nuts Total Price: " + nut$);

        System.out.print("Total shipping cost: ");
        System.out.print(fmt.format((book$* BOOK_SHIP) + (movie$ * totMovie))+"\n");

        System.out.println("Tax: " + fmt.format((book$ + movie$) * TAX));


        System.out.println("");
      }

}

      }

}
