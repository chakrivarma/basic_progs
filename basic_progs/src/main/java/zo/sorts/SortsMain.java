package zo.sorts;

import java.util.Scanner;
public class SortsMain {
	public static void main(String... args){
		int[] arr= {56,23,12,99,0,43,35,66,32,81,4,7};
		Scanner sc=new Scanner(System.in);
		SortCommonAbstract.display(arr);
		System.out.println("enter your choice\n1)Bubble Sort \n2)Selection Sort \n3)Quick Sort");
		SortCommonAbstract sca=null;
		switch(sc.nextInt()) {
			case 1:
				sca=new BubbleSort();
				sca.sort(arr);
				sca.display(arr);
				break;
			case 2:
				
				sca=new SelectionSort();
				sca.sort(arr);
				sca.display(arr);
				break;
			case 3:
				sca=new QuickSort();
				sca.sort(arr);
				sca.display(arr);				
				break;
				
			default:
				System.exit(0);
		}
	}
}
