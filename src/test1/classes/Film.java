/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Film {
    private String titre;
    private Integer dureeEnMinutes;
    private String synopsys;
    private Integer annee;

    @Override
    public String toString(){
        return "FILM " + titre + " " + dureeEnMinutes + "minutes" + synopsys + " " + annee;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void setDureeEnMinutes(Integer dureeEnMinutes) {
        this.dureeEnMinutes = dureeEnMinutes;
    }

    public String getSynopsys() {
        return synopsys;
    }

    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public Integer getAnnée() {
        return annee;
    }

    public void setAnnée(Integer année) {
        this.annee = année;
    }
    
}
