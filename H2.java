package hashing;

//Union and Intersection of two Linked Lists using Stack
import java.util.*;
public class H2 
{
	Node head;
	class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void push(int d)
	{
		Node n=new Node(d);
		n.next=head;
		head=n;
	}	
	H2 getIntersection(Node head1,Node head2)
	{
		HashSet<Integer> hset=new HashSet<>();
		Node h1=head1,h2=head2;
		H2 result=new H2();
		while(h1!=null)
		{
			hset.add(h1.data);
			h1=h1.next;
		}
		while(h2!=null)
		{
			if(hset.contains(h2.data))
				result.push(h2.data);
			h2=h2.next;
		}
		return result;
	}
	H2 getUnion(Node head1,Node head2)
	{
		Node h1=head1,h2=head2;
		HashSet<Integer> hset=new HashSet<>();
		H2 result=new H2();
		while(h1!=null)
		{
			if(!hset.contains(h1.data))
			{
				hset.add(h1.data);
				result.push(h1.data);
			}
			h1=h1.next;
		}
		while(h2!=null)
		{
			if(!hset.contains(h2.data))
			{
				hset.add(h2.data);
				result.push(h2.data);
			}
			h2=h2.next;	
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		H2 llist1=new H2();
		H2 llist2=new H2();
		H2 union=new H2();
		H2 intersection=new H2();
		
		llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);
        
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);
        
        intersection=intersection.getIntersection(llist1.head,llist2.head);
        union=union.getUnion(llist1.head,llist2.head);
        
        System.out.println("The linked list 1 is:");
        llist1.printList();
        System.out.println("The linked list 2 is:");
        llist2.printList();
        System.out.println("The union list is:");
        union.printList();
        System.out.println("The intersection list is:");
        intersection.printList();
        
	}
}
