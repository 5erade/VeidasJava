/*Create a program that simulates a weekly meeting reservation system. This project is broken up into 4 parts.

Part 1: Basic requirements (5 points):

1)	The program shall allow the user to select from the following options:
a.	Create a new meeting
b.	Show meetings for the week
c.	Clear meetings for the week
2)	Each meeting has a subject, day of the week, start time and end time
a.	Subject is a short text description of the meeting
b.	Day of the week is a number from 1 to 7 (day 1, day 2, …, day 7)
c.	Start time are numbers simulating military time. For example, 9:30am would be 930, 1:15pm would be 1315.
        The range for time is from 0 to 2359
3)	When the user wants to create a new meeting, the program asks for the subject, 
        day of the week, start and end times for it and adds it to the weekly calendar
a.	Meetings are not allowed to overlap. For example, if a meeting is already scheduled to start at 1400
        and end at 1530, a new meeting scheduled from 1300 to 1430 would not be allowed
b.	Meetings are not allowed to go into the next day. For example, if a user attempted to start a
        meeting at 2330 and end at 200, that meeting would not be allowed
4)	When the user wants to show all meetings for the week, the report displays all meetings each day as follows
a.	Show each day of the week from 1 to 7
b.	For each day, show all meetings scheduled and the total number of meetings for that day
c.	At the end of the report, show the total number of all meetings for the week
5)	When the user wants to clear meetings for the week, all meetings scheduled are deleted
6)	The user can do any of these options at any time until they want to exit the program

Technical requirements:

A.	You must have at least one array
B.	Assume the user will enter data correctly with valid start and end times
*/
package project;
import java.util.Scanner;

public class Project 
{

  public static void printMenu()
  {
     
        System.out.println("Hello!");
        System.out.println("Welcome to the Organizer");
        System.out.println("Menu:");
        System.out.println("(1)Creat New Meeting ");
        System.out.println("(2)Show Meetings for the Week");
        System.out.println("(3)Clear Meetings for the Week");
        System.out.println("Enter option:"); 
  }
    
    public static void main(String[] args) 
      {
        
        
        int option;
        int numberOfMeetings = 0;
       Mini[] day = new Mini[100];
        
    
        
        Scanner input = new Scanner(System.in);
        
        do
        {
            printMenu();
            option = input.nextInt();
            input.nextLine();
            
            switch(option)
            {
                case 1:
                    // Add meeting
                   System.out.print("Subject: ");
                   String subject = input.nextLine();
                   System.out.print("Priority: ");
                   String priority = input.nextLine();
                   System.out.print("Day of the week(Ex.Day 1 = Monday or Day 7 = Sunday): ");
                   int numberday = input.nextInt();
                   System.out.print("Start Time: ");
                   int startt = input.nextInt();
                   System.out.print("End Time: ");
                   int endt = input.nextInt();
                   
                   day[numberOfMeetings++] = new Mini(subject, priority, numberday, startt, endt);
                    break;
                case 2:
                    // Display meetings
               for(int c = 0; c < numberOfMeetings; c++)
                        System.out.println(day[c]);
               if (0 > numberOfMeetings)
               {
                   System.out.println("Empty");
               }
               
             
                    break;
                case 3:
                    // Remove all Meetings
                    System.out.println("Are you sure you want to remove all meetings?");
                    System.out.println("Enter 1 to delete or 2 to return to menu");
                    int userNumber;   
                    userNumber = input.nextInt();
                     int yes = 1;
                     int no = 2;
                         
                 
                    if (userNumber == 1)
                            {
                                //for loop clearing each day
                                //record number of meetings and check
                                //if scheduled amount is 0, then
                                //print "No meetings Scheduled"
                                day = null;
                                
                                break;
                            }
                    else
                    {
                        break;
                    }
                    
                    
                case 4:
                   //Return to menu
                    break;
                default:
                   
                    break;
            }
        } while (option != 4);
    }
    
}