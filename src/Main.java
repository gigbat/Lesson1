public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // out myThread
        myThread.start();

        MyThread myThread2 = new MyThread();
        // out myThread
        myThread2.start();

        // out main
        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // out thread
        thread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        /*System.out.println("My thread");
        someMethod();*/
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is - " + Thread.currentThread().getName() + " i = " + i);
        }
    }

    // Check print stack trace
    private void someMethod() {
        throw new RuntimeException();
    }
}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}