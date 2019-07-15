package design_mode.producerConsumer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Storage storage=new Storage();

        new Thread(new Producer(storage)).start();
        new Thread(new Consumer(storage)).start();
    }
}
