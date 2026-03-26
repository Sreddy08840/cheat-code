import java.util.*;
public class fact {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int factorial=1;
        do{
            factorial *= N;
            N--;
        }while(N > 0);
        System.out.println(factorial);
            factorial=1;
            do { 
            factorial *= M;
            M--;
        }while(M > 0);
        System.out.println(factorial);
    }
}
