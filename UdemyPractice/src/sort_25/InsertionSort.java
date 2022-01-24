package sort_25;



public class InsertionSort{
	//	This is the main method
	public static void main(String args[]) {
		int givenArray[]= {2,6,5,16,3,21,9,4,78,54,40,33,15,};
		// print before sorting
		System.out.println("The array before sorting: ");
		printArray(givenArray);
		System.out.println();


		// Execution of sorting operation
		insertionSort(givenArray);

		//	Array after sorting
		System.out.println("The array after sorting: ");
		printArray(givenArray);
	}




	// This is the insertion method to sort

	public static int[] insertionSort(int array1[]) {
		for (int i = 1; i < array1.length; i++) {
			int temp=array1[i];
			int j=i-1;
				while((temp<array1[j]) && j>=0) {
					array1[j+1]=array1[j];
					j--;
			}
				array1[j+1]=temp;
				 
				 


		}
		return  array1;

	}


// This is swap method defination  // I have not used this function here
public static int[] swap(int c[] ,int a, int b) {
	int temp;
	temp=c[a];
	c[a]=c[b];
	c[b]=temp;
	return c;  
}


// This is the method to print
public static void printArray(int inputarray[]) {
	for (int i = 0; i < inputarray.length; i++) {
		System.out.print( inputarray[i]+ ", ");
	}

}
}