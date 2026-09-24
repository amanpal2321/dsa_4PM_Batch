public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,9,8,4,9,6,15};
        int target = 17;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Index: "+i+" "+j);
                
                }
            }
        }
    }
}
