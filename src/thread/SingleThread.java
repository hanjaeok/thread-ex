package thread;

public class SingleThread extends Thread{
    private int[] temp;

    public SingleThread(String threadname){
        super(threadname);
        temp = new int[10];

        for(int start=0; start < temp.length ; start++){
            temp[start] = start;
        }
    }

    public void run(){
        for(int start:temp){
            try{
                Thread.sleep(1000);

            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println("Thread Name = " + currentThread().getName());
            System.out.println("temp Value = " + start);
        }
    }

    public static void main(String ar[]) {
        SingleThread st = new SingleThread("첫번째");
        st.start();
    }
}
