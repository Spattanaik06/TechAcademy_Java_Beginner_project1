package day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) 
	{
		int [] arr= {20,23,43,45};
		int sum=0;
		
// 2.Sum of Array Element
		
		for(int a : arr)
		{
			sum+=a;
		}
		System.out.println("Sum of All Element = "+sum);
		
// 3.Find Minimum And Maximum
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]> max) max=arr[i];
			if(arr[i]< min) min=arr[i];
		}
		System.out.println("Minimum = "+min);
		System.out.println("Maximum = "+max);
		
		
// 4.Find the key or Element in Array
		
		int key=23;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Position of Key in Array is : " +(i+1));
			}
		}
		
		System.out.println();
		
//5. Reverse an Array
		
		System.out.println("Before reverse :");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After reverse :");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n");
		
//6. Sort the Array
		
		System.out.println("After sorting :" );
		Arrays.sort(arr);
		for(int i : arr)
		{
			System.out.print( i+" ");
		}
		System.out.println("\n");
		
//7. Merge two Array
		
		System.out.print("Array 1 : ");
		int arr1[]= {1,2,3};
		for(int i : arr1)
		{
			System.out.print(i+ " ");
		}
		System.out.println("");
		System.out.print("Array 2 : ");
		int [] arr2= {4,5};
		for(int i : arr2)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\n");
		
		System.out.print("After Merging both Array :");
		int [] array=new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<array.length;i++)
		{
			if(i<arr1.length)
				
			{
				array[i]=arr1[i];
			}
			else
			{
				array[i]=arr2[k++];
			}
		}
		
		for(int i : array)
		{
			System.out.print(i+ " ");
		}
		

	}

}
