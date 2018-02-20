package Scripts;

import java.util.Arrays;

public class ArraysPrint {
	
	static void sort(int arr[])
	{
		int temp=0;
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
				}
			}
		}
	
	static void sort1(int arr[])
	{
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0; i<arr.length-1;i++)
			{
				int temp=0;
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]=new int[]{56,45,78,12,10};
		
		sort(arr);
		for(int i:arr)
		
			System.out.println(i);
		System.out.println("---------------------------");
		
		sort1(arr);
		for(int i:arr)
		System.out.println(i);
		System.out.println(Arrays.toString(arr));
	
	}
	
}

	
	