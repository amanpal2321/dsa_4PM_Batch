import java.util.Scanner;
public class Top150Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Arrival Time: ");
            int arrivalTime=sc.nextInt();
            System.out.print("Enter Delayed Time: ");
            int delayedTime=sc.nextInt();
        
        System.out.println((arrivalTime+delayedTime)%24);

    }
}
