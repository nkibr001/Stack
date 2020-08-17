//6039168
public class Stack 
{
   //some references were taken from the powerpoints

    public class Node
    {
        int info;
        Node next;
        
        public Node()
        {
            info=0;
            next=null;
        }
        
        public void setInfo(int i)
        {
            info=i;
        }
        
        public void setNext(Node l)
        {
            next=l;
        }
        public int getInfo()
        {
            return info;
        }
        
        public Node getNext()
        {
            return next;
        }
    }
    //establishes base information for Node
    
   private Node first;  
   
   public Stack()
   {
       first= new Node();
       //creates head node
   }
   public boolean isEmpty()
   {
       return first.getNext()==null;
       //if it references a null object, it's empty
   }
   public void push(int x)
   {
       Node temp=new Node();
       
       temp.setInfo(x);
       temp.setNext(first.getNext());
       first.setNext(temp);
       //creates a temp node with info and sets it next to the header node, thus putting it at top of stack
   }
   public void pop()
   {
       if(isEmpty())
       {
           System.out.println("Empty stack can't pop!");
       }
       else
       {
           first.setNext(first.getNext().getNext());
       }
       
       //first head is now the one it's next to, thus removing the 'top' element
   }
   public int peek()
   {
       if(isEmpty())
       {
           System.out.println("Empty stack can't peek!");
           return -1;
           //if empty, tells user and returns -1
       }
       return first.getNext().getInfo();
       //gives info at the top
   }
}
