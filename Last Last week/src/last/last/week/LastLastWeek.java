
package last.last.week;
import java.util.Scanner;




public class LastLastWeek 
{

    public static void main(String[] args) 
    { 
    //Write a program that takes a test score from 1-10
    //and prnts the letter grade based on the score:
        //A:9 or 10
        //B:8
        //C:7
        //D:6
        //F:5-1
        
     //Repeat the process 3 times
        
    Scanner input = new Scanner(System.in);
    int score;
    // logically c=1; c <=3 works
    for (int c = 0; c < 3; c++)
    {
        System.out.println("Enter test score: ");
        score = input.nextInt();
       
        /*
        //or score >= 9 works
        if (score == 9 || score == 10)
            System.out.println("A");
        else if (score == 8)
            System.out.println("B");
        else if (score == 7)
            System.out.println("C");
        else if (score == 6)
            System.out.println("D");
        else
            System.out.println("F");
        //This code has a pattern that contains 2 elements:
        //1) In each if/else statment they all test the same variable and it is an int
        //2) Each test if looking for equality on a speciffic integer value (s)
        
        //When this pattern occurs, you can use a "switch" statment
        //Instead of the if/else if chain
       /*
        
        */
       switch(score)
       {
           case 12:
           case 11:
           case 10:
               System.out.println("Grade: A");
               break;
           case 9:
               System.out.println("Grade: A");
               break;
           case 8:
               System.out.println("Grade: B");
               break;
           case 7:
               System.out.println("Grade: C");
               break;
           case 6:
               System.out.println("Grade: D");
               break;
                       
           default:
               System.out.println("Grade: F");
       }
       //The switch statment acts as another form of a specialized
       // if/else of statment. Within each "case"' the code supporting 
       // it emds with a "break"
       
       //break formally means exit the 
       //body of code you are in.
       //case the break means exit
       //switch statement at the point
       
       //This casm also apply too loops
       
       // Write a program that print number from 1 to 10 but stops 
       //at a number given by the user
       
       
    }
    
     System.out.println("What number would you like to stop at? Enter:");
      // int stopNumber = input.nextInt();
       // or fix ( int c=1; c<= 10 && c <= stopNumber;c++)
       //then get rid of if and the break
       
       //AN EXAMPLE
       //boolean x = true;
       //While (x)
       //{ if (...)
       //breal }
       int skipNumber = input.nextInt();
       
       for (int c=1; c <=10; c++) 
       {
           // can fix ( c > stopNumber)or
           //move System.out.println(c); to the top of if
          /* if (c == stopNumber)
               break;
           System.out.println(c);
           
           */
           
           if (c == skipNumber)
           {   System.out.println("Skipping: " );
               continue;
           
           }
           System.out.println(c);

       }

       //Exercise four: Calculating sales exercise 
       //in the book (5.17 in 9th edition
       //
       //An online retailer sells five
       //whose retail prices as follows:
       //
       //Product1, $2.98
       //Product2, $4.50
       //Product3, $9.98
       //Product4, $4.49
       //Product5, $6.87
       
       //write a program that reads a series of pairs
       //of number as follows:
       
        //Produc number 
       //Quantity Sold
       
       //Your program should use a switch statment to
       //determine the retail price for each product
       //It should calculate and display the total retail value of all product sold
       //use a loop to determine when the program
       //should stop looping and display the final result 
       //be super creative
     
      
       //
       //
       
          
          
                  
       
    }
    
}
