import java.util.Scanner;
public class condition3 {
    public static void main(String[] args) {
        float a;
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        // b=s.nextInt();
        if (a>0)
        {
            System.out.println("positive");
        }
        else if(a<0){
           System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }

    }
}
