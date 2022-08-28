import java.util.*;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 numbers (enter 0 to exit)");
        int num = sc.nextInt();
        int sum = 0;


            for (int i = 1; i < 7;i++) {

                sum = sum + num;
                num = sc.nextInt();

                if(num==0){
                    break;
                }
            }

        System.out.println("Your total is " + sum);

    }
}
