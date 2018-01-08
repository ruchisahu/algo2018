package array;

class node2 {
int data;
int data1;

public node2(int data,int data1)
{
	this.data=data;
	this.data1=data1;
	}
}
class node
{
	public static void main(String[] args)
	{
		node2[] node1 =new node2[5];
		node1[0]=new node2(1,2);
		node1[1]=new node2(1,2);
		node1[2]=new node2(1,2);
		node1[3]=new node2(1,2);
		node1[4]=new node2(1,2);
		
		for(int i=0;i<node1.length;i++)
		{
			System.out.println(node1[i]);
		}
		
	}
	}