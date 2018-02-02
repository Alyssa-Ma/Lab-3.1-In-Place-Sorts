import java.lang.reflect.Array;
import java.util.Arrays;

//Lab 3.1 In Place Sorts
//Author: Alyssa Ma
//Start Date: 1/17/18

public class ArrayMethods1 {
	
	public static void main(String [] args)
	{
		//Test arrays
		int[]test1 = {1,4,4,5,6,4,3,17,0};
		double[]test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String[]test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//Insertion Sort
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Insertion sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Selection sort time: " +time + " nanoseconds.");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Bubble sort time: " +time+ " nanoseconds.");
		System.out.println(Arrays.toString(test3));
	}

	
	public static void insertionSort(int [] list1)
	{
		/**
		 * insertion sort takes the values of the array based on its index
		 * takes value at index 0 and compares it against all the other values in the array
		 * as it moves down the values, if the value is no longer greater than the other number, stop
		 * separates into two lists, sorted vs unsorted
		 * each time a value finishes iterating, it becomes part of the sorted array
		 */
		int x = list1.length;
		
		for(int i = 1; i < x; i++)
		{
			int y = list1[i];
			int z = i-1;
			
			while(z >= 0 && list1[z] > y)
			{
				list1[z + 1] = list1[z];
				z=z-1;
			}
			list1[z+1]=y;
		}
	}
	
	public static void selectionSort(double [] list1)
	{
		/**
		 * selection sort continouously finds the minimum value and places it at index 0
		 * each iteration will place one value at the correct position
		 */
		 double x;
		 int y;

		 for(int i = list1.length-1; i >= 1; i--)
		 {
			 x = list1[i];
		     y = i;

		      for(int j = i-1; j >= 0; j--)
		      {
		    	  if(x < list1[j])
		    	  {
		    		  x = list1[j];
		    		  y = j;
		    	  }
		      }
		      if(y != i)
		      {
		        list1[y] = list1[i];
		        list1[i] = y;
		      }
		  }
	}
	
	public static void bubbleSort(String [] list1)
	{
		/**
		 * bubble sort takes item at index 0 and then compares it to every other element in array
		 * by the first iteration, the greatest value will be in place
		 * good at sorting larger values to the end of array
		 * boolean swap tells program when there are no longer any swaps left
		 */	
		String x;
		
		for(int y = 0; y < list1.length - 1; y++) 
		{
			for(int i = 0; i < list1.length - y - 1; i++) 
			{
                if(list1[i+1].compareTo(list1[i]) < 0) 
                {
                    x = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = x;
                }
            }
        }
	}
}