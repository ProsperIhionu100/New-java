/**
 * ThreadInterface
 */
public class ThreadInterface implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        
    }
    
    public static void main(String[] args) {
        Runnable r = new ThreadInterface();
        Thread td = new Thread(r);
        td.start();
    }
}