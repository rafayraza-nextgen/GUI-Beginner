import java.util.Scanner;
public class Smallestint{

    public static int minarr(int[] arr){
        int smallest=arr[0] ;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("The smallest array is : "+smallest);
        return smallest;
    }

    public static int maxarr(int[] arr){
        int greatest=arr[0] ;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>greatest)
            {
                greatest=arr[i];
            }
        }
        System.out.println("The greatest array is : "+greatest);
        return greatest;
    }

    public static void main(String[] args)
    {
     int [] numbers = new int[10];
     Scanner sc= new Scanner(System.in);

     System.out.println("Enter 10 numbers : ");
     for(int i= 0;i< 10 ;i++)
     {
        numbers[i]=sc.nextInt();
     }

     minarr(numbers);
     maxarr(numbers);
    }
}