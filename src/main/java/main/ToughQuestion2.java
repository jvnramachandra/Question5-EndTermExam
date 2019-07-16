package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestions2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        int tcal;
                        float tenergy;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	tcal = cal.calculateCalories(bread);
                        	tenergy = cal.calculateEnergy(tcal);
                        	System.out.printf("%.3f",tenergy);
                            System.out.println(" kJ of energy generated from "+tcal+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	tcal = cal.calculateCalories(bread,jam);
                        	tenergy = cal.calculateEnergy(tcal);
                        	System.out.printf("%.3f",tenergy);
                            System.out.println(" kJ of energy generated from "+tcal+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	tcal = cal.calculateCalories(bread,jam,butter);
                        	tenergy = cal.calculateEnergy(tcal);
                        	System.out.printf("%.3f",tenergy);
                            System.out.println(" kJ of energy generated from "+tcal+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            int calculateCalories(int bpiece) {
            //you have to overload this function for three parameters refer the question
            	int breadcal = 74;
            	int tcal = breadcal * bpiece;
            	//calculateEnergy(tcal);
            	return tcal;
            }
            int calculateCalories(int bpiece,int jpiece) {
                //you have to overload this function for three parameters refer the question
            	int breadcal = 74, jamcal = 26;	
            	int tcal = (bpiece * breadcal) + (jpiece * jamcal);
            	//calculateEnergy(tcal);
            	
                return tcal;
            }
            int calculateCalories(int bpiece,int jpiece,int btrpiece) {
                //you have to overload this function for three parameters refer the question
            	int breadcal = 74, butcal = 102, jamcal = 26;
            	int tcal = (bpiece * breadcal) + (jpiece * jamcal) + (btrpiece * butcal);
            	//calculateEnergy(tcal);
                return tcal;
            }
            
            float calculateEnergy(int tcal){
            	float energy = (float) (tcal * 4.18680);
				return energy;
            	
            }
            
            
            
}