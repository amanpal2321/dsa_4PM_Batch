public class LeftRotation{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70};
        leftRotate(a, 50);
        for(int n:a)
            System.out.println(n+" ");
    }
    public static void leftRotate(int[] nums, int k){
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);

    }
}