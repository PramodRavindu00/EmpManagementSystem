package UIPackage;

import ClassPackage.AssistantClass;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ClassPackage.EmployeeClass;

public class AssistantPage extends javax.swing.JFrame {

    AssistantClass assistantClass = new AssistantClass();
    EmployeeClass employeeClass = new EmployeeClass();            //creating instances 
    
    DefaultTableModel defaultTableModel = new DefaultTableModel();     //crating object for a table

    public AssistantPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        assistantTabs = new javax.swing.JTabbedPane();
        empListTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllEmployee = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        searchTab = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSearchEmployee = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchResult = new javax.swing.JTextArea();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Details Management System");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME HR ASSISTANT");

        assistantTabs.setBackground(new java.awt.Color(204, 204, 255));
        assistantTabs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        assistantTabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                assistantTabsStateChanged(evt);
            }
        });

        empListTab.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        tableAllEmployee.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        tableAllEmployee.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableAllEmployee.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        tableAllEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableAllEmployee.setGridColor(new java.awt.Color(0, 0, 0));
        tableAllEmployee.setName(""); // NOI18N
        tableAllEmployee.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tableAllEmployee);

        javax.swing.GroupLayout empListTabLayout = new javax.swing.GroupLayout(empListTab);
        empListTab.setLayout(empListTabLayout);
        empListTabLayout.setHorizontalGroup(
            empListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empListTabLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        empListTabLayout.setVerticalGroup(
            empListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        assistantTabs.addTab("Employee Details", empListTab);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        searchTab.setBackground(new java.awt.Color(204, 204, 255));
        searchTab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Enter Employee ID");

        txtSearchEmployee.setBackground(new java.awt.Color(204, 204, 255));
        txtSearchEmployee.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSearchEmployee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        btnSearch.setBackground(new java.awt.Color(49, 39, 38));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchTabLayout = new javax.swing.GroupLayout(searchTab);
        searchTab.setLayout(searchTabLayout);
        searchTabLayout.setHorizontalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchEmployee)))
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(600, Short.MAX_VALUE))
        );
        searchTabLayout.setVerticalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSearch)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        searchResult.setEditable(false);
        searchResult.setColumns(20);
        searchResult.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        searchResult.setRows(5);
        searchResult.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane3.setViewportView(searchResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(searchTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        assistantTabs.addTab("Search Employees", jPanel3);

        btnLogOut.setBackground(new java.awt.Color(49, 39, 38));
        btnLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("LogOut");
        btnLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(182, 182, 182))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(assistantTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assistantTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        LoginForm loginForm = new LoginForm();
        loginForm.show();
        this.dispose();

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void assistantTabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_assistantTabsStateChanged

        int selectedTab = assistantTabs.getSelectedIndex();

        if (selectedTab == 0) {

            defaultTableModel = assistantClass.viewAllEmployee();

            tableAllEmployee.setModel(defaultTableModel);

    }//GEN-LAST:event_assistantTabsStateChanged
        else if (selectedTab == 1) {
            txtSearchEmployee.setText("");
            searchResult.setText("");
        }
    }


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String employeeID = txtSearchEmployee.getText();

        if (txtSearchEmployee.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Enter valid Employee ID to search", "Search Employee", JOptionPane.WARNING_MESSAGE);
            
            searchResult.setText("");

        } else {

            if (employeeClass.searchEmployee(employeeID)) {

                searchResult.setText("\n \n" + "Employee ID : " + employeeClass.employeeID + "\n \n"
                        + "Employee Name : " + employeeClass.employeeName + "\n \n"
                        + "Department : " + employeeClass.department + "\n \n");

                txtSearchEmployee.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "There is no an Employee with given ID " + "\n"
                        + "Try only entering the Employee ID", "Search Employee", JOptionPane.ERROR_MESSAGE);
                
                txtSearchEmployee.setText("");
                searchResult.setText("");

            }

        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(AssistantPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssistantPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssistantPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssistantPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssistantPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane assistantTabs;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel empListTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea searchResult;
    private javax.swing.JPanel searchTab;
    private javax.swing.JTable tableAllEmployee;
    private javax.swing.JTextField txtSearchEmployee;
    // End of variables declaration//GEN-END:variables
}
