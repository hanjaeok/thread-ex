package thread.Multi;

public class MultiThread {

    public static void main(String ar[]){
        ThreadEX threadEX = new ThreadEX();
        ThreadEX2 threadEX2 = new ThreadEX2();

        Thread thread1 = new Thread(threadEX, "A");
        Thread thread2 = new Thread(threadEX2, "B");

        thread1.start();
        thread2.start();

        Thread.currentThread().getName();
    }
}
