public class ThreadClass extends Thread {
    public String word;

    public ThreadClass(String word){
        this.word = word;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        super.run();
        for (int i = 0; i <= 100; i+=5) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception");
        }
    }
}
    public static void main(String[] args) {
        ThreadClass th = new ThreadClass("firtsname");
        th.start();

        
    }
}

