
// Bubble Sort : Providing array elements in the program and then sort.

class BubbleSort2{
	public static void main(String[] args){
		
		System.out.println("Execution start");
		int[] arr = {60,45,90,32,1,4};
		System.out.println("Array is declared");
		
		sortArray(arr);
		System.out.println("Array is sorted");
		
		System.out.println("-----------------");
		
		printArray(arr);
	}
	
	public static void sortArray(int[] arr){
		System.out.println("Sorting process start");
		for(int i=0; i<=arr.length-2; i++){
			for(int j=0; j<=arr.length-2-i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		
		}
		System.out.println("Sorting process completed");
	}
	
	public static void printArray(int[] arr){
		System.out.println("Printing process Start");
		for(int i=0; i<=arr.length-1; i++)
			System.out.print(arr[i]+",");
	}
}

/*
OUTPUT:
Execution start
Array is declared
Sorting process start
Sorting process completed
Array is sorted
-----------------
Printing process Start
1,4,32,45,60,90,
*/