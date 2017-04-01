package neo.main;

import neo.thread.DemoThread;

public class MainThreadTest {

    public static void main(String[] args) {
        int sum = count();
        System.out.println("主线程结束，总计数： " + sum);
    }
    
    public static int count(){
        
        int count = 0;
        new DemoThread("线程").start();
        
            for(int i=0; i<9 ;i++){
                sleep(500);
                count++;
                System.out.println("当前计数为： " + count);
            }
        
        return count;
    }
    
    public static void sleep(long mm){
        try {
           Thread.sleep(mm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
