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
        PointLivraison epicerieMartin = new PointLivraison("Épicerie Martin", adresseEpicerie);
 
        Adresse adressePressing = new Adresse("5 avenue Foch", "75008", "Paris", "France");
        PointLivraison pressingLuxe = new PointLivraison("Pressing de Luxe", adressePressing);
 
        // Création de colis rattachés au point relais "Épicerie Martin"
        Adresse destClientFr = new Adresse("3 impasse des Roses", "31500", "Toulouse", "France");
        Colis colis1 = new Colis(350, "Dupont Jean", destClientFr, epicerieMartin); // <=500g -> 1.99€
 
        Adresse destClientBe = new Adresse("10 rue de Bruxelles", "1000", "Bruxelles", "Belgique");
        Colis colis2 = new Colis(1800, "Lemoine Sophie", destClientBe, epicerieMartin); // <=2kg + international
 
        Adresse destClientFr2 = new Adresse("22 chemin du Moulin", "31200", "Toulouse", "France");
        Colis colis3 = new Colis(4200, "Bernard Alice", destClientFr2, epicerieMartin); // <=5kg -> 5.99€
 
        // Colis rattaché au pressing
        Adresse destClientUs = new Adresse("500 Broadway", "10012", "New York", "USA");
        Colis colis4 = new Colis(6000, "Smith John", destClientUs, pressingLuxe); // >5kg + international
 
        // Affichage du détail des colis
        System.out.println("=== Détail des colis ===");
        System.out.println(colis1);
        System.out.println(colis2);
        System.out.println(colis3);
        System.out.println(colis4);
 
        // Calcul de la rentabilité de chaque point de livraison
        System.out.println("\n=== Bilan financier des points de livraison ===");
        System.out.printf("Rentabilité de %s : %.2f €%n",
                epicerieMartin.getEnseigne(), epicerieMartin.calculerRentabiliteTotale());
        System.out.printf("Rentabilité de %s : %.2f €%n",
                pressingLuxe.getEnseigne(), pressingLuxe.calculerRentabiliteTotale());
    }
}
