import java.util.Scanner;
public class coidtions2 {
   public static void main(String[] args) {
   int a,b,c;
   Scanner s= new Scanner(System.in);
   a=s.nextInt();
   b=s.nextInt();
   c=s.nextInt();
   if(a>b && a>c)
   {
    System.out.println(a);
   }
   else if (b>a && b>c) {
    System.out.println(b);
   }
   else if (c>a&&c>b){
    System.out.println(c);
   }
   else {
    System.out.println("number is zero");
   }

   }    
}
