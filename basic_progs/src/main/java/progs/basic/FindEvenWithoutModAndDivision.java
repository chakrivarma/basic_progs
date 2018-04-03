package progs.basic;

import java.util.Scanner;

public class FindEvenWithoutModAndDivision {
	public static void main(String args[]) {
		System.out.println("enter a number to check whether even or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		/**
		 * logic 1
		 */
		while(num>0) {
			num--;
			num--;
		}
		if(num==0) {
			System.out.println(temp+"=logic-1:its even number");
		}else {
			System.out.println(temp+"=its not even number");
		}
		num=temp;
		
		/**
		 * logic 2
		 */
		while(temp>0) {
			temp=temp-2;
		}
		if(temp==0) {
			System.out.println(num+"=logic-2:its even number");
		}else {
			System.out.println(num+"=its not even number");
		}
		
		
		/**
		 * logic 3
		 */
		if((num&1)==0) {
			System.out.println(num+"=logic-3:its even number");
		}else {
			System.out.println(num+"=its not even number");
		}
	}
}
