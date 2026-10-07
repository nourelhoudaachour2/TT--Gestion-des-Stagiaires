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


public class agent extends javax.swing.JFrame {

    /**
     * Creates new form agent
     */
    public agent() {
          if(!Authentication.isAuthenticated){
        JOptionPane.showMessageDialog(null, "Unauthorized access!","Error",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        }
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
     try {
        Con = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/telecomedb", "nour", "1234"
        );

        St = Con.createStatement();

        Rs = St.executeQuery(
            "SELECT MATRICULE, NOM, ADRESSE, TELEPHONE, GENRE FROM nour.AGENTTB"
        );

        Agents.setModel(DbUtils.resultSetToTableModel(Rs));

    } catch(SQLException e) {
        e.printStackTrace();
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Anom = new javax.swing.JTextField();
        Aadresse = new javax.swing.JTextField();
        Amatricule = new javax.swing.JTextField();
        Atelephone = new javax.swing.JTextField();
        Ajouter = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Vider = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Agents = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        Amotdepasse = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Agenre = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(120, 34, 155));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Facultés");
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telecome/proche.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion 1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(120, 34, 155));
        jLabel15.setText("Matricule :");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(120, 34, 155));
        jLabel16.setText("Adresse : ");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(120, 34, 155));
        jLabel17.setText("Nom :");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(120, 34, 155));
        jLabel18.setText("Genre :");

        Anom.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Anom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnomActionPerformed(evt);
            }
        });

        Aadresse.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Aadresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AadresseActionPerformed(evt);
            }
        });

        Amatricule.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Amatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmatriculeActionPerformed(evt);
            }
        });

        Atelephone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Atelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtelephoneActionPerformed(evt);
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
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/liste 2.png"))); // NOI18N

        Agents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "Nom ", "Mot de passe", "Adresse", "Téléphone", "Genre"
            }
        ));
        Agents.setRowHeight(25);
        Agents.setSelectionBackground(new java.awt.Color(0, 102, 204));
        Agents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Agents);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(120, 34, 155));
        jLabel19.setText("Mot de passe:");

        Amotdepasse.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Amotdepasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmotdepasseActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(120, 34, 155));
        jLabel20.setText("Télephone :");

        Agenre.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Agenre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femme", "Homme", " ", " " }));
        Agenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgenreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Amatricule, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(Anom)
                            .addComponent(Amotdepasse))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Aadresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Atelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Agenre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(258, 258, 258)
                        .addComponent(jLabel5))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(364, 364, 364))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(Aadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Anom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Atelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amotdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(Agenre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universite.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel10)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(276, 276, 276)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmotdepasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmotdepasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmotdepasseActionPerformed

    private void ViderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViderMouseClicked
   Amatricule.setText("");    
      Anom.setText("");
      Amotdepasse.setText("");
      Aadresse.setText("");
      Atelephone.setText("");
    }//GEN-LAST:event_ViderMouseClicked

    private void ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseClicked
 if(Amatricule.getText().isEmpty()|| Anom.getText().isEmpty() ||Amotdepasse.getText().isEmpty()||Aadresse.getText().isEmpty()||Atelephone.getText().isEmpty())
      {
       JOptionPane.showMessageDialog(this,"Veuillez remplir tout les champs ");   
      }
      else
      {
          try{
          
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
 String UpdateQuery = "UPDATE nour.AgentTB SET " +
"MATRICULE = '" + Amatricule.getText() + "'," +
"NOM = '" + Anom.getText() + "'," +
"MOTDEPASSE = '" + Amotdepasse.getText() + "'," +
"ADRESSE = '" + Aadresse.getText() + "'," +  
"TELEPHONE = " + Atelephone.getText() + "," +
"GENRE = '" + Agenre.getSelectedItem().toString() + "'" +  
" WHERE MATRICULE = '" + Amatricule.getText() + "'";


         
          Statement Add = Con.createStatement();
          Add.executeUpdate(UpdateQuery);
     JOptionPane.showMessageDialog(this,"Agent modifié ");     
          }catch(SQLException e)
          {
              e.printStackTrace();
          }   
          SelectMed();
      }       
    }//GEN-LAST:event_ModifierMouseClicked

    private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMouseClicked
  if (Amatricule.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Entrer le matricule de l'agent à supprimer ");
    } else {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb", "nour", "1234");
            String Id = Amatricule.getText();
            String Query = "DELETE FROM nour.AgentTB WHERE MATRICULE = '" + Id + "'";
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            SelectMed();
            JOptionPane.showMessageDialog(this, "Agent supprimé ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_SupprimerMouseClicked

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked
String matricule = Amatricule.getText().trim();
    String nom = Anom.getText().trim();
    String mdp = Amotdepasse.getText().trim();
    String adresse = Aadresse.getText().trim();
    String telephone = Atelephone.getText().trim();
    String genre = Agenre.getSelectedItem().toString();

    StringBuilder erreurs = new StringBuilder();

    // Vérification des champs vides
    if (matricule.isEmpty()) {
        erreurs.append("- Le matricule est obligatoire\n");
    }

    if (nom.isEmpty()) {
        erreurs.append("- Le nom est obligatoire\n");
    }

    if (mdp.isEmpty()) {
        erreurs.append("- Le mot de passe est obligatoire\n");
    }

    if (adresse.isEmpty()) {
        erreurs.append("- L'adresse est obligatoire\n");
    }

    if (telephone.isEmpty()) {
        erreurs.append("- Le téléphone est obligatoire\n");
    }

    // Vérification matricule : exactement 6 chiffres
    if (!matricule.isEmpty() && !matricule.matches("\\d{6}")) {
        erreurs.append("- Le matricule doit contenir exactement 6 chiffres\n");
    }

    // Vérification nom : lettres seulement
    if (!nom.isEmpty() && !nom.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- Le nom doit contenir uniquement des lettres\n");
    }

    // Vérification mot de passe : au moins 6 caractères
    if (!mdp.isEmpty() && mdp.length() < 6) {
        erreurs.append("- Le mot de passe doit contenir au moins 6 caractères\n");
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

        // Vérifier si le matricule existe déjà
        PreparedStatement check = Con.prepareStatement(
            "SELECT MATRICULE FROM nour.AGENTTB WHERE MATRICULE = ?"
        );

        check.setString(1, matricule);
        ResultSet rs = check.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(
                this,
                "Cette matricule existe déjà",
                "Erreur",
                JOptionPane.ERROR_MESSAGE
            );
            Con.close();
            return;
        }

        // Ajouter l'agent
        PreparedStatement add = Con.prepareStatement(
            "INSERT INTO nour.AGENTTB (MATRICULE, NOM, MOTDEPASSE, ADRESSE, TELEPHONE, GENRE) VALUES (?, ?, ?, ?, ?, ?)"
        );

        add.setString(1, matricule);
        add.setString(2, nom);
        add.setString(3, mdp);
        add.setString(4, adresse);
        add.setInt(5, Integer.valueOf(telephone));
        add.setString(6, genre);

        add.executeUpdate();

        JOptionPane.showMessageDialog(
            this,
            "Agent ajouté avec succès"
        );

        Con.close();
        SelectMed();

        // Vider les champs après l'ajout
        Amatricule.setText("");
        Anom.setText("");
        Amotdepasse.setText("");
        Aadresse.setText("");
        Atelephone.setText("");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(
            this,
            "Erreur lors de l'ajout de l'agent",
            "Erreur",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace();
    }
    }//GEN-LAST:event_AjouterMouseClicked

    private void AtelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtelephoneActionPerformed

    private void AmatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmatriculeActionPerformed

    private void AadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AadresseActionPerformed

    private void AnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnomActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void AgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgenreActionPerformed

    private void AgentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentsMouseClicked
        DefaultTableModel model =(DefaultTableModel)Agents.getModel();
       int Myindex = Agents.getSelectedRow();
       Amatricule.setText(model.getValueAt(Myindex,0).toString());
       Anom.setText(model.getValueAt(Myindex,1).toString());
       Amotdepasse.setText(model.getValueAt(Myindex,2).toString());
       Aadresse.setText(model.getValueAt(Myindex,3).toString());
       Atelephone.setText(model.getValueAt(Myindex,4).toString());
      
    }//GEN-LAST:event_AgentsMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new recherche().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new stagiaire().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new faculté().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjouterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Authentication.isAuthenticated = true;
        System.out.println("Authentication flag set to: " + Authentication.isAuthenticated);


        // Look and feel setup (optional)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agent().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aadresse;
    private javax.swing.JComboBox Agenre;
    private javax.swing.JTable Agents;
    private javax.swing.JButton Ajouter;
    private javax.swing.JTextField Amatricule;
    private javax.swing.JTextField Amotdepasse;
    private javax.swing.JTextField Anom;
    private javax.swing.JTextField Atelephone;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Supprimer;
    private javax.swing.JButton Vider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
