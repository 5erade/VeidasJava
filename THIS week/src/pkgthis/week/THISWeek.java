
package pkgthis.week;
import java.util.Random;
import java.util.Scanner;


public class THISWeek 
{

    public static int roll()
    {
        Random generator = new Random();
        
        return generator.nextInt(6) + 1;
        
    }
    public static void main(String[] args) 
    {
        //Write a program that simulates rolling
        //a 6 sided die 6,000,00 times
        //each roll we will keep track of the number of times a give number
        //appears. When the simulation
        //is done, we show the number of times
        //each value appeared
        
        //only the final result will appear when 
        //we run the simulation
        
        // one thing we need to do is how to simulate rolling a die
        //in this case this means generating a random number
        //from 1-6
        
        //For  one to sixmillion 
        //  "roll the die"
        //   store number in result
        //  tally the results
        //  Print the results of the tallies
        
        int tally1 = 0;
        int tally2 = 0;
        int tally3 = 0;
        int tally4 = 0;
        int tally5 = 0;
        int tally6 = 0;
        
        
        Scanner Input = new Scanner(System.in);
        
        int  result;
        
        for (int c =0; c < 600000; c++ )
        {
            result = roll(userInput);
            //Tally the results design:
            //If result is1, add 1 to tally1
            //else if result is 2, add 1 tot ally 2
            //etc
            
           // if (result == 1)
            //    tally1++;
           // else if (result == 2)
             //   tally2++;
             
             switch (result)
             {
                 case 1:
                     tally1++;
                     break;
                 case 2:
                     tally2++;
                     break;
                 case 3:
                     tally3++;
                     break;
                 case 4:
                     tally4++;
                     break;
                 case 5:
                     tally5++;
                     break;
                 //case 6:
                     //tally6++;
                     //break;
                     //if there is any thing else add it to tally 6
                     //what default mean
                 default:
                     tally6++;
                     break;
                     //System.out.println("The die broke in half!");
                    // break;
             }
                     
        }
        int Totalroll = tally1 + tally2 + tally3+ tally4 + tally5 + tally6;
        
        System.out.printf("1: %d\n", tally1);
        System.out.printf("2: %d\n", tally2);
        System.out.printf("3: %d\n", tally3);
        System.out.printf("4: %d\n", tally4);
        System.out.printf("5: %d\n", tally5);
        System.out.printf("6: %d\n", tally6);
        
        System.out.printf("Total rolls: %d\n", Totalroll );
        
        //Exercise five:
        //
        //
        //
     
        
    }
    
}
