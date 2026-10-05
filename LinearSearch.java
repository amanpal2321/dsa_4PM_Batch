class LinearSearch{
    public static void main(String[] args) {
        int[] a={1,5,8,8,7,3,5};
        int target=8;
        int index=-1;
        for(int i=0;i<a.length;i++){
           if(a[i] == target){
            index = i;
            System.out.print(index+" ");
           }
        }
        
          }
}