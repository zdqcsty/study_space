package design_mode.producerConsumer;

import java.util.ArrayList;

public class Storage<T> {

    private int index=0;
    private int Max=10;
    public ArrayList<T> list=new ArrayList<T>();

    public synchronized void  product(T item) throws InterruptedException {

        while(index>=Max){
        System.out.println("仓库已满");
        this.wait();
        System.out.println("生产者等待");
    }
        list.add(item);
        index++;
        System.out.println("生产 "+item.toString());
        this.notify();
}

    public synchronized void consume() throws InterruptedException {

        while (index<=0){
            System.out.println("仓库已空");
            this.wait();
            System.out.println("仓库不为空，消费者等待");
        }
        index--;
        T item = list.remove(index);
        this.notify();
        System.out.println("消费     "+item.toString());
    }

}
