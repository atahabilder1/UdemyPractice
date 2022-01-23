package sort_25;

 

public class BubbleSort{
//	This is the main method
	public static void main(String args[]) {
		int givenArray[]= {2,3,5,6,3,4,9,4,78,54,4};
		// print before sorting
		System.out.println("The array before sorting: ");
		printArray(givenArray);
		System.out.println();
		
		
		// Execution of sorting operation
		bubbleSort(givenArray);
		
		//	Array after sorting
		System.out.println("The array after sorting: ");
		printArray(givenArray);
	}
	
	
	
	
// This is the method to sort
	
	public static int[] bubbleSort(int array1[]) {
		for (int i = 0; i < array1.length-1; i++) {
			for (int j = 0; j < array1.length-1-i; j++) {
				if (array1.length>1) {
					
					if (array1[j+1]<array1[j]) {
						 int temp =array1[j+1];
						 array1[j+1]=array1[j];
						 array1[j]=temp;
					}
				}
			}
		}
		return  array1;
		
	}
	
 
	
	 
	
// This is the method to print
	public static void printArray(int inputarray[]) {
		for (int i = 0; i < inputarray.length; i++) {
			System.out.print( inputarray[i]+ ", ");
		}
		
	}
}