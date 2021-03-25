//Find whether an array is a subset of another array
//Using Hashing
import java.util.*;
public class H1 
{
	static boolean isSubset(int[] arr1,int[] arr2,int n,int m)
	{
			HashSet<Integer> hset=new HashSet<>();
			for(int i=0;i<n;i++)
			{
				if(!hset.contains(arr1[i]))
					hset.add(arr1[i]);
			}
			for(int i=0;i<m;i++)
			{
				if(!hset.contains(arr2[i]))
					return false;
			}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		int m=sc.nextInt();
		int arr2[]=new int[m];
		for(int i=0;i<m;i++)
			arr2[i]=sc.nextInt();
		if(isSubset(arr1,arr2,n,m))
			System.out.println("arr2 is a subset of arr1");
		else
			System.out.println("arr2 is not a subset of arr1");
	}
}
