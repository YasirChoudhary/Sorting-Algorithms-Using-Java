
// Selection Sort : Providing array elements in the program and then sort.

class SelectionSort2{
	public static void main(String[] args){
		
		System.out.println("Execution Start");
		int[] arr = {60,45,32,92,70,1};
		System.out.println("Array Elements is Declared");
		
		sortArray(arr);
		System.out.println("Array is sorted");
		
		System.out.println("----------------------------");
		
		printArray(arr);
	}
	
	public static void sortArray(int[] arr){
		System.out.println("Sorting process is Start");
		for(int i=0; i<=arr.length-2; i++){
			int minValue = i;
			
			for(int j=i+1; j<=arr.length-1; j++){
				if(arr[j]<arr[minValue]){
				int	temp = arr[minValue];
					arr[minValue] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorting process is completed");
	}
	
	public static void printArray(int[] arr){
		System.out.println("Printing sorted array");
		for(int i=0; i<=arr.length-1; i++){
			System.out.print(arr[i]+",");
		}
	}
}

/*
OUTPUT:
Execution Start
Array Elements is Declared
Sorting process is Start
Sorting process is completed
Array is sorted
----------------------------
Printing sorted array
1,32,45,60,70,92,
*/