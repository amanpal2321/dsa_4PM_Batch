import java.util.Scanner;
class SecondMin{
    public static void main(String[] args){
        System.out.print("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter Element Array");

        int FirstMin=Integer.MAX_VALUE;
        int SecondMin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<FirstMin){
                SecondMin = FirstMin;
                FirstMin=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<SecondMin && arr[i]!=FirstMin){
                SecondMin=arr[i];
            }
        }
        System.out.println("Second Smallest No: "+ SecondMin);
    }      
}