package MultithreadingBitch;

public class MultiThrExt extends Thread{
    private int id;
    public MultiThrExt(int id){
        this.id = id;
    }
    /* Podczas używania wątków należy nadpisać metode run()*/
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(i + " wątek " + id);
            if(id == 2){
                throw new RuntimeException("Wyjatek");
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
