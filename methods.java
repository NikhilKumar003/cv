public class methods {
    public static void main(String[] args) {
        methods s =new methods();
        s.sayHello();
        s.addNumber(33,44);
       int k= s.multiplyNum(22, 33);
        System.out.println(k);
    }
    void sayHello(){
        System.out.println("hello");
    }
    void addNumber(int a,int b){
        System.out.println(a+b);
    }
    int multiplyNum(int a, int b){
        int x= a*b;
        // System.out.println(x);
        return x;
       
    }
}
