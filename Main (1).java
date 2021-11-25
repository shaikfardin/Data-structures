/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int i,n,key,arr[];
	   Scanner input= new Scanner(System.in);
	   System.out.println("size of an array");
	   n=input.nextInt(); //length of arr
	   arr=new int[n];
	   System.out.println("enter the array elements");
	    
	   for(i=0;i<n;i++){
	       arr[i]=input.nextInt();
	      
	       
	   }
	   System.out.println("enter the key value");
	   key=input.nextInt(); //searching elemen
	   for(i=0;i<n;i++){
	       if(arr[i]==key){
	           System.out.println(key +" "  + "is at index "  + i);
	           break;
	       }
	   }
	   if(i==(n)){
	       System.out.println("key is not present in array");
	   }
	}
}
