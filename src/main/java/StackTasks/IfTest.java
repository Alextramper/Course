package StackTasks;

public class IfTest {
    public static void main(String[] args) {
        IntStack mystack;
        FixedStack fs = new FixedStack(9);
        DynStack ds = new DynStack(8);

        mystack = fs;
        for (int i=0; i<10; i++) mystack.push(i);
        mystack = ds;
        for (int i=0; i<20; i++) mystack.push(i);

        mystack = fs;
        System.out.println("стек в FixStack");
        for (int i=0; i<6; i++)
            System.out.println(mystack.pop());

        mystack = ds;
        System.out.println("стек в DynStack");
        for (int i=0; i<20; i++)
            System.out.println(ds.pop());
    }
}

