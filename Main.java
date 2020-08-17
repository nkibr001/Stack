public class Main 
{
    public static void main (String args[])
    {
        System.out.println("Stack created!");
        Stack S1=new Stack();
        
        System.out.println("Is it empty?");
        System.out.println(S1.isEmpty());
        
        System.out.println("Input 1 entered");
        S1.push(1);
        
        System.out.println("Is it empty?");
        System.out.println(S1.isEmpty());
        
        System.out.println("Peek at the top!");
        System.out.println(S1.peek());
        
        S1.push(2);
        S1.push(3);
        System.out.println("Inputs 2 and 3 entered!");
        
        System.out.println("Peek at the top!");
        System.out.println(S1.peek());
        
        S1.pop();
        System.out.println("Pop out the top value!");
        
        System.out.println("Peek at the top!");
        System.out.println(S1.peek());
        
        System.out.println("Pop out the top value!");
        S1.pop();
        
        System.out.println("Peek at the top!");    
        System.out.println(S1.peek());
        
        System.out.println("Pop out the top value!");
        S1.pop();
        System.out.println("Peek at the top value!");
        System.out.println(S1.peek());
        
        System.out.println("Is it empty?");
        System.out.println(S1.isEmpty());
    }
    
}
