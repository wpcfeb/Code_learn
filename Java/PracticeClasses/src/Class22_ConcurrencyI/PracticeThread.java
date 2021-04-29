package Class22_ConcurrencyI;

public class PracticeThread {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("Hello1");
            }
        };
        t.start();
        System.out.println("Hello2");
//        t.join();
        System.out.println("Hello3");
    }

}

class Thread {
    public void run(){
        // what this thread need to do.
    }
    public void start(){ // when this method is called, the thread is ready for scheduling.
        // ... prepare...
        run();
        //...cleanup..
    }
}


