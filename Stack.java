/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Swastika Kayal
 * */
 class Stack {
	int st[] = new int[10], top = 0;
	int pop(){
		int set = -9999;
		if(top>0){
			set = st[--top];
                        System.out.print("Popped element is: "+set);
                }
		else
			System.out.println("Underflow");
		//display();
                
                display();
		return set;
	}
	void push(int num){
		if(top>=10)
			System.out.println("Overflow");
		else{
			st[top] = num;
                        top=top+1;
                        System.out.println("Pushed element is: "+num);
                }
		display();
	}
	void display(){
            System.out.println("\nStack contains current elements:");
                if (top==0)
                    System.out.println("Stack is empty");
                
		for(int i=0;i<top;i++)
			System.out.println(st[i]);
		System.out.println();
	}
}

class StackTest{
	public static void main(String args[]){
                //int val=0;
		Stack s1 = new Stack(), s2 = new Stack();
                System.out.print("Stack-1 content : ");
		s1.push(5);s1.pop();
                s1.push(13);
                //s1.display();
                //val=s1.pop();
                //System.out.print("Popped element is: "+val);
                //s1.display();
                System.out.print("Stack-2 content : ");
		s2.pop();s2.push(55);
                //s2.display();
	}
}

