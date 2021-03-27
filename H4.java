//Check if a given array contains duplicate elements within k distance from each other
import java.util.*;
public class H4 
{
	static boolean checkDuplicatesWithin(int arr[],int k,int n)
	{
		HashSet<Integer> hset=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(hset.contains(arr[i]))
				return true;
			hset.add(arr[i]);
			if(i>=k)
				hset.remove(arr[i-k]);
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		if(checkDuplicatesWithin(arr,k,n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
