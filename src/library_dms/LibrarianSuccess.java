/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

/**
 *
 * @author Hefaz
 */
public class LibrarianSuccess extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianSuccess
     */
    
    public LibrarianSuccess() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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
        jPanel2 = new javax.swing.JPanel();
        btnNewButton = new javax.swing.JButton();
        btnViewBooks = new javax.swing.JButton();
        btnIssueBooks = new javax.swing.JButton();
        btnViewIssuedBooks = new javax.swing.JButton();
        btnReturnBook = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnViewIssuedBooks1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnNewButton1 = new javax.swing.JButton();
        btnNewButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnIssueBooks1 = new javax.swing.JButton();
        btnReturnBook1 = new javax.swing.JButton();
        btnViewBooks1 = new javax.swing.JButton();
        btnReturnBook2 = new javax.swing.JButton();
        btnReturnBook3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagespackage/81913-200.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btnNewButton.setBackground(new java.awt.Color(153, 0, 255));
        btnNewButton.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnNewButton.setForeground(new java.awt.Color(255, 255, 255));
        btnNewButton.setText("Add Books");
        btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewButtonActionPerformed(evt);
            }
        });

        btnViewBooks.setBackground(new java.awt.Color(255, 153, 153));
        btnViewBooks.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnViewBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBooks.setText("ViewBooks");
        btnViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBooksActionPerformed(evt);
            }
        });

        btnIssueBooks.setBackground(new java.awt.Color(153, 0, 255));
        btnIssueBooks.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnIssueBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBooks.setText("Issue Books");
        btnIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBooksActionPerformed(evt);
            }
        });

        btnViewIssuedBooks.setBackground(new java.awt.Color(255, 153, 153));
        btnViewIssuedBooks.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnViewIssuedBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewIssuedBooks.setText("Issued Books");
        btnViewIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewIssuedBooksActionPerformed(evt);
            }
        });

        btnReturnBook.setBackground(new java.awt.Color(153, 0, 255));
        btnReturnBook.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnReturnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBook.setText("Return Book");
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 153, 153));
        btnLogout.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 255));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnViewIssuedBooks1.setBackground(new java.awt.Color(255, 153, 153));
        btnViewIssuedBooks1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnViewIssuedBooks1.setForeground(new java.awt.Color(255, 255, 255));
        btnViewIssuedBooks1.setText("Statistics");
        btnViewIssuedBooks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewIssuedBooks1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnNewButton1.setBackground(new java.awt.Color(153, 0, 255));
        btnNewButton1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnNewButton1.setForeground(new java.awt.Color(255, 255, 255));
        btnNewButton1.setText("Delete Books");
        btnNewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewButton1ActionPerformed(evt);
            }
        });

        btnNewButton2.setBackground(new java.awt.Color(153, 0, 255));
        btnNewButton2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnNewButton2.setForeground(new java.awt.Color(255, 255, 255));
        btnNewButton2.setText("Delete Student");
        btnNewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Librarian Home");

        btnIssueBooks1.setBackground(new java.awt.Color(153, 0, 255));
        btnIssueBooks1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnIssueBooks1.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBooks1.setText("Taken Books");
        btnIssueBooks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBooks1ActionPerformed(evt);
            }
        });

        btnReturnBook1.setBackground(new java.awt.Color(153, 0, 255));
        btnReturnBook1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnReturnBook1.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBook1.setText("Update Books");
        btnReturnBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBook1ActionPerformed(evt);
            }
        });

        btnViewBooks1.setBackground(new java.awt.Color(255, 153, 153));
        btnViewBooks1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnViewBooks1.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBooks1.setText("ViewStudents");
        btnViewBooks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBooks1ActionPerformed(evt);
            }
        });

        btnReturnBook2.setBackground(new java.awt.Color(153, 0, 255));
        btnReturnBook2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnReturnBook2.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBook2.setText("Update Students");
        btnReturnBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBook2ActionPerformed(evt);
            }
        });

        btnReturnBook3.setBackground(new java.awt.Color(153, 0, 255));
        btnReturnBook3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnReturnBook3.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBook3.setText("ORM Authors");
        btnReturnBook3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBook3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturnBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIssueBooks1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNewButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReturnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReturnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnViewIssuedBooks1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewBooks1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogout, btnViewBooks, btnViewIssuedBooks, btnViewIssuedBooks1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReturnBook2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturnBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIssueBooks1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturnBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnViewBooks1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnViewBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnViewIssuedBooks)
                .addGap(18, 18, 18)
                .addComponent(btnViewIssuedBooks1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnLogout)
                .addGap(96, 96, 96))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnIssueBooks, btnLogout, btnReturnBook, btnViewBooks, btnViewIssuedBooks, btnViewIssuedBooks1, jButton1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        BooksForm.main(new String[]{}); 
        
   
    }//GEN-LAST:event_btnNewButtonActionPerformed

    private void btnViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBooksActionPerformed
        // TODO add your handling code here:
     
       
            ViewBooks.main(new String[]{});
        
            
    }//GEN-LAST:event_btnViewBooksActionPerformed

    private void btnIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBooksActionPerformed
        // TODO add your handling code here:
            this.dispose();
            IssueBookForm.main(new String[]{});
            
    }//GEN-LAST:event_btnIssueBooksActionPerformed

    private void btnViewIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewIssuedBooksActionPerformed
        // TODO add your handling code here:
   
            ViewIssuedBooks.main(new String[]{});
      
            
    }//GEN-LAST:event_btnViewIssuedBooksActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
        // TODO add your handling code here:
      this.dispose();
            ReturnBook.main(new String[]{});
            //frame.dispose();
       
    }//GEN-LAST:event_btnReturnBookActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
       
            Login.main(new String[]{});
            this.dispose();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        StudentsForm.main(new String[]{});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewIssuedBooks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewIssuedBooks1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Statistics.main(new String[]{});
    }//GEN-LAST:event_btnViewIssuedBooks1ActionPerformed

    private void btnNewButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteBooks.main(new String[]{});
    }//GEN-LAST:event_btnNewButton1ActionPerformed

    private void btnNewButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DeleteStudents.main(new String[]{});
    }//GEN-LAST:event_btnNewButton2ActionPerformed

    private void btnIssueBooks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBooks1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        OneStudentBooks.main(new String[]{});
    }//GEN-LAST:event_btnIssueBooks1ActionPerformed

    private void btnReturnBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBook1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UpdateBooks.main(new String[]{});
    }//GEN-LAST:event_btnReturnBook1ActionPerformed

    private void btnViewBooks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBooks1ActionPerformed
        // TODO add your handling code here:
        ViewStudents.main(new String[]{});
    }//GEN-LAST:event_btnViewBooks1ActionPerformed

    private void btnReturnBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBook2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UpdateStudents.main(new String[]{});
    }//GEN-LAST:event_btnReturnBook2ActionPerformed

    private void btnReturnBook3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBook3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ORMAuthors.main(new String[]{});
    }//GEN-LAST:event_btnReturnBook3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
  
                
        java.awt.EventQueue.invokeLater(() -> {
            new LibrarianSuccess().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIssueBooks;
    private javax.swing.JButton btnIssueBooks1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewButton;
    private javax.swing.JButton btnNewButton1;
    private javax.swing.JButton btnNewButton2;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JButton btnReturnBook1;
    private javax.swing.JButton btnReturnBook2;
    private javax.swing.JButton btnReturnBook3;
    private javax.swing.JButton btnViewBooks;
    private javax.swing.JButton btnViewBooks1;
    private javax.swing.JButton btnViewIssuedBooks;
    private javax.swing.JButton btnViewIssuedBooks1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
