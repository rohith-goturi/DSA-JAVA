public class pattern5 {
    public static void main(String args[]){
        int n = 4;
        for(int i=1; i<=n;i++){
            for(int k=1; k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
