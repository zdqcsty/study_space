package jichu.fanxing;

//泛型中的元祖
public class Test4<A,B> {

    public final A a;
    public final B b;


    public Test4(A a,B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Test4{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public static void main(String[] args){
        Test4<String,Integer> test4=new Test4("4",4);
        System.out.println(test4);
    }
    
}
