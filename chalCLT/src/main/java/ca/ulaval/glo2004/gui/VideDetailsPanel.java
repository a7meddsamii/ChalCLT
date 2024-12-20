/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ca.ulaval.glo2004.gui;

import ca.ulaval.glo2004.domain.Controleur;
import ca.ulaval.glo2004.domain.gestion_chalet.Mur;
import ca.ulaval.glo2004.gui.util.TypeVueDetails;
import ca.ulaval.glo2004.services.Orientations;
import ca.ulaval.glo2004.services.UniteImperiale;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author nasmachaoui
 */
public class VideDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VideDetailsPanel
     */
    public VideDetailsPanel(MainWindow p_mainWindow, Controleur p_controleur) {
        controleur = p_controleur;
        mainWindow = p_mainWindow;
        initComponents();
        preparerTextFields();
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
        longueurChalet_TextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        largeurChalet_TextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hauteurChalet_TextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        epaisseurChalet_TextField = new javax.swing.JTextField();
        redimenssionnerChalet_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        orientationToit_comboBox = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        angleToit_textField = new javax.swing.JTextField();
        modifierAngleToit_btn = new javax.swing.JButton();
        afficheVoisin_checkBox = new javax.swing.JCheckBox();

        setMinimumSize(new java.awt.Dimension(250, 400));
        setPreferredSize(new java.awt.Dimension(250, 400));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Longueur");

        longueurChalet_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        longueurChalet_TextField.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(longueurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(longueurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Largeur");

        largeurChalet_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        largeurChalet_TextField.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(largeurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(largeurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hauteur");

        hauteurChalet_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        hauteurChalet_TextField.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Epaisseur");

        epaisseurChalet_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        epaisseurChalet_TextField.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(epaisseurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(epaisseurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hauteurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hauteurChalet_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        redimenssionnerChalet_btn.setText("Redimenssionner Chalet");
        redimenssionnerChalet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redimenssionnerChalet_btnActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Orientation Toit");

        orientationToit_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arrière vers Façade", "Façade vers Arrière", "Gauche vers Droite", "Droite vers Gauche" }));
        orientationToit_comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.refresh();
            }
        });
        orientationToit_comboBox.addActionListener(e -> {
            if (orientationToit_comboBox.getSelectedItem() == "Arrière vers Façade") {
                controleur.changerOrientationToit(Orientations.ARRIERE);
                mainWindow.setvueMode(mainWindow.getvueMode());
            } else if (orientationToit_comboBox.getSelectedItem() == "Façade vers Arrière") {
                controleur.changerOrientationToit(Orientations.FACADE);
                mainWindow.setvueMode(mainWindow.getvueMode());
            } else if (orientationToit_comboBox.getSelectedItem() == "Gauche vers Droite") {
                controleur.changerOrientationToit(Orientations.GAUCHE);
                mainWindow.setvueMode(mainWindow.getvueMode());
            } else if (orientationToit_comboBox.getSelectedItem() == "Droite vers Gauche") {
                controleur.changerOrientationToit(Orientations.DROITE);
                mainWindow.setvueMode(mainWindow.getvueMode());
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orientationToit_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orientationToit_comboBox))
                .addContainerGap())
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Angle Toit");

        angleToit_textField.setMinimumSize(new java.awt.Dimension(100, 30));
        angleToit_textField.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(angleToit_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angleToit_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        modifierAngleToit_btn.setText("Modifier Angle");
        modifierAngleToit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierAngleToit_btnActionPerformed(evt);
            }
        });

        afficheVoisin_checkBox.setText("Voisins");
        afficheVoisin_checkBox.setSelected(true);
        afficheVoisin_checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                mainWindow.setAfficherVoisins(e.getStateChange() == ItemEvent.SELECTED);
                mainWindow.refresh();
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(redimenssionnerChalet_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(modifierAngleToit_btn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(afficheVoisin_checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(redimenssionnerChalet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifierAngleToit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(afficheVoisin_checkBox)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void redimenssionnerChalet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redimenssionnerChalet_btnActionPerformed
        // Récupérez les valeurs à partir des champs de texte
        String longueurChaletText = longueurChalet_TextField.getText();
        String largeurChaletText = largeurChalet_TextField.getText();
        String hauteurChaletText = hauteurChalet_TextField.getText();
        String epaisseurChaletText = epaisseurChalet_TextField.getText();
        //call le controleur
        controleur.redimenssionnerChalet(mainWindow.getDrawingPanelSize(),
                new UniteImperiale(largeurChaletText),
                new UniteImperiale(longueurChaletText),
                new UniteImperiale(hauteurChaletText),
                new UniteImperiale(epaisseurChaletText));
        mainWindow.refresh();
        mainWindow.setvueMode(mainWindow.getvueMode());
//        remplirAffichageDetails();
    }//GEN-LAST:event_redimenssionnerChalet_btnActionPerformed

    private void modifierAngleToit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierAngleToit_btnActionPerformed
        if (Float.parseFloat(angleToit_textField.getText()) <= 89 && Float.parseFloat(angleToit_textField.getText()) > 0) {
            controleur.modifierAngleToit(Float.parseFloat(angleToit_textField.getText()));
        }
        mainWindow.setvueMode(mainWindow.getvueMode());
    }//GEN-LAST:event_modifierAngleToit_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox afficheVoisin_checkBox;
    private javax.swing.JTextField angleToit_textField;
    private javax.swing.JTextField epaisseurChalet_TextField;
    private javax.swing.JTextField hauteurChalet_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField largeurChalet_TextField;
    private javax.swing.JTextField longueurChalet_TextField;
    private javax.swing.JButton modifierAngleToit_btn;
    private javax.swing.JComboBox<String> orientationToit_comboBox;
    private javax.swing.JButton redimenssionnerChalet_btn;
    // End of variables declaration//GEN-END:variables

    private Controleur controleur;
    private MainWindow mainWindow;


    private void preparerTextFields() {
        DocumentListener textFieldListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButtonState();
            }
        };
        longueurChalet_TextField.getDocument().addDocumentListener(textFieldListener);
        largeurChalet_TextField.getDocument().addDocumentListener(textFieldListener);
        hauteurChalet_TextField.getDocument().addDocumentListener(textFieldListener);
        epaisseurChalet_TextField.getDocument().addDocumentListener(textFieldListener);
    }

    protected void remplirAffichageDetails() {

        longueurChalet_TextField.setText(controleur.getMur(Orientations.FACADE).getLongueur() + "");
        largeurChalet_TextField.setText(controleur.getMur(Orientations.GAUCHE).getLongueur() + "");
        hauteurChalet_TextField.setText(controleur.getMur(Orientations.GAUCHE).getLargeur() + "");
        epaisseurChalet_TextField.setText(controleur.getMur(Orientations.GAUCHE).getEpaisseur() + "");
        angleToit_textField.setText(controleur.getToitEntier().getAngle()+ "");
    }

    private void updateButtonState() {
        // Récupérez les valeurs à partir des champs de texte
        String longueurChaletText = longueurChalet_TextField.getText();
        String largeurChaletText = largeurChalet_TextField.getText();
        String hauteurChaletText = hauteurChalet_TextField.getText();
        String epaisseurChaletText = epaisseurChalet_TextField.getText();


        // S'assure de valider et de convertir ces valeurs en types numériques ( pour livrable 3)
        if (longueurChaletText != null && largeurChaletText != null && hauteurChaletText != null && epaisseurChaletText != null) {
            boolean estVide = longueurChaletText.isEmpty() || largeurChaletText.isEmpty() || hauteurChaletText.isEmpty() || epaisseurChaletText.isEmpty();
            boolean match = longueurChaletText.matches(UniteImperiale.FORMAT_UNITE_IMPERIAL.pattern())
                    && largeurChaletText.matches(UniteImperiale.FORMAT_UNITE_IMPERIAL.pattern())
                    && hauteurChaletText.matches(UniteImperiale.FORMAT_UNITE_IMPERIAL.pattern())
                    && epaisseurChaletText.matches(UniteImperiale.FORMAT_UNITE_IMPERIAL.pattern());
            boolean doesNotEndWithBackSlash = !(longueurChaletText.endsWith("/")
                    || largeurChaletText.endsWith("/")
                    || hauteurChaletText.endsWith("/")
                    || epaisseurChaletText.endsWith("/"));

            if (!estVide && match && doesNotEndWithBackSlash) {
                UniteImperiale longueurChalet = new UniteImperiale(longueurChaletText);
                UniteImperiale largeurChalet = new UniteImperiale(largeurChaletText);
                UniteImperiale hauteurChalet = new UniteImperiale(hauteurChaletText);
                UniteImperiale epaisseurChalet = new UniteImperiale(epaisseurChaletText);

                boolean valeursValide = longueurChalet.estValide() && largeurChalet.estValide() && hauteurChalet.estValide() && epaisseurChalet.estValide();

                if (valeursValide) {
                    // Active le boutton "Redimensionner le chalet"
                    redimenssionnerChalet_btn.setEnabled(true);
                }
            } else {
                redimenssionnerChalet_btn.setEnabled(false);
            }
        }
    }
}
