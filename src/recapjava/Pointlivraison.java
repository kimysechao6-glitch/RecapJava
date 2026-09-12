/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recapjava;

/**
 *
 * @author Kimy
 */
public class Pointlivraison {
    private String enseigne;
    private Adresse adresse;
    private List<Colis> colisDeposes;
 
    public PointLivraison(String enseigne, Adresse adresse) {
        this.enseigne = enseigne;
        this.adresse = adresse;
        this.colisDeposes = new ArrayList<>();
    }
 
    public String getEnseigne() {
        return enseigne;
    }
 
    public void setEnseigne(String enseigne) {
        this.enseigne = enseigne;
    }
 
    public Adresse getAdresse() {
        return adresse;
    }
 
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
 
    public List<Colis> getColisDeposes() {
        return colisDeposes;
    }
 
    /**
     * Rattache un colis à ce point de livraison.
     * Package-private : appelé uniquement depuis Colis pour garder la cohérence
     * de la relation bidirectionnelle (voir Colis#rattacherA).
     */
    void ajouterColis(Colis colis) {
        if (!colisDeposes.contains(colis)) {
            colisDeposes.add(colis);
        }
    }
 
    /**
     * Calcule la rentabilité totale du point de livraison,
     * c'est-à-dire la somme des prix de tous les colis qui y ont été déposés.
     */
    public double calculerRentabiliteTotale() {
        double total = 0.0;
        for (Colis colis : colisDeposes) {
            total += colis.calculerPrix();
        }
        return total;
    }
 
    @Override
    public String toString() {
        return "PointLivraison{" +
                "enseigne='" + enseigne + '\'' +
                ", adresse=" + adresse +
                ", nbColis=" + colisDeposes.size() +
                '}';
    }
}
