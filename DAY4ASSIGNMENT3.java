  
Q.No.1 


package com.collections;

class studentdetials{
 
 public static void cal_sum(String[] name,int[] age){
  
//   String sum = 0;
    
     for (int i=0;i<5;i++){
      System.out.println(  age[i]+""+name[i]);
     }
    
   }


  
 
 
}
public class arrays {
 
 public static void main(String[] args) {
  studentdetials sd= new studentdetials();
  String[] name= {"sravan","kumar","ashok","suresh","sunny"};
   int[] age = {23,32,43,12,43};
   
   sd.cal_sum(name,age);
   
 }

 

}

______________________________________________________________________________________________________________________________________________________________________________


Q.No.2


public class OddPosition {
	public Static Void main(String[] args) {
// intialize array 
	int[] arr = new int[] {1,2,3,4,5};
	System.out.println("Elements of given array present on odd position");
// Loop through the array by incrementing value of i by 2
	for(int i = 0; i < arr.lenght; i = i+2) {
	Syste.out.println(arr[i]);
	}
     }
}


______________________________________________________________________________________________________________________________________________________________________________



Q.No.3


package com.collections;
import java.util.Arrays;
import java.util.Scanner;

class display{
 
 public static void print(int[] age){
  
  int sum = 0;
    
     for (int i=0;i<5;i++){
    sum +=age[i];
    
     }
     System.out.println("sum of total:" +sum);
    
   }


  
 
 
}
public class addation {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the length of the array:");
       int length = s.nextInt();
       int [] myArray = new int[length];
       System.out.println("Enter the elements of the array:");

       for(int i=0; i<length; i++ ) {
          myArray[i] = s.nextInt();
       }
     display sd= new display();
       //System.out.println(Arrays.toString(myArray));
       sd.print(myArray);
    }
}