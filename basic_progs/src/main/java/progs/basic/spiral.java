package progs.basic;
import java.util.Scanner;
public class spiral {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int r=0,c=0;
			System.out.println("enter number of rows");
			r=sc.nextInt();
			System.out.println("enter number of cols");
			c=sc.nextInt();
			int[][] m=new int[r][c];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.println("enter position["+i+"]["+j+"]");
					m[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(m[i][j]+" ");
				}
				System.out.println();
			}
			int k=0,l=0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++){
					if(i==j) {
						System.out.print("<"+m[i][j]+">");
					}else {
						System.out.print(m[i][j]+" ");
					}
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
