package Threads;

class Callme {
    void call (String msg) {
        System.out.print("[" + msg + "]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interruping process");
        }
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller (Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}