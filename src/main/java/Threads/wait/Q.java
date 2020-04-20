package Threads.wait;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet)
            try {
                Thread.sleep(1000);
                wait();
            } catch(InterruptedException e) {
                System.out.println("Exception is catched");
            }
        System.out.println("Получено: " + n);
            valueSet = false;
            notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet)
            try{
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception is catched");
            }
        this.n = n;
            valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}
