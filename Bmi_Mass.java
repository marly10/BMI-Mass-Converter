/*
Ricky McKenzie
Lab-CSC1043
*/

//importing entire Java scan library so user can input data
import java.util.*;

//importing decimal library to format decima
import java.text.DecimalFormat;

public class Bmi_Mass
  {
 
   public static void main(String [] args) {
      //Decalration of constructor with own class and variable to later be used with in the body of the program
      DecimalFormat format = new DecimalFormat("0.0000");
      Random random = new Random();
      Scanner read = new Scanner(System.in);
      
      //User inputs height in a string var.
      System.out.print( "Please enter the height of the patient (ex: 5'6\"): ");
      String height_string = read.next();
      
      //User inputs weight in a string var.
      System.out.println( " What is the weight of the individual?");
      int weight = read.nextInt();
      
      //finding the index on single and double quote(location of where they exist with in the string data)
      int single_quote = height_string.indexOf('\'');
      int double_quote = height_string.indexOf('\"');
      
      //puts the actual number string inputed, into a tangible variable for preparion to parse the number for mathematical compute
      String feet = height_string.substring(0, single_quote);
      String inches = height_string.substring(2, double_quote);
      
      //Parses the feet and inch inputed as a string by user. Using the parseInt() method
      int parse_feet = Integer.parseInt(feet);
      int parse_inches = Integer.parseInt(inches);
      
      //Converts feets to inches for better handle
      int feet_convert = parse_feet * 12 + parse_inches ;
   
      //Math formula to get BMI using the inputed/computed data by user   
      double data_result = weight * (703) / Math.pow(feet_convert, 2);
      
      //Declaring the random feet to be shown and computed between 3 and 7 feetint ran_feet = random.nextInt(4) + 4 ;
      
      //Randomizes feets output. To show the final output between 3 and 7 feet                     
      int feet_start = 3, feet_end = 7;
      int random_feet = random.nextInt(feet_end - feet_start + 1) + feet_start ;
      
      //Randomizes inches output. To show the final output between  0 and 11   
      int inches_start = 0, inches_end = 11;
      int random_inches = random.nextInt(inches_end - inches_start + 1) + inches_start ;
      
      //Randomizes weight output. To show the final output between 100 and 399 pounds 
      int weight_start = 100, weight_end = 399;
      double random_weight = random.nextInt(weight_end - weight_start + 1) + weight_start ;
      
      //Converts random feet size to inches 1*12;
      int random_feet_convert = random_feet * 12 + random_inches ;
      
      //Math formula to get BMI using the randomized data by program for a computational output, with a static Math class.  
      double random_result = random_weight * (703) / Math.pow(random_feet_convert, 2);
     
      //System output/print for the inputed data by user
      System.out.print("The patient's BMI is " + format.format(data_result) +"\n" );  
  
      //System output/print for the randomized data by machine
      System.out.println("Your random client is " +  random_feet + " feet and " + random_inches +" inches\n" +  
                        "Your random client weighs " + random_weight +
                        "\nThe random client's BMI is " + format.format(random_result));    
       }} 
 
