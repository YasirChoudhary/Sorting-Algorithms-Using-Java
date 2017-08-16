import java.util.Scanner;
class BubbleSort{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
	
	System.out.println("Enter the size of an Array");
	int size = sc.nextInt();

	int[] arr = new int[size];
	
	System.out.println("-------------------");
	
	addElements(arr);
	System.out.println("------------------");
	
	sortArray(arr);
	System.out.println("Sorting is completed......");
	
	printArray(arr);
	System.out.println("------------------");
	
	}
	
	public static void addElements(int[] arr){
	
		System.out.println("Add Elements");
	
		for(int i=0; i<=arr.length-1; i++){
			arr[i]=sc.nextInt();
		}
	}
	
	public static void sortArray(int[] arr){
		
		// Outer loop is for No. Of iterations
		for(int i=0; i<=arr.length-2; i++){
		
			// Inner loop is for Maintaing array and Swapping the array.
			for (int j=0; j<=arr.length-2; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
		
		}
	
	}
	
	
	
	public static void printArray(int[] arr){
		System.out.println("Print the sorted array");
		for(int i=0; i<=arr.length-1; i++){
			System.out.println("The value at index "+i+" is "+arr[i]);
		
		}
	
	}
	
}

/*
OUTPUT:
Enter the size of an Array
9
-------------------
Add Elements
65
40
5
18
9
99
75
33
12
------------------
Sorting is completed......
Print the sorted array
The value at index 0 is 5
The value at index 1 is 9
The value at index 2 is 12
The value at index 3 is 18
The value at index 4 is 33
The value at index 5 is 40
The value at index 6 is 65
The value at index 7 is 75
The value at index 8 is 99
------------------

*/