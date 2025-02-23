class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if (top==-1){
 
    		return true;
    	}
    	return false;
    } 
    boolean isFull() 
    { 
        //Write your code here 
    	if (top==MAX-1){
 
    		return true;
    	}
    	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if (isFull()) {
    		System.out.println("Stack Overflow");
    	}
    	top+=1;
    	a[top]=x;
    	//a[++top]=x
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if (isEmpty()) {
    		System.out.print("Stack underflow");;
    	}
    	
        //Write your code here
    	
    	return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
    	return a[top];
    } 
    
    
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
