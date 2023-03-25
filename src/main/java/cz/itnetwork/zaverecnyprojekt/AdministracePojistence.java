/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.ArrayList;

/**
 *
 * @author Jana
 */
public class AdministracePojistence {

    private static final ArrayList<Pojistenec> pojistenci = new ArrayList<>();

    public void pridatPojistence(Pojistenec pojistenec) {
        pojistenci.add(pojistenec);
        System.out.println("Pojištěnec " + pojistenec.toString() + " byl úspěšně přidán");
    }

    public void vypisPojistence() {
        for (Pojistenec pojistenec : pojistenci) {

            System.out.println(pojistenec.toString());
        }
    }

    public void vyhledejPojistence(String jmeno, String prijmeni) {
        Pojistenec nalezenyPojistenec = null;
        for (Pojistenec pojistenec : pojistenci) {

            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni)) {
                nalezenyPojistenec = pojistenec;
                break;
            }
        }

        if (nalezenyPojistenec != null) {
            System.out.println(nalezenyPojistenec.toString()); 
        } else {

            System.out.println(String.format("Pojistenec %s %s nenalezen.", jmeno, prijmeni));
        }
    }

}
