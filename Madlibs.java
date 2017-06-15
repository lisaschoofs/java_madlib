import java.io.Console;

public class Madlibs {

  public static void main(String[] args) {

    Console console = System.console();

    // String response = console.readLine("Would you like to do a Madlib? Yes or No:  ");
    String ageAsString = console.readLine("How old are you?  ");
    int age = Integer.parseInt(ageAsString);

    if (age >= 13) {
    // if (response.equalsIgnoreCase("YES")) {
      String name = console.readLine("Enter a name:  ");
      String place = console.readLine("Enter a place:  ");
      String food = console.readLine("Enter a food:  ");
      String verb = console.readLine("Enter a verb ending with -ing:  ");

      console.printf("Your MadLib:\n-------------------\n");
      console.printf("%s went to %s.  \n", name, place);
      console.printf("They had a great time eating %s.\n", food);
      console.printf("Then, they went %s... it was exhausting.\n", verb);
      console.printf("The End!\n");

    } else {
      console.printf("Ok, Bye!");
      System.exit(0);
    }

  }
}
