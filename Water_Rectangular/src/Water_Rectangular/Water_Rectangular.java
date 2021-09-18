package Water_Rectangular;

/*This class is the implementation class. 
  In order to find the maximum rectangular area, we should consider two cases as follows.
  1) when the second height is smaller than the first height.
  2) when the first height is smaller than the second height. */

public class Water_Rectangular {
    public int Rectangular (int[] userValues){

        int rectangular = 0; //The initialization of the rectangular area.
        int first_height = 0; //The first height: start from the first element in the array.
        int second_height = userValues.length-1; //The second height: start from the last element in the array. 

        while(first_height<second_height){

            if(userValues[second_height]<userValues[first_height]){ //Case 1: when the last element is smaller than the first element,
                //we calculate the rectangular area with the smaller height (in this case, the second height) because the area is limited by the smaller value.
                rectangular = Math.max(rectangular,userValues[second_height]*(second_height-first_height));
                second_height = second_height -1; //Move onto the next last element to find the maximum second height.

            }else{ //Case 2: when the first element is smaller than the last element,
                //we calculate the rectangular area with the smaller height (in this case, the first height) because the area is also limited by the smaller value.
                rectangular = Math.max(rectangular,userValues[first_height]*(second_height-first_height));
                first_height = first_height +1; //Move onto the next first element to find the maximum first height.
            }

        }
        return rectangular;
    }
}//Water_Rectangular
