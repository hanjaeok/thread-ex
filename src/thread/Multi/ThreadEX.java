package thread.Multi;

public class ThreadEX implements Runnable{
    int TestNum = 0;

    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++){
            if(Thread.currentThread().getName().equals("A")){
                System.out.println("===========================");
                TestNum++;
            }
            System.out.println("ThreadName = " + Thread.currentThread().getName());

            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(TestNum);
    }
}
