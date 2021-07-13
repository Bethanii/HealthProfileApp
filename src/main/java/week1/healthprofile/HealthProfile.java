package week1.healthprofile;

public class HealthProfile {
	   //variable declaration
	   String name;
	   int age;
	   double weight, height;
	   //set name
	   public void setName(String Name)
	   {
	       name=Name;
	   }
	   //return name
	   public String getName()
	   {
	       return name;
	   }
	   //get age
	   public void setAge(int Age)
	   {
	       age=Age;
	   }
	   //return age
	   public int getAge()
	   {
	       return age;
	   }
	   //set weight
	   public void setWeight(double Weight)
	   {
	       weight=Weight;
	   }
	   //return weight
	   public double getWeight()
	   {
	       return weight;
	   }
	   //set height
	   public void setHeight(double Feet, double Inch)
	   {
	       height=(Feet*12)+Inch;
	   }
	   //return height
	   public double getHeight()
	   {
	       return height;
	   }
	   //return bmi
	   public double getBMI()
	   {
	       double bmi;
	       bmi = (weight * 703) / (height * height);
	       return bmi;
	   }
	   //get category
	   public String getCategory(double BMI)
	   {
	       if(BMI<18.5)
	           return "Underweight";
	       else if(BMI>=18.5 && BMI<25)
	           return"Normal";
	       else if(BMI>=25 && BMI<30)
	           return "Overweight";
	       else
	           return "Obese";
	   }
	   //get max heart rate
	   public int getMaxHR()
	   {
	       return (220-age);
	   }
}
