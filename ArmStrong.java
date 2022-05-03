import java.util.*;

public class ArmStrong  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        ArmStrong1(n);
    }
    static void ArmStrong1(int n) {
            int last = 0, sum = 0, temp ,count=0;
            temp = n;
            while(temp>0){
                temp=temp/10;
                count++;
            }
            temp=n;
            while (temp > 0) {

                last = temp % 10;
                sum += Math.pow(last,count);
                temp = temp / 10;
            }
            if (sum == n)
                System.out.println("Armstrong");
            else
                System.out.println("not armstrong");
        }
    }




