class BinaryTree
{
    Node root;
    public BinaryTree()
    {
        root=null;
    }
    private class Node
    {
        Node left;
        Node right;
        int data;
        
        Node(int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }        
        public void insert(int data)
        {
            root=insert(root,data);
                
        }
        public Node insert(Node node,int data)
        {
            if(node==null)
                node=new Node(data);
            else{
                if(data<=node.data)
                    node.left=insert(node.left,data);
                else
                    node.right=insert(node.right,data);
            }
            return node;
     
        }
       
    public void printPreorder()
    {
        printPreorder(root);
    }
    public void printPreorder(Node root)
    {
     //   System.out.print("preorder");
        if(root!=null)
        {
            System.out.println("   "+root.data);
            printPreorder(root.left);
             
            printPreorder(root.right);
        }
    }
    
    
     public void printInorder()
    {
        printInorder(root);
    }
    public void printInorder(Node root)
    {
     //   System.out.print("preorder");
        if(root!=null)
        {
            printInorder(root.left);
             System.out.println("   "+root.data);
            printInorder(root.right);
        }
    }
    
    public int findmin()
    {
       // System.out.print("findmin");
        return findmin(root);
    }
    public int findmin(Node root)
    {
        Node min=root;              //:mistake:used root instead of root.data
        if(root!=null)
        {
          
        
        while(min.left!=null)
        {
            min=min.left;
        }
        }
        return min.data;
    }
    
    
    public int findmax()
    {
       // System.out.print("findmin");
        return findmax(root);
    }
    public int findmax(Node root)
    {
        Node max=root;              //:mistake:used root instead of root.data
        if(root!=null)
        {
          
        
        while(max.left!=null)
        {
            max=max.right;
        }
        }
        return max.data;
    }
    
    public boolean isValid()
    {
        return isValid(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    public boolean isValid(Node root,double min,double max)
    {
        if (root == null) {
            return true;
        }
        if (root.data < max && root.data > min && 
            isValid(root.left, min, root.data) &&
            isValid(root.right, root.data, max)) {
                return true;
        } 
        return false;
}
        
    public static void main(String[] arg)
    {
        BinaryTree tree=new BinaryTree();
        tree.insert(5);
          tree.insert(10);
            tree.insert(15);
              tree.insert(1);
       tree.printPreorder();
        tree.printInorder();
        System.out.println(tree.findmin());
          System.out.println(tree.findmax());
          System.out.println(tree.isValid());
          //tree.isValid();
    }
    }