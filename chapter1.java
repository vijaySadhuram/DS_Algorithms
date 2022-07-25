  boolean isBST(Node root)
    {
        // code here.
        return IsBinary(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
        
    }
    public boolean IsBinary(Node root, long min, long max)
    {
        if(root==null)
          {return true;}
        if(root.data<min||root.data>max){
            return false;
        }
        
        boolean left=IsBinary(root.left,min,root.data);
        boolean  right=IsBinary(root.right,root.data,max);
        
        return left&&right;
        
        
        
        
        
    }
