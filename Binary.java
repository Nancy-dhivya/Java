//prepinsta coding qn 2
public class Binary {
    public static void main(String[] args)
    {

        String str= "1C0C1C1A0B1";
        int result = Stringoper(str);
        System.out.println(result);
    }

        public static int Stringoper(String str)
        {
            if(str==null || str.length()==0)
            {
                return -1;
            }

            int result = str.charAt(0) - '0';

        
            for(int i=1;i<=str.length()-1;i+=2)
            {
                char operation = str.charAt(i);
                int nextDigit = str.charAt(i+1) - '0';

                if(operation=='A')
                {
                    result= result & nextDigit;

                }
                else if(operation=='B')
                {
                    result=result | nextDigit;
                }
                else
                {
                    result= result ^ nextDigit;
                }


            }
            return result;
        }


    }
        
