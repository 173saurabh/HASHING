//Given an array A[] and a number x, check for pair in A[] with sum as x
import java.util.*;
public class H3 
{
	static void printpairs(int[] arr,int num)
	{
		HashSet<Integer> hset=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			int temp=num-arr[i];
			if(hset.contains(temp))
				System.out.println("Pair with given sum "+num+" is "+temp+","+arr[i]);
			hset.add(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int num=sc.nextInt();
		printpairs(arr,num);
	}
}
