package simple;

public class Notify {
    public static void main(String[] args)
            throws InterruptedException {
        final PC pc = new PC();

        // Create a thread object that calls pc.produce()
        Thread t1 = new Thread(()-> {
            try
            {
                pc.produce();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        });

        // Create another thread object that calls
        // pc.consume()
        Thread t2 = new Thread(()-> {
            try
            {
                pc.produce();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(()-> {
            try
            {
                pc.consume();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
        t3.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
        t3.join();
    }

    public static class PC {
        // Prints a string and waits for consume()
        public void produce() throws InterruptedException
        {
            // synchronized block ensures only one thread
            // running at a time.
            synchronized(this)
            {
                System.out.println("producer thread running");

                // releases the lock on shared resource
                wait();

                // and waits till some other method invokes notify().
                System.out.println("Resumed");
            }
        }

        // Sleeps for some time and waits for a key press. After key
        // is pressed, it notifies produce().
        public void consume() throws InterruptedException
        {
            // this makes the produce thread to run first.
            Thread.sleep(1000);

            // synchronized block ensures only one thread
            // running at a time.
            synchronized(this)
            {
                System.out.println("Wait for 2 Second");

                Thread.sleep(2000);
                // notifies the produce thread that it
                // can wake up.
                notify();
//                notifyAll();

                System.out.println("Notified");
            }
        }
    }
}
