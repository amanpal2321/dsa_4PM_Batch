public class Bubblesort {
    public static void main(String[] args) {
        int[] a={10,20,15,30,40,50};
        BubbleSort(a);
        for(int n:a){
            System.out.print(n+" ");
        }
        }
        public static void BubbleSort(int[] a){
            boolean isSorted = true;
            for(int i=0;i<a.length-1;i++){
                for(int j=0;j<a.length-1-i;j++){
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        isSorted = false;
                    }
            }
            if(isSorted)
                break;
            
        }
        
    }
}
