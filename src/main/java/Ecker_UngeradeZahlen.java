/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: Ungerade Zahlen
 * Autoren:     Ecker Quirin
 * Version:     1.0
 * Datum:       18.11.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Ausgeben der Underaden Zahlen und deren Summen.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Ausgen der Ungeraden Zahlen mit einer Schleife.
 *
 * ----------------------------------------------------------
*/

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
