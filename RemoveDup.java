
public class RemoveDup{
    public static void main(String[] args)
    {
        int[] arr={2,5,6,2,3,4};
        int n = arr.length;
       

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    for(int k=j;k<n-1;k++)
                    {
                        arr[k]=arr[k+1];

                    }
                    n--;
                    j--;
                }

            
            }
        }
        for(int a=0;a<n;a++)
        {
            System.out.println(arr[a]);
        }



    }
}