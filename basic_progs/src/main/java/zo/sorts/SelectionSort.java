package zo.sorts;

public class SelectionSort extends SortCommonAbstract{
	@Override
	public int[] sort(int[] arr) {
		int min=0;
		for(int i=0;i<arr.length;i++) {
			min=arr[i];
			boolean swap=false;
			int t=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					swap=true;
					min=arr[j];
					t=j;
				}
			}
			if(swap) {
				arr[t]=arr[i];
				arr[i]=min;
			}
		}
		return arr;
	}
}
