package week1.healthprofile;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1Main {

   public static void main(String[] args) {
	   //initialize our variables
       int age;
       double feet, inches, weight;
       //new scanner
       System.out.println("Start of code");
       Scanner sc=new Scanner(System.in);
       System.out.println("Start of code 1" );
       
       // loop until user gives us an 'X'
       String name = "";
       System.out.print("Start of code 2" );
       
       while( true ) {
           System.out.print("Enter name or X to quit: ");
           name = sc.nextLine();
          
           if( !name.equalsIgnoreCase("X") ) {
        	 //create an object for HealthProfile
               HealthProfile hp=new HealthProfile();
               
               System.out.print("Enter your age: ");
               age=sc.nextInt();
               System.out.print("Enter your weight: ");
               weight=sc.nextDouble();
               System.out.print("Enter your height in feet: ");
               feet=sc.nextDouble();
               System.out.print("Enter your height in inches: ");
               inches=sc.nextDouble();
               hp.setName(name);
               hp.setAge(age);
               hp.setWeight(weight);
               hp.setHeight(feet, inches);

               double bmi=hp.getBMI();
               DecimalFormat df=new DecimalFormat("0.0");
               System.out.println("Health Profile for "+hp.getName());
               System.out.println("BMI: "+ df.format(bmi));
               System.out.println("BMI Category: "+hp.getCategory(bmi));
               System.out.println("Max heart rate: "+hp.getMaxHR());
               sc.nextLine();
           }
           else {
        	   break;
           }
       }
   }
}