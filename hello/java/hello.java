package hello.java;

/*public class hello {
	public static void main(String[] args) {
		System.out.println("hello world 'WELCOME'");
	}

}*/

import java.util.Scanner;
public class hello {
    public static void main (StringBuffer[] args){
        
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter the numbers:");
    byte count;
    count = obj.nextByte();
    int arr[] = new int[count];
        
    for(int ctr=0; ctr< count; ctr++){
            
        arr[ctr]=obj.nextInt();
           
        }
        	
        	
        //check the number is positive or negative
        for(int ctr=0; ctr< arr.length; ctr++){
            
        
        if(arr[ctr]>0){
            System.out.println(arr[ctr] + "Is a positive number");
            
//            if(arr[ctr]%7 == 0){
//                System.out.println(arr[ctr]+ "The number is also divisible by 7");
//                
//            }
//            else{
//                System.out.println(arr[ctr]+ "The number is not divisible by 7");
//            }
        } 
        
        else{
            System.out.println(arr[ctr] + "Is a negatie number");
            
//            if(arr[ctr]%7 == 0){
//                System.out.println(arr[ctr]+ "The number is also divisible by 7");
//                
//            }
//            else{
//                System.out.println(arr[ctr]+ "The number is not divisible by 7");
//                
//            }
        }
        
        System.out.println();
        
        //check the number is divided by 7 or not
        
        if(arr[ctr]%7 == 0){
          System.out.println(arr[ctr]  +  "The number is also divided by 7");
         
       }
        else{
          System.out.println(arr[ctr]  +  "The number is not divided by 7");
      }
      
           System.out.println();
      
       //check the number is odd or even
       
         if(arr[ctr]%2 == 0){
          System.out.println(arr[ctr] + "The number is even");
         
       }
       
        else{
          System.out.println(arr[ctr] + "The number is odd");
        }
        
        }
    
    }
}




