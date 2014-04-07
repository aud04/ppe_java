/*
 * Classe de l'offre de stage
 */

package projetoffresstage;

import java.io.Serializable;

/**
 *
 * @author stephan
 */
public class OffreStage implements Serializable {
    private String lEntreprise;
    private String libelleOffre;
    private String descriptifOffre;
    private String DomaineOffre;
    private String dateDebutOffre;
    private String dureeOffre;
    private String cheminOffre;
    
    private boolean Valide;

    public OffreStage(String lEntreprise, String libelleOffre, 
            String descriptifOffre, String DomaineOffre, String dateDebutOffre,
            String dureeOffre, String cheminOffre) {
        this.lEntreprise = lEntreprise;
        this.libelleOffre = libelleOffre;
        this.descriptifOffre = descriptifOffre;
        this.DomaineOffre = DomaineOffre;
        this.dateDebutOffre = dateDebutOffre;
        this.dureeOffre = dureeOffre;
        this.cheminOffre = cheminOffre;
        this.Valide = true;
    }
    
    /**
     * @return the nomEntreprise
     */
    public String getLEntreprise() {
        return lEntreprise;
    }

    /**
     * @param nomEntreprise the nomEntreprise to set
     */
    public void setLEntreprise(String lEntreprise) {
        this.lEntreprise = lEntreprise;
    }

    /**
     * @return the libelleOffre
     */
    public String getLibelleOffre() {
        return libelleOffre;
    }

    /**
     * @param libelleOffre the libelleOffre to set
     */
    public void setLibelleOffre(String libelleOffre) {
        this.libelleOffre = libelleOffre;
    }

    /**
     * @return the descriptifOffre
     */
    public String getDescriptifOffre() {
        return descriptifOffre;
    }

    /**
     * @param descriptifOffre the descriptifOffre to set
     */
    public void setDescriptifOffre(String descriptifOffre) {
        this.descriptifOffre = descriptifOffre;
    }

    /**
     * @return the DomaineOffre
     */
    public String getDomaineOffre() {
        return DomaineOffre;
    }

    /**
     * @param DomaineOffre the DomaineOffre to set
     */
    public void setDomaineOffre(String DomaineOffre) {
        this.DomaineOffre = DomaineOffre;
    }

    /**
     * @return the dateDebutOffre
     */
    public String getDateDebutOffre() {
        return dateDebutOffre;
    }

    /**
     * @param dateDebutOffre the dateDebutOffre to set
     */
    public void setDateDebutOffre(String dateDebutOffre) {
        this.dateDebutOffre = dateDebutOffre;
    }

    /**
     * @return the dureeOffre
     */
    public String getDureeOffre() {
        return dureeOffre;
    }

    /**
     * @param dureeOffre the dureeOffre to set
     */
    public void setDureeOffre(String dureeOffre) {
        this.dureeOffre = dureeOffre;
    }

    /**
     * @return the cheminOffre
     */
    public String getCheminOffre() {
        return cheminOffre;
    }

    /**
     * @param cheminOffre the cheminOffre to set
     */
    public void setCheminOffre(String cheminOffre) {
        this.cheminOffre = cheminOffre;
    }

    /**
     * @return the Valide
     */
    public boolean isValide() {
        return Valide;
    }

    /**
     * @param Valide the Valide to set
     */
    public void setValide(boolean Valide) {
        this.Valide = Valide;
    }
}
