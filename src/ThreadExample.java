class MyDaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(Thread.currentThread().isDaemon());
                System.out.println("Daemon thread is running...");
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true);  // Set as daemon thread
//        daemonThread.setDaemon(false);
        daemonThread.start();


        try {
//            Thread.currentThread().setDaemon(true); // you cannot set the current thread as daemon thread
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is finished.");

    }
}
