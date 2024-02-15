/**
 * The RunnableDemoLambdaExpression class demonstrates the creation of a thread
 * using a lambda expression to implement the Runnable interface. This approach
 * provides a concise and expressive way to define the task the thread will execute,
 * showcasing modern Java syntax and functionality.
 */
public class RunnableDemoLambdaExpression {

    /**
     * The main method is the entry point of the program. It demonstrates the creation
     * of a Thread object with a lambda expression that prints a message to the console.
     * It also illustrates a common mistake of calling run() directly on the Thread
     * object instead of using start() to properly initiate a new thread.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Thread thrd = new Thread(
                () -> System.out.println("sysout from other thread")
        );
        thrd.run(); // This call is incorrect for starting a new thread; it runs the lambda expression in the main thread.
        thrd.start(); // This is the correct call to start a new thread, which will execute the lambda expression separately.
        System.out.println("sysout from main thread");
    }
    
    /*
     * Expected output might be as follows:
     * sysout from other thread (due to direct run() call, executed in the main thread context)
     * sysout from main thread
     * sysout from other thread (executed in a new thread context after start() is called)
     */
}
