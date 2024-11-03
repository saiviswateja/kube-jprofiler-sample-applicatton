public class HelloWorld {
    public static void main(String[] args) {
        String javaOpts = System.getenv("JAVA_OPTS");
        System.out.println("JAVA_OPTS: " + javaOpts);
        // Keep the application running to allow profiling
        while (true) {
            try {
                System.out.println("Hello, World!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}