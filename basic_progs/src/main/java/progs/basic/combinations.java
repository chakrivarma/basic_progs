package progs.basic;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class combinations {
	public static void main(String... args) {
		try {
			String str="";
			System.out.println("Please enter a string to print combinations");
			Scanner sc=new Scanner(System.in);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String brint=br.readLine();
			System.out.println(brint);
			str=sc.nextLine();
			int len=str.length();
			char[] ch=new char[len];
			str.getChars(0,len,ch,0);
			System.out.println(ch.length);
			comb(str, 0, len-1);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
    private static void comb(String str, int l, int r)
    {
        if (l == r) {
            System.out.println(str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                comb(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public static String swap(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}