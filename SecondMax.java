class SecondMax{
    public static void main(String[] args) {
        int[] a={1,9,5,6,2,8,3,5,6,5,655,54};
        int SecondMax=getSecondMax(a);
        System.out.println("SecondMax is: "+ SecondMax);
        
    }
    public static int getSecondMax(int[] a){
        int max=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            int n = a[i];
            if(n>max){
                max=SecondMax;
                max=n;
            }
            else if(n>SecondMax && a[i]!=max){
                SecondMax=a[i];
            }
        }
        return SecondMax;
    }
}