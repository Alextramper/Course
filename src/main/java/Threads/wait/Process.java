package Threads.wait;

public class Process {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите CTRL+F2");
    }
}
