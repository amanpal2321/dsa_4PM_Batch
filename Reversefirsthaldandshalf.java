public class Reversefirsthaldandshalf {
    
    public static void main(String[] args) {
        int[] a={14,85,96,75,25,64};
        reverse(a, 0, a.length/2-1);
        reverse(a,a.length/2, a.length-1);
        for(int n : a)
            System.out.println(n+" ");
        
    }
    public static void  reverse(int[] a, int start, int end){
        

        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start+=1;
            end-=1;
        }
    } 
}

