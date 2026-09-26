public class Stock1 {
    public static void main(String[] args) {
        int[] n={4,5,9,8,6,3};
        int buy=n[0];
        int maxProfit=0;

        for(int i=0;i<n.length;i++){
            if(n[i]<buy){
                buy=n[i];
            }else if(n[i]-buy > maxProfit){
                maxProfit=n[i]-buy;
            }
        }
        System.out.println(maxProfit);
    }
}
