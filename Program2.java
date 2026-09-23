public class Program2 {
    public static void main(String[] args) {
        int[] arr ={1,15,6,3};
        int numsum=0;
        int digitsum=0;
        for(int i=0;i<arr.length;i++){
            numsum=numsum+arr[i];
            int  num = arr[i];
            while (num > 0) {
                digitsum = digitsum + (num % 10);
                num = num/10;
                
            }
        }
        System.out.println(numsum - digitsum);
    }
}
