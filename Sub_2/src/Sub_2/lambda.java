package Sub_2;
import java.util.*;
interface operation{  
    int lambda_usage(int a,int b);   //creating functional interface with function    
}  

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two parameters in lambda expression without curly braces
		 
		operation addition=(a,b)->(a+b); 
	        System.out.println("Addition is:"+addition.lambda_usage(15,25));
	        
	    
	        
	    //parameters with data types used as explicit arguments types
	        
	    operation subtract=(int a,int b)->(a-b);  
	        System.out.println("Subtraction is:"+subtract.lambda_usage(45,10));
	        
	    
	        
	        
	    // Lambda expression using return as a keyword
	        
	    operation multiply=(int a,int b)->{        
                return (a*b);   
                };  
            System.out.println("Multiplication is:"+multiply.lambda_usage(10,20));  

	
        
            
        // lambda expression taking input from user and displaying results
            
        operation division=(a,b)->(a/b);{
        	Scanner sc= new Scanner(System.in);      
			System.out.print("Enter 1st number ");  
			int a= sc.nextInt();
			System.out.print("Enter 2st number ");  
			int b= sc.nextInt(); 
	        System.out.println("Division is:"+division.lambda_usage(a,b));
	        
        };
    }
}


