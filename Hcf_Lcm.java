public class Hcf_Lcm {
    public static void main(String[] args)
    {
        int n1=12;
        int n2=16;
        int n3=20;

        int hcf=0;

        for(int i=1;i<12;i++)
        {
            if(n1%i==0 && n2%i==0 && n3%i==0)
            {
                hcf=i;

            }
            
        }
        int lcm=(n1*n2*n3)/hcf;
        System.out.println(hcf);
        System.out.println(lcm);
       
        }


        }
    
    

