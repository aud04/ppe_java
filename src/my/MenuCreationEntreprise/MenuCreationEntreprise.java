/*
 * Classe qui permet la création d'une entreprise
 */

package my.MenuCreationEntreprise;

import javax.swing.JOptionPane;
import projetoffresstage.Entreprise;
import projetoffresstage.MainProjet;
import my.MenuPrincipal.MenuPrincipal;




/**
 *
 * @author stephan
 */
public class MenuCreationEntreprise extends javax.swing.JFrame {

    /**
     * Creates new form MenuCreationEntreprise
     */
    public MenuCreationEntreprise() {
        initComponents();
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
        txtTitre = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        Adresse1 = new javax.swing.JLabel();
        txtAdresse1 = new javax.swing.JTextField();
        Adresse2 = new javax.swing.JLabel();
        txtAdresse2 = new javax.swing.JTextField();
        Adresse3 = new javax.swing.JLabel();
        txtAdresse3 = new javax.swing.JTextField();
        Mail = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        Tel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        Secteur = new javax.swing.JLabel();
        txtSecteur = new javax.swing.JTextField();
        btnEnvoyer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 205, 209));

        txtTitre.setText("CRÉATION D'UNE ENTREPRISE");

        Nom.setText("Nom de l'entreprise");

        Adresse1.setText("Adresse (Numéro et rue)");

        Adresse2.setText("Adresse (code postal)");

        Adresse3.setText("Adresse (Ville)");

        Mail.setText("Mail du contact");

        Tel.setText("Téléphone du contact");

        Secteur.setText("Secteur d'activité de l'entreprise");

        btnEnvoyer.setText("Envoyer");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerActionPerformed(evt);
            }
        });

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEnvoyer)
                            .addComponent(Secteur))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnAnnuler)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Adresse1)
                            .addComponent(Adresse2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAdresse1)
                                .addGap(165, 165, 165))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Adresse3)
                                    .addComponent(Mail))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdresse3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nom)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(txtTitre))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(189, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtTitre)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nom, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Adresse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Adresse2)
                    .addComponent(txtAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adresse3)
                    .addComponent(txtAdresse3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mail)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Secteur)
                    .addComponent(txtSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvoyer)
                    .addComponent(btnAnnuler))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
       
        this.dispose(); //quite la page crée une entreprise et retourne a la page principal
        
        
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        
        // Controle du formulaire d'envoie d'une entreprise.
        if(txtNom.getText().isEmpty()
                ||txtAdresse1.getText().isEmpty()
                ||txtAdresse3.getText().isEmpty()
                ||txtAdresse2.getText().isEmpty()
                ||txtTel.getText().isEmpty()
                ||txtMail.getText().isEmpty()
                ||txtSecteur.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Il faut remplir tout les champs.",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            // Envoie des données a la collection entreprise.
            Entreprise e = new Entreprise(txtNom.getText(), txtAdresse1.getText(),
                    txtAdresse3.getText(),txtAdresse2.getText(), txtTel.getText(),
                    txtMail.getText(), txtSecteur.getText());
            MainProjet.lesEntreprises.add(e);
            System.out.println(MainProjet.lesEntreprises.get(0).getRaisonSocial());
            
            String nom = evt.getActionCommand();
            if (nom.equals("Envoyer"))
                JOptionPane.showMessageDialog(this, "Votre demande a bien été envoyé !",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            // Fermeture de la fenêtre.
            this.dispose();
        }
    }//GEN-LAST:event_btnEnvoyerActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCreationEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCreationEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCreationEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCreationEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCreationEntreprise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adresse1;
    private javax.swing.JLabel Adresse2;
    private javax.swing.JLabel Adresse3;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Secteur;
    private javax.swing.JLabel Tel;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdresse1;
    private javax.swing.JTextField txtAdresse2;
    private javax.swing.JTextField txtAdresse3;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSecteur;
    private javax.swing.JTextField txtTel;
    private javax.swing.JLabel txtTitre;
    // End of variables declaration//GEN-END:variables
}