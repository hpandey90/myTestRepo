import java.util.*;
class Quicksort{
	public static void main(String args[]){
		Integer[] arr={7,5,2,9,10};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void quickSort(Integer[] arr){
		Integer r = arr.length-1;
		Integer p = 0;
		quickSort(arr, p, r);
	}
	static void quickSort(Integer[] arr, Integer p, Integer r){
		Integer q = 0,y=10;
		if(p<r){
			q = partition(arr,p,r,y);
			System.out.println(Arrays.toString(arr)+"==========="+y);
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
		}
	}
	static int partition(Integer[] arr, Integer p, Integer r, Integer y){
		Integer x = arr[r];
		Integer i = p-1,j=0;
		Integer temp=0,cnt=1;
		y--;
		for(j=p; j<r ; j++){
			if(arr[j]<=x){
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=x;
		arr[r]=temp;
		return i+1;
	}
}