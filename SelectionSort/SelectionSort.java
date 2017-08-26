
// Selection Sort: Here I am sorting an array by taking inputs from User

import java.util.Scanner;
class SelectionSort{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
	
	System.out.println("Enter the size of Array");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	System.out.println("---------------------------------");
	
	addElements(arr);
	System.out.println("-----------------------------------");
	
	sortArray(arr);
	System.out.println("------Sorting task is completed----------");
	
	printArray(arr);
	System.out.println("-------------------------------------");
	
	
	}
	
	public static void addElements(int[] arr){
	
		System.out.println("Add Elements in the array.");
		
		for(int i=0; i<=arr.length-1; i++){
		
			arr[i]=sc.nextInt();
		}
	
	}
	
	public static void sortArray(int[] arr){
		for(int i=0; i<=arr.length-2; i++){
			int min = i;
			
			for(int j=i+1; j<=arr.length-1; j++){
				if(arr[j]<arr[min]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]= temp;	
				}
			}
		
		}
	
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<=arr.length-1; i++){
			System.out.println("The value at index "+i+" is "+arr[i]);
		
		}
	}
	
}

/*
OUTPUT:
Enter the size of Array
5
---------------------------------
Add Elements in the array.
65
40
5
18
9
-----------------------------------
------Sorting task is completed----------
The value at index 0 is 5
The value at index 1 is 9
The value at index 2 is 18
The value at index 3 is 40
The value at index 4 is 65
-------------------------------------
*/