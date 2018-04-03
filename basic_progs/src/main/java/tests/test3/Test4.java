package tests.test3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test4 {
	public static void main(String args[]) {
		System.out.println("Please enter n relations");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x1=new int[n];
		int[] x2=new int[n];
		int[][] rep=new int[n][n];
		for(int i=0;i<n;i++){
			x1[i]=sc.nextInt();
			x2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			rep[x1[i]-1][x2[i]-1]=1;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				System.out.print(rep[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
