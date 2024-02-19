import java.util.Scanner;

public class Ylikuormittaminen {
    public static void main(String[] args) {
        String ekaNimi, tokaNimi;
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ensimmäinen nimi: ");
        ekaNimi = lukija.nextLine();

        System.out.print("Anna toinen nimi: ");
        tokaNimi = lukija.nextLine();            

        System.out.println("\n**********");
        tervehdi();
        System.out.println("**********");

        tervehdi(ekaNimi);
        System.out.println("**********");

        tervehdi(ekaNimi, tokaNimi);
        System.out.println("**********");
    }

    public static void tervehdi() {
		 System.out.println("Terve!");
		 return;
		}

	public static void tervehdi(String ekaNimi) {
		System.out.println("Terve, " + ekaNimi);
		return;
	}

	public static void tervehdi(String ekaNimi, String tokaNimi) {
		System.out.println("Terve, " + ekaNimi + " ja " + tokaNimi);
		return;
	}

}