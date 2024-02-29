//********************************************
// Name:            Mustafa Mohammednafia
// Date:            9/17/2018
// Instructor:         Cindy Tucker
//********************************************
import java.util.Scanner;

        public class starsConcerts {
            public static void main (String[] args) {
               
        int month;                                                              //Declaring integer variable month
        
        Scanner scnr = new Scanner (System.in);

        System.out.println("Enter the concert month:");
        month = scnr.nextInt();                                                 //Getting input for "month" from user
        
        System.out.println("Welcome to SuperStars Resort");                     //Messages displaying for user
        System.out.println();
        System.out.println("We are delighted you are interested in our concert series.");
        System.out.println("The concerts list you requested includes:");
        System.out.println();
        
        switch (month) {                                                        //Using switch statements to provide choices for the user
            case 1:
            System.out.println("\t" + ("January concerts:") + "\n" + "\t" + "\t" + ("January 4 – METALLICA") + "\n" + "\t" + "\t" + ("January 31 – CHER"));
            case 2:
            System.out.println("\t" + ("February concerts:") + "\n" + "\t" + "\t" + ("February 1 – Delbert Mcclinton") + "\n" + "\t" + "\t" + ("February 11 – INTERPOL"));
            case 3:
            System.out.println("\t" + ("March concerts:") + "\n" + "\t" + "\t" + ("March 10 – PINK") + "\n" + "\t" + "\t" + ("March 13 – David Bowie") +
            "\n" + "\t" + "\t" + ("March 29 - Kelly Clarkson"));
            case 4:
            System.out.println("\t" + ("April concerts:") + "\n" + "\t" + "\t" + ("April 20 – Under The Streetlamp") + "\n" + "\t" + "\t" + ("April 26 – Branford Marsalis"));
            case 5:
            System.out.println("\t" + ("May concerts:") + "\n" + "\t" + "\t" + ("May 11 – Gladys Knight") + "\n" + "\t" + "\t" + ("May 13 – ABBA"));
            case 6:
            System.out.println("\t" + ("June concerts:") + "\n" + "\t" + "\t" + ("June 6 – CMA Music Festival") + "\n" + "\t" + "\t" + ("June 20 – Brian Wilson"));
            case 7:
            System.out.println("\t" + ("July concerts:") + "\n" + "\t" + "\t" + ("July 7 – Aerosmith") + "\n" + "\t" + "\t" + ("July 20 – Justin Bieber"));
            case 8:
            System.out.println("\t" + ("August concerts:") + "\n" + "\t" + "\t" + ("August 2 – Shawn Mendes") +
            "\n" + "\t" + "\t" + ("August 14 – Nicki Minaj") + "\n" + "\t" + "\t" + ("August 24 - Ariana Grande"));
            case 9:
            System.out.println("\t" + ("September concerts:") + "\n" + "\t" + "\t" + ("September 13 – 50 Cent") + "\n" + "\t" + "\t" + ("September 27 – Carrie Underwood"));
            case 10:
            System.out.println("\t" + ("October concerts:") + "\n" + "\t" + "\t" + ("October 7 – Austin Mahone") + "\n" + "\t" + "\t" + ("October 15 – Drake"));
            case 11:
            System.out.println("\t" + ("November concerts:") + "\n" + "\t" + "\t" + ("November 11 – The Beach Boys") + "\n" + "\t" + "\t" + ("November 20 – Jim James"));
            case 12:
            System.out.println("\t" + ("December concerts:") + "\n" + "\t" + "\t" + ("December 9 – Andrew Peterson") +
            "\n" + "\t" + "\t" + ("December 13 – Handel's Messiah") + "\n" + "\t" + "\t" + ("December 23 - Miley Cyrus"));
            
            break;                                                      //Break to seperate the cases from the default
            
            default:                                                    //default message if user input invalid value
            System.out.println("Error");
        }
    }
}

            
        


