/**
 * The MyFirstThread class extends the Thread class to demonstrate
 * a simple example of thread behavior. It creates a thread that
 * prints a message to the console after a short pause.
 */
public class MyFirstThread extends Thread {

    /**
     * This method runs in a separate thread when the thread is started.
     * It sleeps for a short period and then prints a message to the console.
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
        // Print a message from the thread to the console
        System.out.println("sysout from other thread");
    }

    /**
     * The main method from where the program starts. It demonstrates
     * creating and starting a MyFirstThread and prints a message from the main thread.
     *
     * @param args Not used in this example.
     */
    public static void main(String[] args) {
    	MyFirstThread thread = new MyFirstThread();
        thread.start(); // Start the thread
        System.out.println("sysout from main thread");
    }
    
    /* Output might be as follows:
     * sysout from main thread
     * sysout from other thread
     */
}
