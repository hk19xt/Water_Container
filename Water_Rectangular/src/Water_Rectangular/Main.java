package Water_Rectangular;

/* This is the main class. 
   Users can change the input values in the hardcoded line.
   This program is to find the maximum rectangular area by calculating the first height multiplied by the second height.
   Author: Hyejin Kim
   Date: 9/18/2021
*/
public class Main {
    
    public static void main(String[] args){
        
        int[] userValues = {8,3,2,6,4,5,1,8,2}; //Users can change the input values here.
      
        int output = 0;
        
        Water_Rectangular WR = new Water_Rectangular();
        output = WR.Rectangular(userValues);
        System.out.println("The maximum contationer will be :" + output);
    }
}//Main
