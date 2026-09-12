/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recapjava;

/**
 *
 * @author Kimy
 */
public class Adresse {
    private String numeroVoie;
    private String codePostal;
    private String ville;
    private String pays;
 
    public Adresse(String numeroVoie, String codePostal, String ville, String pays) {
        this.numeroVoie = numeroVoie;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }
 
    public String getNumeroVoie() {
        return numeroVoie;
    }
 
    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }
 
    public String getCodePostal() {
        return codePostal;
    }
 
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
 
    public String getVille() {
        return ville;
    }
 
    public void setVille(String ville) {
        this.ville = ville;
    }
 
    public String getPays() {
        return pays;
    }
 
    public void setPays(String pays) {
        this.pays = pays;
    }
 
    /**
     * Indique si l'adresse est en France.
     * La comparaison ignore la casse et les espaces superflus.
     */
    public boolean estEnFrance() {
        return pays != null && pays.trim().equalsIgnoreCase("France");
    }
 
    @Override
    public String toString() {
        return numeroVoie + ", " + codePostal + " " + ville + ", " + pays;
    }
}
