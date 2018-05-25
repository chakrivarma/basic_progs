package progs.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String args[]) throws IOException{
		System.out.println("Enter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int res=1;
		while(num>0) {
			res=res*num--;
		}
		System.out.println(res);
	}
}
