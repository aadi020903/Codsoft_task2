
import java.util.Scanner;

class Word_Count
{
   public static int count_words(String s)
    {
        int coounts = 0;
        if(s.charAt(0)!=' ')
        {
            coounts++;
        }
        for(int i=0;i<s.length();i++)
            {    
                if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                {
                    coounts++;
                }
            }
            return coounts;
    }
    public static void main(String ar[]) {
    
            Scanner sa = new Scanner(System.in);
            System.out.println("enter a sentence :");
                String s =sa.nextLine();
                int count = count_words(s);  
                System.out.println("total words in your sentence  = "+ count);          
            
            
    }
}
