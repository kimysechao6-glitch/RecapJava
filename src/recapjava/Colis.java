/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recapjava;

/**
 *
 * @author Kimy
 */
public class Colis {
    private static final int SEUIL_500G = 500;
    private static final int SEUIL_2KG = 2000;
    private static final int SEUIL_5KG = 5000;
 
    private static final double TARIF_JUSQUA_500G = 1.99;
    private static final double TARIF_JUSQUA_2KG = 3.99;
    private static final double TARIF_JUSQUA_5KG = 5.99;
    private static final double TARIF_SUPERIEUR_5KG = 8.99;
 
    private static final double SURTAXE_INTERNATIONALE = 6.00;
 
    private int poidsEnGrammes;
    private String nomDestinataire;
    private Adresse adresseDestination;
    private PointLivraison pointLivraison; // rattachement obligatoire
 
    /**
     * Construit un colis. Le rattachement à un point de livraison est obligatoire :
     * il est donc exigé dès la construction (pas de colis "orphelin" possible).
     */
    public Colis(int poidsEnGrammes, String nomDestinataire, Adresse adresseDestination,
                 PointLivraison pointLivraison) {
        if (pointLivraison == null) {
            throw new IllegalArgumentException("Un colis doit obligatoirement être rattaché à un point de livraison.");
        }
        if (poidsEnGrammes <= 0) {
            throw new IllegalArgumentException("Le poids du colis doit être strictement positif.");
        }
 
        this.poidsEnGrammes = poidsEnGrammes;
        this.nomDestinataire = nomDestinataire;
        this.adresseDestination = adresseDestination;
        this.pointLivraison = pointLivraison;
 
        // Maintient la cohérence de la relation bidirectionnelle
        pointLivraison.ajouterColis(this);
    }
 
    public int getPoidsEnGrammes() {
        return poidsEnGrammes;
    }
 
    public String getNomDestinataire() {
        return nomDestinataire;
    }
 
    public Adresse getAdresseDestination() {
        return adresseDestination;
    }
 
    public PointLivraison getPointLivraison() {
        return pointLivraison;
    }
 
    /**
     * Calcule le prix du colis selon la grille tarifaire basée sur le poids,
     * puis ajoute la surtaxe internationale si la destination n'est pas la France.
     */
    public double calculerPrix() {
        double prix;
 
        if (poidsEnGrammes <= SEUIL_500G) {
            prix = TARIF_JUSQUA_500G;
        } else if (poidsEnGrammes <= SEUIL_2KG) {
            prix = TARIF_JUSQUA_2KG;
        } else if (poidsEnGrammes <= SEUIL_5KG) {
            prix = TARIF_JUSQUA_5KG;
        } else {
            prix = TARIF_SUPERIEUR_5KG;
        }
 
        if (adresseDestination != null && !adresseDestination.estEnFrance()) {
            prix += SURTAXE_INTERNATIONALE;
        }
 
        return prix;
    }
 
    @Override
    public String toString() {
        return "Colis{" +
                "destinataire='" + nomDestinataire + '\'' +
                ", poids=" + poidsEnGrammes + "g" +
                ", destination=" + adresseDestination +
                ", prix=" + String.format("%.2f", calculerPrix()) + "€" +
                '}';
    }
}
