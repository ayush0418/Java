public class Pattern
{
    public static void main(String[] args)
    {
        int n=4;
        for(int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
