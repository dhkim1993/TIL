package Thread_Package;

public class DaemonThreadEx1 implements Runnable{

    @Override
    public void run(){
        while(true){
            System.out.println("데몬쓰레드가 실행중");
            try{Thread.sleep(500);}
            catch(InterruptedException e ){
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {

        Thread dt = new Thread(new DaemonThreadEx1());
        dt.setDaemon(true);
        dt.start();
        try{
        Thread.sleep(1000);}
        catch(InterruptedException e ){
            e.printStackTrace();
        }
        System.out.println("데몬쓰레드가 종료됨");
    }
}
