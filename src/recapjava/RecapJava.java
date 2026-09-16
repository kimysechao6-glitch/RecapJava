/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recapjava;

/**
 *
 * @author Kimy
 */
public class RecapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Adresse adresseEpicerie = new Adresse("12 rue des Lilas", "31000", "Toulouse", "France");
        Pointlivraison epicerieMartin = new Pointlivraison("Épicerie Martin", adresseEpicerie);
 
        Adresse adressePressing = new Adresse("5 avenue Foch", "75008", "Paris", "France");
        Pointlivraison pressingLuxe = new Pointlivraison("Pressing de Luxe", adressePressing);

        Adresse destClientFr = new Adresse("3 impasse des Roses", "31500", "Toulouse", "France");
 
        Adresse destClientBe = new Adresse("10 rue de Bruxelles", "1000", "Bruxelles", "Belgique");
 
        Adresse destClientFr2 = new Adresse("22 chemin du Moulin", "31200", "Toulouse", "France");
        
        System.out.println("=== Détail des colis ===");
        System.out.println("\n=== Bilan financier des points de livraison ===");
        System.out.printf("Rentabilité de %s : %.2f €%n",
                epicerieMartin.getEnseigne(), epicerieMartin.calculerRentabiliteTotale());
        System.out.printf("Rentabilité de %s : %.2f €%n",
                pressingLuxe.getEnseigne(), pressingLuxe.calculerRentabiliteTotale());
    }
}
