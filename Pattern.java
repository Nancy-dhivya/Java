public class Pattern {
    public static void main(String[] args)
    {
        int rows = 3;
        int col = 4;

        int[][] arr= new int[rows][col];
        

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=i+j;
            }
            
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        

    }
    
}
