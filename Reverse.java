class Reverse{
    public static void main(String[] args) {
        int[] a={14,85,96,75,25,64};
        reverse(a);
        for(int n : a)
            System.out.println(n+" ");
        
    }
    public static void  reverse(int[] a){
        int start=0;
        int end=a.length-1;

        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start+=1;
            end-=1;
        }
    } 
}