package shujujiegou;

public class ArrayListShixian<T> {

    Object[] arrData;
    int capacity;
    int current;

    public ArrayListShixian(){
        this(10);
    }

    public ArrayListShixian(int shuzi){

        if (shuzi<0){
            throw new RuntimeException("capacity could not < 0");
        }
        arrData=new Object[shuzi];
        current=0;
    }

    public boolean add(T t){
        ensureCapacity(current);
        arrData[current]=t;
        current++;
        return true;
    }

    public T get(int sub){
        return (T)arrData[sub];
    }

    public void ensureCapacity(int current){

        if (current==this.capacity){
            this.capacity=this.capacity+10;
            Object[] newArrData=new Object[capacity];
            for (int i=0;i<current;i++){
                newArrData[i]=arrData[i];
            }
            arrData=newArrData;
        }
    }

    public void  validateIndex(int index){

        if (index<0||index>capacity){
            throw new RuntimeException("下角标不正确");
        }
    }

    public Integer length(){
        return current;
    }

    public boolean delete(int index){
        validateIndex(index);
        Object [] newArrData=new Object[capacity];

        for (int i=0;i<this.current;i++){

            if (i<index) {
                newArrData[i] = arrData[i];
            }else if (i==index){

            }else{
                newArrData[i-1]=arrData[i];
            }
        }
        current--;
        arrData=newArrData;
        return true;
    }

    public String toString(){

        StringBuilder sb=new StringBuilder();

        for (int i=0;i<current;i++){
            sb.append(" "+arrData[i]);
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        ArrayListShixian al=new ArrayListShixian();
        al.add("name");
        al.add("zeng");
        System.out.println(al);
        al.delete(1);
        System.out.println(al);
    }
}
