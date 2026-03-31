import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        int n = scanner.nextInt();
// Close Scanner class object
scanner.close();
for (int i = 0; i <= n; i++) {
int alphabet = 65; // ASCII value for 'A'
for (int j = n; j > i; j -- ) {
System.out.print(" ");
}
for (int k = 0; k < i; k++) {
System.out.print((char) (alphabet + k) + " ");

System.out.println();

}

}

}


}
