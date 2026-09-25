import java.util.Scanner;
public class ThirdMax {
    public static void main(String[] args) {
        System.out.println("Enter Array Size: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element: 5");
        
        long Max=Long.MIN_VALUE;
        long SMax=Long.MIN_VALUE;
        long TMax=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                TMax=SMax;
                SMax=Max;
                Max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>SMax && arr[i]!=Max){
                TMax=SMax;
                SMax=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>TMax && arr[i]!=SMax && arr[i]!=Max){
                TMax=arr[i];
            }
        }
        System.out.println("Third Largest Element is: "+(long)TMax);
    }
}
