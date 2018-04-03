package progs.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionFibbonaci {
	public static void main(String... str) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int max=Integer.parseInt(br.readLine());
		int a=0,b=1;
		int maxNumber=RecursionFibbonaci.fibbonaci(max,a,b);
		System.out.println(maxNumber);
	}
	public static int fibbonaci(int max,int first,int second) {
		int last=first+second;
		if(first==0) {
			System.out.println(first);
		}
		second=first;
		first=last;
		
		if(max<last) {
			return second;
		}else {
			System.out.println(first);
			return fibbonaci(max,first,second);
		}
	}
}
