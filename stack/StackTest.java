public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.peek();
        s.push(0);
        s.push(1);
        s.peek();
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
        s.show();

    }
}

class Stack {
    int top = 0;
    int[] stack = new int[5];

    // push method
    public void push(int data) {
        if (top < stack.length) {
            stack[top] = data;
            top++;
        } else {
            System.out.println("Stack Overflow Error");
        }
    }

    // pop maethod
    public void pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
        } else {
            stack[top - 1] = 0;
            top--;
        }

    }

    // size method
    public int size() {
        return top;
    }

    // peek method
    public void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            System.out.println(stack[top - 1]);
        }

    }

    // isEmpty method
    public boolean isEmpty() {
        return top <= 0;

    }

    // show method
    public void show() {
        for (int x : stack) {
            System.out.print(x + " ");
        }
    }
}
