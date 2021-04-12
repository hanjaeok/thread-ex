package thread;

public class SingleThread2 implements Runnable{

    private int[] temp;

    public SingleThread2(){
        temp = new int[10];

        for(int start = 0 ; start < temp.length ; start++){
            temp[start] = start;
        }
    }

    @Override
    public void run() {
        for(int start:temp){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }

            System.out.println("Thread Name = " + Thread.currentThread().getName());
            System.out.println("temp Value = " + start);
        }
    }

    public static void main(String ar[]){
        SingleThread2 st2 = new SingleThread2();
        Thread t = new Thread(st2, "첫번째");

        t.start();
    }
}
