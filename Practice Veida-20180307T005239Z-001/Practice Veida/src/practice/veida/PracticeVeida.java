
package practice.veida;
import java.util.Scanner;



public class PracticeVeida 
{

 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number.");
        
        int userInput;
        int counter = 1;
        int result = 0;
        
        userInput = input.nextInt();
        
        while (counter <= userInput  )
        {
            result = result + counter++;
        }
          if (userInput > 100)
        {
            System.out.println("ERROR While LOOP: Input was greater than 100.");
        }
        else if (userInput <= 100)
        {
            System.out.println("The triangle number for While Loop is " + result );
        }
        
        
        result = 0;
        counter = 1;
        do
        {
            result = result + counter++;
        }while (counter <= userInput);
       
         if (userInput > 100)
        {
            System.out.println("ERROR Do Loop: Input was greater than 100.");
        }
        else if (userInput <= 100)
        {
            System.out.println("The triangle number for Do Loop is " + result );
        }
        
         result = 0;
         for(int c = 1; c <= userInput;c++)
         {
             result = result + c;
         }
           if (userInput > 100)
        {
            System.out.println("ERROR Four loop: Input was greater than 100.");
        }
        else if (userInput <= 100)
        {
            System.out.println("The triangle number for Four Loop is " + result );
        }
        
        System.out.println("You're Welcome");
        
        
    
    
    
    
    }
    
}
