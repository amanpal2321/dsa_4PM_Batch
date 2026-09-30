public class Insertionsort {
    public static void main(String[] args) {
        int[] a={51,95,36,87,2,6};
        insertionsort(a);
        for(int n:a){
            System.out.print(n+" ");
        }
    }
    public static void insertionsort(int[] a){
        for(int i=1;i<a.length;i++){
            int pivot = a[i];
            int j=i-1;
            while(j>=0 && a[j]>pivot){
                a[j+1]=a[i];
                j--;
            }
            a[j+1]=pivot;
        }
    }
}
