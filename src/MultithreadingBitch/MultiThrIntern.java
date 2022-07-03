package MultithreadingBitch;

public class MultiThrIntern implements Runnable{
    private int id;
    public MultiThrIntern(int id){
        this.id = id;
    }
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(i + " wątek z uzyciem Runnable " + id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
