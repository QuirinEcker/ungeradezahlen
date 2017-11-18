import java.util.Scanner;

public class Ecker_UngeradeZahlen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        System.out.print("Geben Sie die maximale ungerade Zahl ein :");
        input = scanner.nextInt();
        System.out.print("Ungerade Zahlen bis 20: ");

        for (int i = 1 ; i < input; i = i + 2){
            System.out.print(i + ", ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Summe der Zahlen: " + sum);
    }
}
