import java.util.Scanner;
public class duplicate{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,j,arr[],n,key,count=0;
        System.out.println("enter the len of array");
        n=input.nextInt();
        arr=new int[n];
        System.out.println("enter the array element");
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count=1;
                    break;
                }

            }
                
            }
            if(count==1){
                System.out.println("arr has duplicates");
            }
            else{
                System.out.println("arr has no duplicates");
            }

        }
    }


