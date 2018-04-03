package zo.sorts;

public class QuickSort extends SortCommonAbstract{

	@Override
	public int[] sort(int[] arr) {
		QuickSort.doRecur(arr,0,arr.length-1,"start");
		return null;
	}
	
	public static int[] doRecur(int[] arr,int low, int high,String str) {
		int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
        System.out.println("pivot"+pivot);
    	System.out.println("--low="+low+",high="+high);
        /** partition **/
        while (i <= j) 
        {
            while (arr[i] < pivot) {
                i++;
                System.out.println(arr[i]+"<"+pivot+"inc i="+i);
            }
            while (arr[j] > pivot) {
            	j--;
            	System.out.println(arr[i]+">"+pivot+"inc j="+j);
            }                
            if (i <= j) 
            {
                /** swap **/
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
                System.out.println("if i="+i+",j="+j);
                for(int k=0;k<arr.length;k++) {
        			System.out.print(arr[k]+",");
        		}
            }
        }
 System.out.println(i+"---"+j);
        /** recursively sort lower half **/
        if (low < j) {
        	System.out.println("left"+"--low="+low+",high="+j);
        	QuickSort.doRecur(arr, low, j,"left");
        }
        /** recursively sort upper half **/
        if (i < high) {
        	System.out.println("right"+"--low="+i+",high="+high);
        	QuickSort.doRecur(arr, i, high,"right");
        }
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+",");
		}
		System.out.println("");
		return arr;
	}
}
