/*
Filename:   Horoscopes.java
Author: Jenna
Date:   2/19/19

Program which prompts the user to choose a month and outputs each horoscope sign for the specific months.
*/
import java.util.Scanner;

public class Horoscope 
{
    public static void main(String[] args)
    {
        String response;
        Scanner kbd = new Scanner(System.in);
     
        System.out.println("Choose a Month to recieve your Horoscope: ");
        response = kbd.nextLine();
        printMonth(response);
    }

    public static void printMonth(String response)
    {
        switch(response)
        {
            case ("JANUARY"):   {System.out.println("You chose " + response + " Month of the Capricorn (Dec 22nd-Jan 19th) you are Strong, HardWorking, and Wise!");
                            break;}

            case ("FEBRUARY"):  {System.out.println("You chose " + response + " month of the Aquarius(Jan 20th-Feb 18th) you are highly Independant, Popular, Click-Group oriented.");
                            break;}

            case ("MARCH"):     {System.out.println("You chose  " + response + " month of the Pisces(Feb 19th-Mar 20th) you are Creative, Insecure, and Compassionate.");
                            break; }

            case ("APRIL"):     {System.out.println("You chose " + response + " month of the Aries(Mar 21-April 20th) you are Agressive, Impatient, and Born to be #1.");
                            break;}

            case ("MAY"):       {System.out.println("You chose  " + response + " month of the Taurus(April 20st-May 20th) you are Luxurious, Enjoy Peace, and Stubborn in a good way.");
                            break;}

            case ("JUNE"):      {System.out.println("You chose " + response + " month of the Gemini(May 21st-June 20th) you are a Busy Body, Chatter Box, and Emotional.");
                            break;}

            case ("JULY"):      {System.out.println("You chose " + response + " month of the Cancer(Jun 21st-July 22nd) you are Sensitive, Enjoy Comforting things, and you're a Mommys boy/girl.");
                            break;}

            case ("AUGUST"):    {System.out.println("You chose " + response + " month of the Leo(July 23rd-Aug 22nd) you are Dramatic, Bright Spirited, and have a Huge Heart.");
                            break;}

            case ("SEPTEMBER"): {System.out.println("You chose " + response + " month of the Virgo(Aug 23rd-Sept 22nd) you are Intellectual, Great Listener, and a Perfectionist.");
                            break;}

            case ("OCTOBER"):   {System.out.println("You chose " + response + "  month of the Libra(Spet 23rd-Oct 22nd) you are Bold, Charming, and a Social Butterfly.");
                            break;}

            case ("NOVEMBER"):  {System.out.println("You chose " + response + " month of the Scorpio(Oct 23rd-Nov 21st) you are Mysterious, Sensitive, and Emotoinally Intense.");
                            break;}

            case ("DECEMBER"):  {System.out.println("You chose " + response + " month of the Sagittarius(Nov 22nd-Dec 21st) you are Motivation Driven, Love Laughs, and Open-Minded.");
                            break;}

            default:    System.out.println("Sorry that is an invalid entry. Try again");
        }
    }
}
      