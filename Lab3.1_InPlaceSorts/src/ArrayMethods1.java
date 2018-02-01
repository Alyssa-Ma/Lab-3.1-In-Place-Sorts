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
		System.out.println("Insertion sort time: " + time + "nanoseconds.");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Selection sort time: " +time + "nanoseconds.");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Bubble sort time: " +time+ "nanoseconds.");
		System.out.println(Arrays.toString(test3));
	}

	
	public static void insertionSort(int [] list1)
	{
		
	}
	
	public static void selectionSort(double [] list1)
	{
		double 
	}
	
	public static void bubbleSort(String [] list1)
	{
		String x;
		int swap = 0;
		
		while(swap > 0)
		{
			for(int i = 0; i<list1.length; i++)
			{
				if(list1[i].compareTo(list1[i+1])>0)
				{
					x = list1[i];
					list1[i] = list1[i+1];
					list1[i+1] = x;
				}
			}
		}
		for(int d = 0; d<list1.length; d++)
		{
			
		}
		/**
		 * int length = list1.length;
		 * int x = 0;
		boolean swapAvail = true;
		while(swapAvail)
			//while swap >0 needs to keep track of swaps
		{
			swapAvail = false;
			x++;
		
			for(int b = 0; b < length; b++)
			{
				for(int k = 0; k < k-i-1; k++)
				{
					if(list1[k] > list1[k+1])
					{
						
					}
				}
			}
		}
		 */
		
	}
	
	
	
	
	
	
	
	
	 public static void swap(int[] list1, int index1, int index2)
	 {
		int temp = list1[index1];
		list1[index1] = list1[index2];
		list1[index2] = temp;
	 }
	
	
}
