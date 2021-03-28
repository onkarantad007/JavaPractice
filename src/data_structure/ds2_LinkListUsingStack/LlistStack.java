package data_structure.ds2_LinkListUsingStack;

public class LlistStack {

	class Node{
		int data;
		Node next;
	}

	Node top;
	public LlistStack()
	{
		this.top=null;
	}
	
	@SuppressWarnings("unused")
	public void push(int x)
	{
		Node temp=new Node();
		if(temp==null)
		{
			System.out.print("\nHeap Overflow");
			return;
		}
		
		temp.data=x;
		temp.next=top;
		top=temp;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return top.data;
		}
		else
			System.out.println("Stack is empty"); 
        return -1; 
	}

	public void pop()
	{
		if(isEmpty())
		{
			 System.out.print("\nStack Underflow"); 
	            return; 
		}
		top=top.next;
	}
	
	
	public void Display()
	{
		if(isEmpty())
			 System.out.printf("\nStack Underflow");
		else {
			Node curr=top;
			while(curr!=null)
			{
				 System.out.printf("%d->", curr.data);
				 curr=curr.next;
			}
		}
	}
	
}
