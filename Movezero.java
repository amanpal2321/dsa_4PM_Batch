public class Movezero {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,1,0,1};
        MoveZero(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void MoveZero(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
}
