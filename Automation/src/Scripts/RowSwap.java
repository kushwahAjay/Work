package Scripts;

public class RowSwap {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{2,4,7},{1,3,5}};
		int k = arr.length-1;
		
		System.out.println("printing the elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		
		
		
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				int temp=0;
				temp=arr[i][j];
				arr[i][j]=arr[k][j];
				arr[k][j]=temp;
			}
			k--;
			
		}
		System.out.println();
		System.out.println("printing the elements after swaping the rows");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
			

	}

}
