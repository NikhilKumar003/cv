public class methods {
    public static void main(String[] args) {
        methods s =new methods();
        s.sayHello();
        s.addNumber(33,44);
       int k= s.multiplyNum(22, 33);
        System.out.println(k);
        s.difNum(44, 21);
    }
    void sayHello(){
        System.out.println("hello");
    }
    void addNumber(int a,int b){
        System.out.println(a+b);
    }
    int multiplyNum(int a, int b){
        int y= a*b;
        System.out.println(y);//just for practice
        return y;
          }
          
            void difNum(int a,int b){
                System.out.println(a-b);

          }
}
