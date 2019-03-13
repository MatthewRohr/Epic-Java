
/**
 * beeeeeeeeeeeeeeeeef
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
   public static final String SECRET_PASSWORD = "BOOLEAN";
   
   
   static String obfuscate(String input) 
    {   
    return input.replace('B', 'Z').replace('E', '3');
    }
   public static void main(String [] args)
   {
      if (args.length != 1)
      {
         System.out.println("Wrong! You to run this program with one argument:\njava Reverse <argument>");
         return;
      }
      
      if(args[0].equals(obfuscate(SECRET_PASSWORD)))
      {
          System.out.println("You win! EPIC!");
      }
      else
      {
          System.out.println("Wrong password. Try again hacker.");
      }
   }
}
