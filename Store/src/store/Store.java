//** Create a class that models a GroceryItem
//For our class GroceryItem model, we will say that each one has a name (String), selling price (double) and may have an expiration date (String)
//Create the class with the following functions:
//Set/get methods for each property
//1 default and 2 other constructors of your choice – determine your own default values as you see fit
//1 predicate method to see if the GroceryItem is expensive (defined as the selling price is greater than a given price)
//Next, write a main program that creates at least 2 GroceryItem objects and tests all functions designed
package store;


public class Store 
{
    

    
    public static void main(String[] args) 
    {
        Data item1 = new Data("Kitty Food",2.99);
        Data item2 = new Data("Large Family Pie",12.99);
        System.out.println("The Kitty food: $2.99 is...");
        if (item1.isExpensive())
            System.out.println("Expensive!");
        else 
            System.out.println("Cheap!");
        
        System.out.println("The Large Family Pie: $12.99 is...");
        if (item2.isExpensive())
            System.out.println("Expensive!");
        else 
            System.out.println("Cheap!");
    }
    
}
