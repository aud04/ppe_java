/*
 *Classe qui permet de consulter les offres possible pour les stages
 */
package my.MenuConsulter;
import projetoffresstage.MainProjet;
import projetoffresstage.OffreStage;
import projetoffresstage.Entreprise;
/**
 *
 * @author Audrey
 */
public class MenuConsulter extends javax.swing.JFrame {

    /**
     * Creates new form MenuConsulter
     */
    int i=0;
    public MenuConsulter() {
        initComponents();
        
        //charge la page de consultation des offres d'après la saisie des offres
        
        if(MainProjet.lesOffres.size() != 0){
            txtNomEntrepriseC.setText((((OffreStage) MainProjet.lesOffres.get(0)).getLEntreprise())); //getRaisonSocial
            txtVilleS.setText((((Entreprise) MainProjet.lesEntreprises.get(0)).getAdresseVilleEntreprise()));
            txtMailC.setText((((Entreprise) MainProjet.lesEntreprises.get(0)).getMail()));
            txtLibelleC.setText(((OffreStage) MainProjet.lesOffres.get(0)).getLibelleOffre());
            txtDescriptifC.setText(((OffreStage) MainProjet.lesOffres.get(0)).getDescriptifOffre());
            txtDomaineC.setText(((OffreStage) MainProjet.lesOffres.get(0)).getDomaineOffre());
            txtDateDebC.setText(((OffreStage) MainProjet.lesOffres.get(0)).getDateDebutOffre());
            txtDureeS.setText(((OffreStage) MainProjet.lesOffres.get(0)).getDureeOffre());
            
            
        }
             }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomEntrepriseC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVilleS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMailC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDomaineC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLibelleC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDateDebC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDureeS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriptifC = new javax.swing.JTextArea();
        btnPrecedent = new javax.swing.JButton();
        btnSuivant = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 188, 193));

        jLabel1.setText("CONSULTATION DES OFFRES DE STAGE");

        jLabel2.setText("Nom de l'entreprise");

        txtNomEntrepriseC.setEditable(false);

        jLabel3.setText("Ville du stage");

        txtVilleS.setEditable(false);

        jLabel4.setText("Mail contact");

        txtMailC.setEditable(false);

        jLabel5.setText("Domaine offre");

        txtDomaineC.setEditable(false);

        jLabel6.setText("Libellé de l'offre");

        txtLibelleC.setEditable(false);

        jLabel7.setText("Date de début du stage");

        txtDateDebC.setEditable(false);

        jLabel8.setText("Durée du stage");

        txtDureeS.setEditable(false);

        jLabel9.setText("Descriptif de l'offre");

        txtDescriptifC.setEditable(false);
        txtDescriptifC.setColumns(20);
        txtDescriptifC.setRows(5);
        jScrollPane1.setViewportView(txtDescriptifC);

        btnPrecedent.setText("Précédent");
        btnPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedentActionPerformed(evt);
            }
        });

        btnSuivant.setText("Suivant");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });

        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomEntrepriseC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVilleS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrecedent)
                .addGap(65, 65, 65)
                .addComponent(btnSuivant)
                .addGap(72, 72, 72)
                .addComponent(btnFermer)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMailC, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDateDebC, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDomaineC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDureeS, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLibelleC))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomEntrepriseC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtVilleS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMailC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDomaineC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLibelleC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDateDebC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(txtDureeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrecedent)
                    .addComponent(btnSuivant)
                    .addComponent(btnFermer))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedentActionPerformed
       
        //bouton precedent et charge les offres
        
        if (i >= 0 && i!=0){
            i--;
           txtNomEntrepriseC.setText((((OffreStage) MainProjet.lesOffres.get(i)).getLEntreprise()));
            txtVilleS.setText((((Entreprise) MainProjet.lesEntreprises.get(i)).getAdresseVilleEntreprise()));
            txtMailC.setText((((Entreprise) MainProjet.lesEntreprises.get(i)).getMail()));
            txtLibelleC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getLibelleOffre());
            txtDescriptifC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDescriptifOffre());
            txtDomaineC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDomaineOffre());
            txtDateDebC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDateDebutOffre());
            txtDureeS.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDureeOffre());
            
            
        
    }
            
    
    }//GEN-LAST:event_btnPrecedentActionPerformed

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
       
        //bouton suivant et charge les offres
        
        if (i < (MainProjet.lesOffres.size()-1)){
            i++;
            txtNomEntrepriseC.setText((((OffreStage) MainProjet.lesOffres.get(i)).getLEntreprise()));
            txtVilleS.setText((((Entreprise) MainProjet.lesEntreprises.get(i)).getAdresseVilleEntreprise()));
            txtMailC.setText((((Entreprise) MainProjet.lesEntreprises.get(i)).getMail()));
            txtLibelleC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getLibelleOffre());
            txtDescriptifC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDescriptifOffre());
            txtDomaineC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDomaineOffre());
            txtDateDebC.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDateDebutOffre());
            txtDureeS.setText(((OffreStage) MainProjet.lesOffres.get(i)).getDureeOffre());
            

       }
    }//GEN-LAST:event_btnSuivantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsulter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsulter().setVisible(true);
                
                
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnPrecedent;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDateDebC;
    private javax.swing.JTextArea txtDescriptifC;
    private javax.swing.JTextField txtDomaineC;
    private javax.swing.JTextField txtDureeS;
    private javax.swing.JTextField txtLibelleC;
    private javax.swing.JTextField txtMailC;
    private javax.swing.JTextField txtNomEntrepriseC;
    private javax.swing.JTextField txtVilleS;
    // End of variables declaration//GEN-END:variables
}
