public class methods2 {
    static int currentBalance= 2000;
    public static void greetCustomer(){
        System.out.println("welcome to SBI");
    } 
    public static void deposit(int amount){
    currentBalance =currentBalance + amount; 
    System.out.println("After deposit current balance :"+ currentBalance);
    }
    public static void withdrawal(int amount){
    currentBalance =currentBalance - amount;
    System.out.println("After withdrawal current balance :"+ currentBalance);
    }
    public int getCurrentbalance(){
        return currentBalance;
    }

    public static void main(String[] args) {
        methods2 bank= new methods2();
        greetCustomer();
        System.out.println("current balance:"+ bank.getCurrentbalance());
        deposit(500);
        System.out.println("current balance:"+ bank.getCurrentbalance());
        withdrawal(300);
        System.out.println("current balance:"+ bank.getCurrentbalance());
        

        //System.out.println("then current balance :"+ currentBalance);
    }
}
