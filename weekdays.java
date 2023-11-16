import java.util.Scanner;
public class weekdays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int day =s.nextInt();
        System.out.println(getdayName(day));
    }
    public static String getdayName(int day) {
            String dayName= "";
            switch (day) {
                case 1: dayName = "Sunday"; break;
                case 2: dayName = "Monday"; break;
                case 3: dayName = "Tuesday"; break;
                case 4: dayName = "Wednesday"; break;
                case 5: dayName = "Thursday"; break;
                case 6: dayName = "Friday"; break;
                case 7: dayName = "Saturday"; break;     
            
                default: dayName = "Invaid dayName source codegit";
                    break;
            }
                return dayName;
          
    }
}
