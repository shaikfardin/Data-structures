/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,n,arr[],count=0,key;
     Scanner input= new Scanner(System.in);
     System.out.println("enter the array length");
     n=input.nextInt();
     arr=new int[n];
     System.out.println("enter the array");
     for(i=0;i<n;i++){
         arr[i]=input.nextInt();
         
     }
     System.out.println("enter the key");
     key=input.nextInt();
     for(i=0;i<n;i++){
         if(arr[i]==key){
             count+=1;
         }
     }
     System.out.println(key+" "+"is repeted"+" " +count+"times");
	}
}
