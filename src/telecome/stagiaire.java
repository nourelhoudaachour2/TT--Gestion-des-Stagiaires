package telecome;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class stagiaire extends javax.swing.JFrame {

   
    public stagiaire() {
        initComponents();
        setLocationRelativeTo(null);
        SelectMed();
        GetInstitut();
    }
Connection Con = null;
Statement St = null;
ResultSet Rs = null ;
java.util.Date FDate,EDate;
java.sql.Date MyFabDate, MyExpDate;

    @SuppressWarnings("unchecked")
 public void SelectMed()
 {
    try{
    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
    St = Con.createStatement();
    Rs = St.executeQuery("Select * from nour.STAGIAIRETB");
    Stagiaire.setModel(DbUtils.resultSetToTableModel(Rs));

    }catch(SQLException e)
    {e.printStackTrace();}
    }
 public void GetInstitut()
{
    try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
        St = Con.createStatement();
        String query = "Select * from nour.INSTITUTTB";
         Rs = St.executeQuery(query);
         while(Rs.next()){
          String Mycomp = Rs.getString("Nom");
          Institut.addItem(Mycomp);
          
         }
    
        
    }catch(SQLException e)
    {
    }}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Cin = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Prenom = new javax.swing.JTextField();
        Nom = new javax.swing.JTextField();
        Telephone = new javax.swing.JTextField();
        Diplome = new javax.swing.JTextField();
        Specialite = new javax.swing.JTextField();
        Lieu = new javax.swing.JTextField();
        Ajouter = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Vider = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Stagiaire = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox();
        Genre = new javax.swing.JComboBox();
        Fin = new com.toedter.calendar.JDateChooser();
        Debut = new com.toedter.calendar.JDateChooser();
        Institut = new javax.swing.JComboBox();
        Lettre = new javax.swing.JComboBox();
        Certification = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(120, 34, 155));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adobe_Express_-_file__3_-removebg-preview.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chercher.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recherche");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agence-de-voyage (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agents");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universite.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Facultés");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout (2).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telecome/proche.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stag 1.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(123, 23, 176));
        jLabel14.setText("CIN/Passeport :");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(123, 23, 176));
        jLabel15.setText("Numéro :");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(123, 23, 176));
        jLabel16.setText("Nom :");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(123, 23, 176));
        jLabel17.setText("Prénom :");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(123, 23, 176));
        jLabel18.setText("Diplome visé :");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(123, 23, 176));
        jLabel19.setText("Institut :");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(123, 23, 176));
        jLabel20.setText("Spécialité :");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(123, 23, 176));
        jLabel21.setText("Date début :");

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(123, 23, 176));
        jLabel22.setText("Date fin :");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(123, 23, 176));
        jLabel23.setText("Téléphone :");

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(123, 23, 176));
        jLabel24.setText("Status :");

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(123, 23, 176));
        jLabel25.setText("Genre :");

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(123, 23, 176));
        jLabel26.setText("Lieu de stage :");

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(123, 23, 176));
        jLabel27.setText("Lettre d'affectation :");

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(123, 23, 176));
        jLabel28.setText("Certification :");

        Cin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CinActionPerformed(evt);
            }
        });

        Numero.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });

        Prenom.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomActionPerformed(evt);
            }
        });

        Nom.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        Telephone.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelephoneActionPerformed(evt);
            }
        });

        Diplome.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Diplome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiplomeActionPerformed(evt);
            }
        });

        Specialite.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Specialite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialiteActionPerformed(evt);
            }
        });

        Lieu.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Lieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LieuActionPerformed(evt);
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

        Stagiaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numéro", "Nom", "Prénom", "Cin", "Genre", "Tel", "Diplome", "Institut", "Status", "Spécialité", "Lieu", "D.début", "D.fin", "Lettre", "Certification"
            }
        ));
        Stagiaire.setRowHeight(25);
        Stagiaire.setSelectionBackground(new java.awt.Color(0, 102, 204));
        Stagiaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StagiaireMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Stagiaire);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisss.png"))); // NOI18N

        Status.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "accepté(e)", "refusé(e)", " ", " ", " " }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        Genre.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Genre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femme", "Homme", " ", " " }));
        Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreActionPerformed(evt);
            }
        });

        Fin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        Debut.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        Institut.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Institut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        Lettre.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Lettre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reçue", "Non reçue" }));

        Certification.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Certification.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Obtenue", "Non obtenu" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(531, 531, 531)
                .addComponent(jLabel8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15))
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Numero, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(Prenom, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(Cin)
                            .addComponent(Nom, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(Genre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Telephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20))
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Specialite, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                        .addComponent(Diplome, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                        .addComponent(Status, 0, 244, Short.MAX_VALUE)
                                        .addComponent(Institut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel24))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel26))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lieu, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(Fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Debut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lettre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Certification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(640, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(625, 625, 625))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(195, 195, 195)
                        .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel23)
                            .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(Lieu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Debut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jLabel18)
                                .addComponent(jLabel16)
                                .addComponent(Diplome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Institut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Cin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lettre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel20)
                    .addComponent(Specialite, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Certification, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5))))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void CinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CinActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void PrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomActionPerformed

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void TelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelephoneActionPerformed

    private void DiplomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiplomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiplomeActionPerformed

    private void SpecialiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpecialiteActionPerformed

    private void LieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LieuActionPerformed

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked
 
       String numero = Numero.getText().trim();
    String nom = Nom.getText().trim();
    String prenom = Prenom.getText().trim();
    String cin = Cin.getText().trim();
    String telephone = Telephone.getText().trim();
    String diplome = Diplome.getText().trim();
    String specialite = Specialite.getText().trim();
    String lieu = Lieu.getText().trim();

    String genre = Genre.getSelectedItem().toString().trim();
    String institut = Institut.getSelectedItem().toString().trim();
    String status = Status.getSelectedItem().toString().trim();
    String lettre = Lettre.getSelectedItem().toString().trim();
    String certification = Certification.getSelectedItem().toString().trim();

    StringBuilder erreurs = new StringBuilder();

    // Vérification des champs vides
    if (numero.isEmpty()) {
        erreurs.append("- Le numéro est obligatoire\n");
    }

    if (nom.isEmpty()) {
        erreurs.append("- Le nom est obligatoire\n");
    }

    if (prenom.isEmpty()) {
        erreurs.append("- Le prénom est obligatoire\n");
    }

    if (cin.isEmpty()) {
        erreurs.append("- Le CIN est obligatoire\n");
    }

    if (telephone.isEmpty()) {
        erreurs.append("- Le téléphone est obligatoire\n");
    }

    if (diplome.isEmpty()) {
        erreurs.append("- Le diplôme est obligatoire\n");
    }

    if (specialite.isEmpty()) {
        erreurs.append("- La spécialité est obligatoire\n");
    }

    if (lieu.isEmpty()) {
        erreurs.append("- Le lieu de stage est obligatoire\n");
    }

    if (genre.isEmpty()) {
        erreurs.append("- Le genre est obligatoire\n");
    }

    if (institut.isEmpty()) {
        erreurs.append("- L'institut est obligatoire\n");
    }

    if (status.isEmpty()) {
        erreurs.append("- Le status est obligatoire\n");
    }

    if (lettre.isEmpty()) {
        erreurs.append("- La lettre d'affectation est obligatoire\n");
    }

    if (certification.isEmpty()) {
        erreurs.append("- La certification est obligatoire\n");
    }

    if (Debut.getDate() == null) {
        erreurs.append("- La date de début est obligatoire\n");
    }

    if (Fin.getDate() == null) {
        erreurs.append("- La date de fin est obligatoire\n");
    }

    // Numéro : chiffres seulement
    if (!numero.isEmpty() && !numero.matches("\\d+")) {
        erreurs.append("- Le numéro doit contenir seulement des chiffres\n");
    }

    // Nom : lettres seulement
    if (!nom.isEmpty() && !nom.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- Le nom doit contenir uniquement des lettres\n");
    }

    // Prénom : lettres seulement
    if (!prenom.isEmpty() && !prenom.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- Le prénom doit contenir uniquement des lettres\n");
    }

    // CIN : exactement 8 chiffres
    if (!cin.isEmpty() && !cin.matches("\\d{8}")) {
        erreurs.append("- Le CIN doit contenir exactement 8 chiffres\n");
    }

    // Téléphone : exactement 8 chiffres
    if (!telephone.isEmpty() && !telephone.matches("\\d{8}")) {
        erreurs.append("- Le numéro de téléphone doit contenir exactement 8 chiffres\n");
    }

    // Diplôme : lettres seulement
    if (!diplome.isEmpty() && !diplome.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- Le diplôme doit contenir uniquement des lettres\n");
    }

    // Spécialité : lettres seulement
    if (!specialite.isEmpty() && !specialite.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- La spécialité doit contenir uniquement des lettres\n");
    }

    // Lieu : lettres seulement
    if (!lieu.isEmpty() && !lieu.matches("\\p{L}+(\\s\\p{L}+)*")) {
        erreurs.append("- Le lieu de stage doit contenir uniquement des lettres\n");
    }

    // Vérification date fin > date début
    if (Debut.getDate() != null && Fin.getDate() != null) {
        if (!Fin.getDate().after(Debut.getDate())) {
            erreurs.append("- La date de fin doit être après la date de début\n");
        }
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

        // Vérifier si le numéro existe déjà
        PreparedStatement check = Con.prepareStatement(
            "SELECT NUMERO FROM nour.STAGIAIRETB WHERE NUMERO = ?"
        );
        check.setInt(1, Integer.valueOf(numero));

        ResultSet rs = check.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(
                this,
                "Ce numéro existe déjà",
                "Erreur",
                JOptionPane.ERROR_MESSAGE
            );
            Con.close();
            return;
        }

        FDate = Debut.getDate();
        MyFabDate = new java.sql.Date(FDate.getTime());

        EDate = Fin.getDate();
        MyExpDate = new java.sql.Date(EDate.getTime());

        PreparedStatement add = Con.prepareStatement(
            "INSERT INTO nour.STAGIAIRETB " +
            "(NUMERO, NOM, PRENOM, CIN, GENRE, TELEPHONE, DIPLOME, INSTITUT, STATUS, SPECIALITE, LIEU, DEBUT, FIN, LETTRE, CERTIFICATION) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
        );

        add.setInt(1, Integer.valueOf(numero));
        add.setString(2, nom);
        add.setString(3, prenom);
        add.setInt(4, Integer.valueOf(cin));
        add.setString(5, genre);
        add.setString(6, telephone);
        add.setString(7, diplome);
        add.setString(8, institut);
        add.setString(9, status);
        add.setString(10, specialite);
        add.setString(11, lieu);
        add.setDate(12, MyFabDate);
        add.setDate(13, MyExpDate);
        add.setString(14, lettre);
        add.setString(15, certification);

        add.executeUpdate();

        JOptionPane.showMessageDialog(
            this,
            "Stagiaire ajouté avec succès"
        );

        Con.close();
        SelectMed();

        // Vider les champs après l'ajout
        Numero.setText("");
        Nom.setText("");
        Prenom.setText("");
        Cin.setText("");
        Telephone.setText("");
        Diplome.setText("");
        Specialite.setText("");
        Lieu.setText("");
        Debut.setDate(null);
        Fin.setDate(null);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(
            this,
            "Erreur lors de l'ajout du stagiaire",
            "Erreur",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace();
    }
    }//GEN-LAST:event_AjouterMouseClicked

    private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMouseClicked
      if(Cin.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(this,"Entrer le cin du stagiaire a supprimer ");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
                String Id = Cin.getText();
                String Query = "Delete from nour.STAGIAIRETB where Cin="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectMed();
                 JOptionPane.showMessageDialog(this,"Stagiaire supprimé ");
                
            }catch(SQLException e)
            {
          e.printStackTrace();
      } }
    }//GEN-LAST:event_SupprimerMouseClicked

    private void ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseClicked
        if(Numero.getText().isEmpty()|| Nom.getText().isEmpty() ||Prenom.getText().isEmpty()||Cin.getText().isEmpty()||Telephone.getText().isEmpty()||Diplome.getText().isEmpty()||Specialite.getText().isEmpty()||Lieu.getText().isEmpty())
      {
       JOptionPane.showMessageDialog(this,"Veuillez remplir tout les champs ");   
      }
      else
      {
          try{
           FDate = Debut.getDate();
    MyFabDate = new java.sql.Date(FDate.getTime());
    EDate = Fin.getDate();
    MyExpDate = new java.sql.Date(EDate.getTime());
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/telecomedb","nour","1234");
 String UpdateQuery = "UPDATE nour.STAGIAIRETB SET " +
"NUMERO = " + Numero.getText() + "," +
"NOM = '" + Nom.getText() + "'," +
"PRENOM = '" + Prenom.getText() + "'," +
"GENRE = '" + Genre.getSelectedItem().toString() + "'," +
"TELEPHONE = " + Telephone.getText() + "," +
"DIPLOME = '" + Diplome.getText() + "'," +
"INSTITUT = '" + Institut.getSelectedItem().toString() + "'," +
"STATUS = '" + Status.getSelectedItem().toString() + "'," +
"SPECIALITE = '" + Specialite.getText() + "'," +
"LIEU = '" + Lieu.getText() + "'," +
"DEBUT = '" + MyFabDate + "'," +
"FIN = '" + MyExpDate + "'," +
"LETTRE = '" + Lettre.getSelectedItem().toString() + "'," +
"CERTIFICATION = '" + Certification.getSelectedItem().toString() + "'" +
" WHERE CIN = " + Cin.getText();

         
          Statement Add = Con.createStatement();
          Add.executeUpdate(UpdateQuery);
     JOptionPane.showMessageDialog(this,"Stagiaire modifié ");     
          }catch(SQLException e)
          {
              e.printStackTrace();
          }   
          SelectMed();
      }
    }//GEN-LAST:event_ModifierMouseClicked

    private void ViderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViderMouseClicked
        Numero.setText("");
       Nom.setText("");
       Prenom.setText("");
       Cin.setText(""); 
       Telephone.setText("");
       Diplome.setText("");
       Specialite.setText(""); 
       Lieu.setText("");
    }//GEN-LAST:event_ViderMouseClicked

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreActionPerformed

    private void StagiaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StagiaireMouseClicked
                                           
    DefaultTableModel model = (DefaultTableModel) Stagiaire.getModel();
    int Myindex = Stagiaire.getSelectedRow();

    Numero.setText(model.getValueAt(Myindex, 0).toString());
    Nom.setText(model.getValueAt(Myindex, 1).toString());
    Prenom.setText(model.getValueAt(Myindex, 2).toString());
    Cin.setText(model.getValueAt(Myindex, 3).toString());
    Telephone.setText(model.getValueAt(Myindex, 5).toString());
    Diplome.setText(model.getValueAt(Myindex, 6).toString());
    Specialite.setText(model.getValueAt(Myindex, 9).toString());
    Lieu.setText(model.getValueAt(Myindex, 10).toString());

    // ComboBox pour le genre
    Genre.setSelectedItem(model.getValueAt(Myindex, 4).toString());

    // ComboBox pour l'institut
    Institut.setSelectedItem(model.getValueAt(Myindex, 7).toString());

    // ComboBox pour le status
    Status.setSelectedItem(model.getValueAt(Myindex, 8).toString());

    // Dates avec JDateChooser
    try {
        java.util.Date debut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(Myindex, 11).toString());
        Debut.setDate(debut);

        java.util.Date fin = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(Myindex, 12).toString());
        Fin.setDate(fin);
    } catch (ParseException ex) {
        ex.printStackTrace();
    }

    // ComboBox pour la lettre d'affectation
    Lettre.setSelectedItem(model.getValueAt(Myindex, 13).toString());

    // ComboBox pour la certification
    Certification.setSelectedItem(model.getValueAt(Myindex, 14).toString());


      
       
    }//GEN-LAST:event_StagiaireMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new recherche().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       new passwords().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new faculté().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(stagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stagiaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stagiaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JComboBox Certification;
    private javax.swing.JTextField Cin;
    private com.toedter.calendar.JDateChooser Debut;
    private javax.swing.JTextField Diplome;
    private com.toedter.calendar.JDateChooser Fin;
    private javax.swing.JComboBox Genre;
    private javax.swing.JComboBox Institut;
    private javax.swing.JComboBox Lettre;
    private javax.swing.JTextField Lieu;
    private javax.swing.JButton Modifier;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Numero;
    private javax.swing.JTextField Prenom;
    private javax.swing.JTextField Specialite;
    private javax.swing.JTable Stagiaire;
    private javax.swing.JComboBox Status;
    private javax.swing.JButton Supprimer;
    private javax.swing.JTextField Telephone;
    private javax.swing.JButton Vider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
