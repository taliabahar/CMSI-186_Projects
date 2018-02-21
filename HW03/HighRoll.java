/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighRoll.java
 *  Purpose       :  Demonstrates the use of input from a command line for use with Yahtzee
 *  Author        :  B.J. Johnson
 *  Date          :  2017-02-14
 *  Author        :  Talia Bahar
 *  Date          :  2018-02-20
 *  Description   :  Textual User Interface to display every option
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-02-14  B.J. Johnson  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HighRoll{

   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to HighRoll!! \n" );
      System.out.println( "\n   Enter the amount of die and number of sides you want the die to have \n" );
      System.out.println( "     Press the 'q' key to quit the program." );


      BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
      String inputLine = "";
      try {
         inputLine = input.readLine();
         String values[] = inputLine.split(" ");
         DiceSet dset = new DiceSet(Integer.parseInt(values[0]),Integer.parseInt(values[1]));
         }
         catch( IOException ioe ) {
            System.out.println( "Caught IOException" );
         }


      while( true ) {
        //  System.out.println( "\n You are rolling " + Integer.parseInt(values[0]) + " dice with " +  Integer.parseInt(values[0]) + " sides" \n" );
        //  System.out.println( "  You are rolling " + inputLine.charAt(0) + " dice with " +  inputLine.charAt(2) + " sides");
         System.out.println( "\n Press 1 to ROLL ALL THE DICE \n" );
         System.out.println( "\n Press 2 to ROLL A SINGLE DIE \n" );
         System.out.println( "\n Press 3 to CALCULATE THE SCORE FOR THIS SET  \n" );
         System.out.println( "\n Press 4 to SAVE THIS SCORE AS HIGH SCORE  \n" );
         System.out.println( "\n Press 5 to DISPLAY THE HIGH SCORE \n" );
         System.out.println( "\n ENTER 'Q' TO QUIT THE PROGRAM \n" );

         System.out.print( ">>" );
         inputLine = null;

         try {
            inputLine = input.readLine();
            if(1 == inputLine.charAt(0)) {
              System.out.println("1");
            }
            if(2 == inputLine.charAt(0)) {
              System.out.println("2");
            }
            if(3 == inputLine.charAt(0)) {
               System.out.println("3");
            }
            if(4 == inputLine.charAt(0)) {
               System.out.println("4");
            }
            if(5 == inputLine.charAt(0)) {
               System.out.println("5");
            }
            if( 'q' == inputLine.charAt(0) ) {
               break;
            }
         }
         catch( IOException ioe ) {
            System.out.println( "Caught IOException" );
         }
      }
   }
}
