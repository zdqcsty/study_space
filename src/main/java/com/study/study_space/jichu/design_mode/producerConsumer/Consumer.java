package design_mode.producerConsumer;

public class Consumer implements Runnable{

    private Storage storage;

    public Consumer(Storage storage){
        this.storage=storage;
    }

    @Override
    public void run() {

        for (int i=0;i<20;i++){
            try {
                storage.consume();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
