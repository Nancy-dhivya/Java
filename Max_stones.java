import java.util.*;
public class Max_stones{

    public static int max_num_of_stones(int M,int N, List<Integer> commonStones)
    {
        List<Integer> marsStones = new ArrayList<>();
        for(int i=1;i<=M;i++)
        {
            marsStones.add(i);
        } 

        Set<Integer> marsSet  = new HashSet<>(marsStones);
        Set<Integer> earthSet = new HashSet<>(commonStones);
        marsSet.removeAll(earthSet);

        List<Integer> uniqueMarsWeight = new ArrayList<>(marsSet);
        Collections.sort(uniqueMarsWeight);

        int totalWeight=0;
        int count=0;

        for(int i:uniqueMarsWeight)
        {
            if (i+totalWeight<=M)
            {
                totalWeight+=i;
                count++;
                
            }
            else{
                    break;
            }
        }
        
        return count;

    }
    
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the bag");
        int m=scanner.nextInt();
        System.out.println("Enter the number of common stones");
        int n=scanner.nextInt();
        System.out.println("Enter the weights of the common stones");
        
        List<Integer> commonSto = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            commonSto.add(scanner.nextInt());
        }
        scanner.close();

        int result=max_num_of_stones(m,n,commonSto);
        System.out.println(result);
    }
}