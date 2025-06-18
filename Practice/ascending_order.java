public class ascending_order {
    
    public void ascend(int[] arr){

            System.out.println("The ascending numbers are : ");
            for(int i=0;i<=arr.length-1;i++)
            {
               for(int j=1;j<arr.length-1-i;j--)
                {  
                     if(arr[i]>arr[j])
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j+1]=temp;
                    }

                }
            }
            System.out.println("\n");

    }
    
    public static void main(String[] args)
    {

    }
}
