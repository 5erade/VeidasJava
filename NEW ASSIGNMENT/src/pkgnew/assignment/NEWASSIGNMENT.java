 //Exercise four: Calculating sales exercise 
       //in the book (5.17 in 9th edition
       //
       //An online retailer sells five products
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
     
package pkgnew.assignment;
import java.util.Scanner;

public class NEWASSIGNMENT 
{

  
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     
     int product=0;
     int quantity=0;
     double total=0;
     int one=0;
     int two=0;
     int three=0;
     int four=0;
     int five=0; 
     System.out.println((char)27 + "[35;49m" + "Hello! Welcome to The Zone.");
     
     System.out.println((char)27 + "[35m" + "Where you can get all your day to day items.");
     System.out.println((char)27 + "[37;47m" + "Enter -1 to end the shopping experience.");
        
     while (product != -1 && quantity != -1)
        
        {
            System.out.println("\n\"Items for Sale Today!\":"); 
         
            System.out.println( 
"           1)Mouse.......:($2.98)\n" +
"           2)Human Ear...:($4.50)");
            System.out.println((char)27 + "[32;49m" +
"           3)Green Potion:($9.98)");
            System.out.println((char)27 + "[30;49m" +
"           4)Orb of POWER:($4.49)\n" +
"           5)Aaron.......:($6.87) ");
            
            System.out.println("\nEnter the corresponding number next to the item desired stranger: " +(char)27 + "[35m"); 
            product = input.nextInt();
            if (product == -1)
                continue;
            System.out.println("Enter the quantity of the item you desire starnger: ");
            quantity = input.nextInt();
            if (quantity == -1)
                continue;
            switch (product)
            {
             case(1):
             total = total + quantity * 2.98;
             one = one + quantity;
             break;
             case (2):
             total = total + quantity * 4.50;
             two = one + quantity;
             break;
             case(3):
             total = total + quantity * 9.98;
             three = three + quantity;
             break;
             case(4):
             total = total + quantity * 4.49;
             four = four + quantity;
             break;
             case(5):
             total = total + quantity * 6.87;
             five = five + quantity;
             
             
            }
        }
        System.out.println(
                "\nItems in Cart:"
                + "\nMouse.........."+ one
                + "\nHuman Ear......" + two);
        System.out.println((char)27 + "[32m" 
                + "Green Potion..." + three);
        System.out.println(
                 "Ord of Power..." + four
                + "\nAaron.........."+ five + "\n");
        System.out.printf((char)27 + "[35m" + "Your total will be : $%,.2f ", total);
        System.out.println("\nClick next to check out.");
    }
    
}
