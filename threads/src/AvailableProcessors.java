/**
 * The AvailableProcessors class is designed to demonstrate how to retrieve
 * the number of available processors (or cores) that the Java Virtual Machine
 * can use. This information can be useful for optimizing the performance of
 * multi-threaded applications by allowing them to make informed decisions
 * about resource allocation and workload distribution.
 */
public class AvailableProcessors {

    /**
     * The main method is the entry point of the program. It retrieves and
     * prints the number of processors available to the Java Virtual Machine
     * to the standard output.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Retrieves the number of available processors or processing cores available to the JVM and prints it out
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
