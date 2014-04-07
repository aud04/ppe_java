/*
 * Classe de entreprise
 */

package projetoffresstage;

import java.io.Serializable;

/**
 *
 * @author stephan
 */
public class Entreprise implements Serializable {
    private String raisonSocial;
    private String adresseVilleEntreprise;
    private String adresseRueEntreprise;
    private String adresseCodePostalEntreprise;
    private String telEntreprise;
    private String secteurActivité;
    private String mail;

    public Entreprise(String raisonSocial, String adresseVilleEntreprise, 
            String adresseRueEntreprise, String adresseCodePostalEntreprise,
            String telEntreprise, String secteurActivité, String mail) {
        this.raisonSocial = raisonSocial;
        this.adresseVilleEntreprise = adresseVilleEntreprise;
        this.adresseRueEntreprise = adresseRueEntreprise;
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
        this.telEntreprise = telEntreprise;
        this.secteurActivité = secteurActivité;
        this.mail = mail;
    }

    /**
     * @return the raisonSocial
     */
    public String getRaisonSocial() {
        return raisonSocial;
    }

    /**
     * @param raisonSocial the raisonSocial to set
     */
    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    /**
     * @return the adresseVilleEntreprise
     */
    public String getAdresseVilleEntreprise() {
        return adresseVilleEntreprise;
    }

    /**
     * @param adresseVilleEntreprise the adresseVilleEntreprise to set
     */
    public void setAdresseVilleEntreprise(String adresseVilleEntreprise) {
        this.adresseVilleEntreprise = adresseVilleEntreprise;
    }

    /**
     * @return the adresseRueEntreprise
     */
    public String getAdresseRueEntreprise() {
        return adresseRueEntreprise;
    }

    /**
     * @param adresseRueEntreprise the adresseRueEntreprise to set
     */
    public void setAdresseRueEntreprise(String adresseRueEntreprise) {
        this.adresseRueEntreprise = adresseRueEntreprise;
    }

    /**
     * @return the adresseCodePostalEntreprise
     */
    public String getAdresseCodePostalEntreprise() {
        return adresseCodePostalEntreprise;
    }

    /**
     * @param adresseCodePostalEntreprise the adresseCodePostalEntreprise to set
     */
    public void setAdresseCodePostalEntreprise(String adresseCodePostalEntreprise){
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
    }

    /**
     * @return the telEntreprise
     */
    public String getTelEntreprise() {
        return telEntreprise;
    }

    /**
     * @param telEntreprise the telEntreprise to set
     */
    public void setTelEntreprise(String telEntreprise) {
        this.telEntreprise = telEntreprise;
    }

    /**
     * @return the secteurActivité
     */
    public String getSecteurActivité() {
        return secteurActivité;
    }

    /**
     * @param secteurActivité the secteurActivité to set
     */
    public void setSecteurActivité(String secteurActivité) {
        this.secteurActivité = secteurActivité;
    }
    
     /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
  
}
