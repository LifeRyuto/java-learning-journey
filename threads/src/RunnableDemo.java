/**
 * The RunnableDemo class implements the Runnable interface, demonstrating
 * how to create a thread in Java using the Runnable approach. This class
 * defines the task that will be executed in a separate thread, which includes
 * a short pause followed by printing a message to the console.
 */
public class RunnableDemo implements Runnable {

    /**
     * The run method contains the code that will be executed by the new thread.
     * It includes a sleep statement to simulate a time-consuming task and
     * then prints a message to the console.
     */
    @Override
    public void run() {
        try {
            // Pause this thread for 100 milliseconds
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Print the stack trace if the thread is interrupted
            e.printStackTrace();
        }
        // Print a message from the newly created thread to the console
        System.out.println("sysout from other thread using Runnable");
    }

    /**
     * The main method is the entry point of the program. It creates an instance
     * of RunnableDemo, wraps it into a Thread object, and starts the thread.
     * It also demonstrates the difference between calling run() and start()
     * on a thread object.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        RunnableDemo runnable = new RunnableDemo();
        Thread thrd = new Thread(runnable);
        thrd.run(); // Incorrectly calling run instead of start. This will not start a new thread but run in the main thread.
        thrd.start(); // Correctly starts a new thread.
        System.out.println("sysout from main thread");
    }
    
    /*
     * Output might be as follows:
     * sysout from other thread using Runnable (due to direct run() call, executed in the main thread context)
     * sysout from main thread
     * sysout from other thread using Runnable (executed in a new thread context after start() is called)
     */
}
