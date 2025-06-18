import java.util.Scanner;
public class Evenint{
    public static int even(int[] arr){
            int even=arr[0] ;
            System.out.println("The even numbers are : ");
            for(int i=0;i<=arr.length-1;i++)
            {
                if(arr[i]%2==0)
                {
                    even= arr[i];
                    System.out.print(even +" , ");
                }
            }
            System.out.println("\n");
            return even;
        }
        public static int odd(int[] arr){
            int odd=arr[0] ;
            System.out.println("The odd numbers are : ");
            for(int i=0;i<=arr.length-1;i++)
            {
                if(arr[i]%2!=0)
                {
                    odd= arr[i];
                    System.out.print(odd +" , ");
                }
            }
            System.out.println("\n");
            return odd;
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

     even(numbers);
     odd(numbers);
    }
}