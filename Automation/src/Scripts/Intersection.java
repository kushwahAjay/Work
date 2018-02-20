package Scripts;

public class Intersection {

	public static void main(String[] args) {
		int arr1[]={2,4,6,7,3};
		int arr2[]={1,7,9,2};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
