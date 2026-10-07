package telecome;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class faculté extends javax.swing.JFrame {

    public faculté() {
        initComponents();
        setLocationRelativeTo(null);
         SelectMed();
    }

  Connection Con = null;
Statement St = null;
ResultSet Rs = null ;  
    @SuppressWarnings("unchecked")
    public void SelectMed()
{
    try{
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
    St = Con.createStatement();
    Rs = St.executeQuery("Select * from nour.INSTITUTTB");
    Institut.setModel(DbUtils.resultSetToTableModel(Rs));

    }catch(SQLException e)
    {e.printStackTrace();}
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Inom = new javax.swing.JTextField();
        Itelephone = new javax.swing.JTextField();
        Iid = new javax.swing.JTextField();
        Iadresse = new javax.swing.JTextField();
        Ajouter = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Vider = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Institut = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Adresse : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(120, 34, 155));

        jPanel1.setBackground(new java.awt.Color(120, 34, 155));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agents");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recherche");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telecome/proche.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ges inst.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(120, 34, 155));
        jLabel15.setText("Id : ");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(120, 34, 155));
        jLabel16.setText("Adresse : ");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(120, 34, 155));
        jLabel17.setText("Nom :");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(120, 34, 155));
        jLabel18.setText("Numéro du Télephone :");

        Inom.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Inom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InomActionPerformed(evt);
            }
        });

        Itelephone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Itelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItelephoneActionPerformed(evt);
            }
        });

        Iid.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Iid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IidActionPerformed(evt);
            }
        });

        Iadresse.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Iadresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IadresseActionPerformed(evt);
            }
        });

        Ajouter.setBackground(new java.awt.Color(106, 185, 15));
        Ajouter.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setText("Ajouter");
        Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterMouseClicked(evt);
            }
        });

        Supprimer.setBackground(new java.awt.Color(211, 33, 33));
        Supprimer.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setText("Supprimer");
        Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupprimerMouseClicked(evt);
            }
        });

        Modifier.setBackground(new java.awt.Color(242, 192, 41));
        Modifier.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setText("Modifier");
        Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifierMouseClicked(evt);
            }
        });

        Vider.setBackground(new java.awt.Color(120, 34, 155));
        Vider.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Vider.setForeground(new java.awt.Color(255, 255, 255));
        Vider.setText("Vider");
        Vider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViderMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inst.png"))); // NOI18N

        Institut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nom ", "Adresse", "Téléphone"
            }
        ));
        Institut.setRowHeight(25);
        Institut.setSelectionBackground(new java.awt.Color(0, 102, 204));
        Institut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstitutMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Institut);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Iid, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inom, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26)
                        .addComponent(Iadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Itelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(275, 275, 275)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(377, 377, 377))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(Iid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(Iadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(Inom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(Itelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)))
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(457, 457, 457)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence-de-voyage (1).png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipe.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chercher.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout (2).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adobe_Express_-_file__3_-removebg-preview.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stagiaires");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void InomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InomActionPerformed

    private void ItelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItelephoneActionPerformed

    private void IidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IidActionPerformed

    private void IadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IadresseActionPerformed

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked
  String id = Iid.getText().trim();
    String nom = Inom.getText().trim();
    String adresse = Iadresse.getText().trim();
    String telephone = Itelephone.getText().trim();

    StringBuilder erreurs = new StringBuilder();

    // Vérification des champs vides
    if (id.isEmpty()) {
        erreurs.append("- L'id est obligatoire\n");
    }

    if (nom.isEmpty()) {
        erreurs.append("- Le nom est obligatoire\n");
    }

    if (adresse.isEmpty()) {
        erreurs.append("- L'adresse est obligatoire\n");
    }

    if (telephone.isEmpty()) {
        erreurs.append("- Le téléphone est obligatoire\n");
    }

    // Vérification ID : chiffres seulement
    if (!id.isEmpty() && !id.matches("\\d+")) {
        erreurs.append("- L'id doit contenir seulement des chiffres\n");
    }

    // Vérification nom : lettres seulement avec espaces
    if (!nom.isEmpty() && !nom.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- Le nom doit contenir uniquement des lettres\n");
    }

    // Vérification adresse : lettres, chiffres, espaces
    if (!adresse.isEmpty() && !adresse.matches("[\\p{L}0-9\\s'-]+")) {
        erreurs.append("- L'adresse contient des caractères invalides\n");
    }

    // Vérification téléphone : exactement 8 chiffres
    if (!telephone.isEmpty() && !telephone.matches("\\d{8}")) {
        erreurs.append("- Le numéro de téléphone doit contenir exactement 8 chiffres\n");
    }

    // Afficher toutes les erreurs ensemble
    if (erreurs.length() > 0) {
        JOptionPane.showMessageDialog(
            this,
            erreurs.toString(),
            "Erreurs de saisie",
            JOptionPane.ERROR_MESSAGE
        );
        return;
    }

    try {
        Con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/telecomedb", "nour", "1234"
        );

        // Vérifier si l'id existe déjà
        PreparedStatement check = Con.prepareStatement(
            "SELECT ID FROM nour.INSTITUTTB WHERE ID = ?"
        );
        check.setInt(1, Integer.valueOf(id));

        ResultSet rs = check.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(
                this,
                "Cet id existe déjà",
                "Erreur",
                JOptionPane.ERROR_MESSAGE
            );
            Con.close();
            return;
        }

        // Ajouter l'institut
        PreparedStatement add = Con.prepareStatement(
            "INSERT INTO nour.INSTITUTTB (ID, NOM, ADRESSE, TELEPHONE) VALUES (?, ?, ?, ?)"
        );

        add.setInt(1, Integer.valueOf(id));
        add.setString(2, nom);
        add.setString(3, adresse);
        add.setInt(4, Integer.valueOf(telephone));

        add.executeUpdate();

        JOptionPane.showMessageDialog(
            this,
            "Institut ajouté avec succès"
        );

        Con.close();
        SelectMed();

        // Vider les champs après l'ajout
        Iid.setText("");
        Inom.setText("");
        Iadresse.setText("");
        Itelephone.setText("");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(
            this,
            "Erreur lors de l'ajout de l'institut",
            "Erreur",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace();
    }
       
    }//GEN-LAST:event_AjouterMouseClicked

    private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMouseClicked
         if(Iid.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(this,"Entrer l'id de l'institut a supprimé ");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
                String Id = Iid.getText();
                String Query = "Delete from nour.INSTITUTTB where ID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectMed();
                 JOptionPane.showMessageDialog(this,"Institutn supprimé ");
                
            }catch(SQLException e)
            {
          e.printStackTrace();
      } 
    }               
    }//GEN-LAST:event_SupprimerMouseClicked

    private void ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseClicked
      if(Iid.getText().isEmpty() || Inom.getText().isEmpty() || Iadresse.getText().isEmpty() || Itelephone.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs");   
    } else {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb", "nour", "1234");
            String UpdateQuery = "UPDATE nour.INSTITUTTB SET "
                               + "NOM = '" + Inom.getText() + "', "
                               + "ADRESSE = '" + Iadresse.getText() + "', "
                               + "TELEPHONE = " + Integer.parseInt(Itelephone.getText())
                               + " WHERE ID = " + Integer.parseInt(Iid.getText());

            Statement Add = Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            JOptionPane.showMessageDialog(this, "Institut modifié");     
        } catch(SQLException e) {
            e.printStackTrace();
        }  
        SelectMed(); 
    }
    }//GEN-LAST:event_ModifierMouseClicked

    private void ViderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViderMouseClicked
Iid.setText("");    
Inom.setText("");
Iadresse.setText("");
Itelephone.setText("");
    }//GEN-LAST:event_ViderMouseClicked

    private void InstitutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstitutMouseClicked
  DefaultTableModel model =(DefaultTableModel)Institut.getModel();
        int Myindex = Institut.getSelectedRow();
        Iid.setText(model.getValueAt(Myindex, 0).toString());
        Inom.setText(model.getValueAt(Myindex, 1).toString());
        Iadresse.setText(model.getValueAt(Myindex, 2).toString());
        Itelephone.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_InstitutMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new stagiaire().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new recherche().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       new passwords().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new faculté().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JTextField Iadresse;
    private javax.swing.JTextField Iid;
    private javax.swing.JTextField Inom;
    private javax.swing.JTable Institut;
    private javax.swing.JTextField Itelephone;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Supprimer;
    private javax.swing.JButton Vider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
