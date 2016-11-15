import java.util.*;
class HeapSort{
	public static void main(String args[]){
		//int[] arr = {10,5,4,3,7,8,9,8}; 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(8);
		buildMaxHeap(list);
		
		heapSort(list);
		//System.out.println(Arrays.toString(list));
	}
	static void buildMaxHeap(ArrayList<Integer> arr){
		for (Integer i=((arr.size()-1)/2);i>0;i--){
			maxHeapify(arr,i);					
		}
	}
	static void maxHeapify(ArrayList<Integer> arr, Integer i){
		Integer largest=0,temp=0;
		Integer left = 2*i+1;
		Integer right = 2*i+2;
		if((left<=arr.size()-1) && (arr.get(i) < arr.get(left))){
			largest = left;
		}else
			largest = i;
		if((right<=arr.size()-1) && (arr.get(largest) < arr.get(right))){
			largest = right;
		}
		if(largest != i){
			temp = arr.get(largest);
			arr.set(largest,arr.get(i));
			arr.set(i,temp);
			maxHeapify(arr,largest);
		}
	}
	static void heapSort(ArrayList<Integer> arr){
		Integer temp = 0;
		for (Integer i = (arr.size()-1);i>0;i--){
			temp = arr.get(i);
			arr.set(i,arr.get(0));
			arr.set(0,temp);
			Integer a = arr.remove(arr.size()-1);
			System.out.println(a);
			maxHeapify(arr,0);
		}
	}
}