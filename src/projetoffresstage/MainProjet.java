/*
*classe MainProjet, elle prend en compte la collection offreStage et Entreprise
* Elle prend aussi en compte la sérialisation, c'est a dire la sauvegarde 
* des données
*/

package projetoffresstage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import my.MenuPrincipal.MenuPrincipal;


/**
 *
 * @author stephan
 */
public class MainProjet {
    
    public static ArrayList<OffreStage> lesOffres = new ArrayList();
    public static ArrayList<Entreprise> lesEntreprises = new ArrayList();
    
    
    public static void main(String[] args) {
        
        //serialisation
        try
        {
            FileInputStream f = new FileInputStream("sauvegarder.csv");
            ObjectInputStream s = new ObjectInputStream(f);
            MainProjet.lesEntreprises = (ArrayList) s.readObject(); 
            MainProjet.lesOffres = (ArrayList) s.readObject();
        }
        catch(IOException e) {System.out.println("Nouveau fichier");}
        catch(ClassNotFoundException e) {System.out.println("Probleme");}
        
        
        
        MenuPrincipal monPrincipal = new MenuPrincipal();
        monPrincipal.setVisible(true);
        
        // MainProjet = new MainProjet();
        // MainProjet.setVisible(true);
    }
}