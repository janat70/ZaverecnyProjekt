/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.Scanner;

/**
 *
 * @author Jana
 */
public class ZaverecnyProjekt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Evidence  pojištěných");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");

        String volba;
        AdministracePojistence administrace = new AdministracePojistence();

        do {
            volba = sc.nextLine();
            try {

                int a = Integer.parseInt(volba);
                switch (a) {
                    case 1:
                        System.out.println("Zadej pojištěnce");
                        System.out.println("Zadej jméno: ");
                        String jmeno = sc.nextLine();
                        System.out.println("Zadej příjmení: ");
                        String prijmeni = sc.nextLine();
                        System.out.println("Zadej telefonní číslo: ");
                        String telefonniCislo = sc.nextLine();
                        System.out.println("Zadej věk: ");

                        String vek = sc.nextLine();
                        int vekint = Integer.parseInt(vek);

                        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vekint, telefonniCislo);

                        administrace.pridatPojistence(pojistenec);
                        break;

                    case 2:
                        administrace.vypisPojistence();

                        break;

                    case 3:
                        System.out.println("Zadej jmeno pojištěnce: ");
                        String hledaneJmeno = sc.nextLine();
                        System.out.println("Zadej příjmení pojištěnce: ");
                        String hledanePrijmeni = sc.nextLine();
                        administrace.vyhledejPojistence(hledaneJmeno, hledanePrijmeni);
                        break;

                    case 4:
                        System.out.println("Zadals volbu 4");
                        System.out.println("Zavírám evidenci pojištěných");
                        break;
                    default:
                        System.out.println("Zadal jsi nesprávnou volbu");

                }
            } catch (NumberFormatException e) {
                System.out.println("Zadaná hodnota musí být celočíselná, v rozsahu 1-4");
            }
            if (!volba.equals("4")) {
                System.out.println("Zadej další volbu.");
            }

        } while (!volba.equals("4"));

    }
}
