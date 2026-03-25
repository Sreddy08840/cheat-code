import java.util.Scanner;
class poragrma{
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++)
        // {
        //     System.out.println("Hello World");
        // }
        // int i=5;
        // while(i>=1)
        // {
        //     System.out.println(i);
        //     i--;
        // }
        // int sum =0;
        // int i=1;
        // while(i<=10)
        // {
        //     sum +=i;
        //     i++;
        //      System.out.println(sum);
        // }
        // System.out.println(sum);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int factorial=1;
        int i=1;
        while(i<=n){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);

    }
}