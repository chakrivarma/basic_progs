package progs.basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class KnightMoves {
	public static void main(String args[]) {
		int i=0,j=0,posR=0,posC=0,row=0,col=0;
		int[][] board;
		Scanner br=new Scanner(System.in);
		System.out.println("enter number rows");
		row=br.nextInt();
		System.out.println("enter number columns");
		col=br.nextInt();
		board=new int[row][col];
		System.out.println("Please Enter knight position in row");
		posR=br.nextInt();
		System.out.println("Please Enter knight position in column");
		posC=br.nextInt();
		//topmoves=((posR-2) && ((posC-1) || (posC+1))
		//bottommoves=((posR+2) && ((posC-1) || (posC+1))
		//leftmoves=((posR-1) || (posR+1)) && (posC-2)
		//rightmoves=((posR-1) || (posR+1)) &&(posC+2)
		ArrayList<String> topmoves=new ArrayList<String>();
		ArrayList<String> bottommoves=new ArrayList<String>();
		ArrayList<String> leftmoves=new ArrayList<String>();
		ArrayList<String> rightmoves=new ArrayList<String>();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=col;j++) {
				if((posR-2)==i && ((posC-1)==j || (posC+1)==j)){
					topmoves.add("("+i+","+j+")");
				}
				if((posR+2)==i && ((posC-1)==j || (posC+1)==j)){
					bottommoves.add("("+i+","+j+")");
				}
				if((posC-2)==i && ((posR-1)==j || (posR+1)==j)){
					leftmoves.add("("+i+","+j+")");
				}
				if((posC+2)==i && ((posR-1)==j || (posR+1)==j)){
					rightmoves.add("("+i+","+j+")");
				}
			}				
		}
		System.out.println("<left moves>"+leftmoves+"<count>"+leftmoves.size());
		System.out.println("<top moves>"+topmoves+"<count>"+topmoves.size());
		System.out.println("<right moves>"+rightmoves+"<count>"+rightmoves.size());
		System.out.println("<bottom moves>"+bottommoves+"<count>"+bottommoves.size());
	}
}
