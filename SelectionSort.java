public class SelectionSort {
    public static void main(String[] args) {
        int[] a={5,8,6,2,7,2,1,6,8};
        selectionSort(a);
        for(int n:a){
            System.out.print(n+" ");
        }
    }
    public static void selectionSort(int[] a){
        
        for(int i=0;i<a.length;i++){
            int min=a[i], minIndex=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]< min){
                    min=a[j];
                    minIndex=j;
                }
            }
            a[minIndex] = a[i];
                a[i]= min;
        }
    }
}
