package UsingThreadClass;

public class App extends Thread {

    private String threadName;

    public App(String threadName){
        this.threadName = threadName;
        System.out.println("Creatin... thread with thread name is "+ this.threadName);
    }
    @Override
    public void run(){
        System.out.println("Running thread..." + threadName);
        for (int i = 1; i < 5; i++){
            System.out.println("Thread for time " + i);
            try{
                Thread.sleep(2000);
            }catch( Exception e){
                System.out.println("Error");
            }
        }
    }


}
