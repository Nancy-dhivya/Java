public class ElePresentOrNot {
    public static void main(String[] args)
    {
        int[] arr={1,5,7,3,9};

        int searchElement = 7;
        int index=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==searchElement)
            {
                index=i;
                break;
                
            }
            
        }
        if(index==-1)
        {
            System.out.println("Element is not found in the array:");
        }
        else{
            System.out.println("Element is found at index:"+index);
        }

    }
        
    
}
