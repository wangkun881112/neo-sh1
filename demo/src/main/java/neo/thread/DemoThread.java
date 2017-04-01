package neo.thread;

public class DemoThread extends Thread {
    
    public DemoThread() {
    }

    public DemoThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        
        
        try {
            for(int i=1; i<=8 ;i++){
                Thread.sleep(3000);
                System.out.println(getName() + " is running, times = "+i+"/8 !");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
