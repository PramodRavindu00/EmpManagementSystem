package UIPackage;

import ClassPackage.EmployeeClass;
import ClassPackage.ManagerClass;
import ClassPackage.DesignationsClass;
import ClassPackage.DepartmentClass;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerPage extends javax.swing.JFrame {

    EmployeeClass employeeClass = new EmployeeClass();
    ManagerClass managerClass = new ManagerClass();
    DepartmentClass departmentClass = new DepartmentClass();
    DesignationsClass designationsClass = new DesignationsClass();

    DefaultTableModel departmentTableModel = new DefaultTableModel();
    DefaultTableModel designationTableModel = new DefaultTableModel();

    public ManagerPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        managerTabs = new javax.swing.JTabbedPane();
        registerTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbDesignation = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        empListTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableAllEmployee = new javax.swing.JTable();
        btnDeleteEmployee = new javax.swing.JButton();
        depsAndJobsTab = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        txtDesignationName = new javax.swing.JTextField();
        btnAddDepartment = new javax.swing.JButton();
        btnAddDesignation = new javax.swing.JButton();
        btnDeleteDepartment = new javax.swing.JButton();
        btnDeleteDesignation = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAllDesignations = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableAllDepartments = new javax.swing.JTable();
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME MANAGER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        managerTabs.setBackground(new java.awt.Color(204, 204, 255));
        managerTabs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        managerTabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                managerTabsStateChanged(evt);
            }
        });

        registerTab.setBackground(new java.awt.Color(204, 204, 255));
        registerTab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Employee ID");

        txtEmployeeID.setBackground(new java.awt.Color(204, 204, 255));
        txtEmployeeID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmployeeID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Employee Name");

        txtEmployeeName.setBackground(new java.awt.Color(204, 204, 255));
        txtEmployeeName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmployeeName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        txtAddress.setBackground(new java.awt.Color(204, 204, 255));
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txtAddress);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Address");

        cmbDepartment.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        cmbDepartment.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cmbDepartment.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("EPF NO");

        txtEPF.setBackground(new java.awt.Color(204, 204, 255));
        txtEPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Designation");

        cmbDesignation.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        cmbDesignation.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cmbDesignation.setBorder(null);
        cmbDesignation.setOpaque(false);

        btnRegister.setBackground(new java.awt.Color(49, 39, 38));
        btnRegister.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTER EMPLOYEE");
        btnRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerTabLayout = new javax.swing.GroupLayout(registerTab);
        registerTab.setLayout(registerTabLayout);
        registerTabLayout.setHorizontalGroup(
            registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTabLayout.createSequentialGroup()
                .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerTabLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(258, 258, 258)
                        .addComponent(jLabel5))
                    .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(registerTabLayout.createSequentialGroup()
                            .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(registerTabLayout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel6)
                                    .addGap(146, 146, 146)
                                    .addComponent(jLabel4))
                                .addGroup(registerTabLayout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(cmbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(52, 52, 52)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registerTabLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(166, 166, 166)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        registerTabLayout.setVerticalGroup(
            registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerTabLayout.createSequentialGroup()
                        .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerTabLayout.createSequentialGroup()
                                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        managerTabs.addTab("Employee Registration", registerTab);

        empListTab.setBackground(new java.awt.Color(204, 204, 255));
        empListTab.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jScrollPane4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        tableAllEmployee.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        tableAllEmployee.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        tableAllEmployee.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tableAllEmployee);

        btnDeleteEmployee.setBackground(new java.awt.Color(216, 34, 15));
        btnDeleteEmployee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmployee.setText("Delete an Employee");
        btnDeleteEmployee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empListTabLayout = new javax.swing.GroupLayout(empListTab);
        empListTab.setLayout(empListTabLayout);
        empListTabLayout.setHorizontalGroup(
            empListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empListTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(empListTabLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empListTabLayout.setVerticalGroup(
            empListTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empListTabLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteEmployee)
                .addGap(8, 8, 8))
        );

        managerTabs.addTab("Employee Details", empListTab);

        depsAndJobsTab.setBackground(new java.awt.Color(204, 204, 255));
        depsAndJobsTab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Department Name");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("ADD NEW DEPARTMENT");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("ADD NEW DESIGNATION");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Designation Name");

        txtDepartmentName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtDesignationName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnAddDepartment.setBackground(new java.awt.Color(49, 39, 38));
        btnAddDepartment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddDepartment.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDepartment.setText("Add");
        btnAddDepartment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepartmentActionPerformed(evt);
            }
        });

        btnAddDesignation.setBackground(new java.awt.Color(49, 39, 38));
        btnAddDesignation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddDesignation.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDesignation.setText("Add");
        btnAddDesignation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAddDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDesignationActionPerformed(evt);
            }
        });

        btnDeleteDepartment.setBackground(new java.awt.Color(216, 34, 15));
        btnDeleteDepartment.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteDepartment.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDepartment.setText("Delete");
        btnDeleteDepartment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnDeleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDepartmentActionPerformed(evt);
            }
        });

        btnDeleteDesignation.setBackground(new java.awt.Color(216, 34, 15));
        btnDeleteDesignation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeleteDesignation.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDesignation.setText("Delete");
        btnDeleteDesignation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnDeleteDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDesignationActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        tableAllDesignations.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        tableAllDesignations.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableAllDesignations.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAllDesignations.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tableAllDesignations);

        jScrollPane5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        tableAllDepartments.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        tableAllDepartments.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableAllDepartments.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAllDepartments.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tableAllDepartments);

        javax.swing.GroupLayout depsAndJobsTabLayout = new javax.swing.GroupLayout(depsAndJobsTab);
        depsAndJobsTab.setLayout(depsAndJobsTabLayout);
        depsAndJobsTabLayout.setHorizontalGroup(
            depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(95, 95, 95))
            .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDesignationName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnDeleteDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        depsAndJobsTabLayout.setVerticalGroup(
            depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtDesignationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnAddDepartment)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE))
                    .addGroup(depsAndJobsTabLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAddDesignation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(depsAndJobsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteDesignation)
                    .addComponent(btnDeleteDepartment))
                .addContainerGap())
        );

        managerTabs.addTab("Departments & Designations", depsAndJobsTab);

        searchTab.setBackground(new java.awt.Color(204, 204, 255));
        searchTab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Enter Employee ID / EPF No");

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

        searchResult.setEditable(false);
        searchResult.setColumns(20);
        searchResult.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        searchResult.setRows(5);
        searchResult.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jScrollPane3.setViewportView(searchResult);

        javax.swing.GroupLayout searchTabLayout = new javax.swing.GroupLayout(searchTab);
        searchTab.setLayout(searchTabLayout);
        searchTabLayout.setHorizontalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        searchTabLayout.setVerticalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addGroup(searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSearch))
                    .addGroup(searchTabLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        managerTabs.addTab("Search Employees", searchTab);

        jPanel1.add(managerTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 440));

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
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        LoginForm loginForm = new LoginForm();
        loginForm.show();
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepartmentActionPerformed

        String departmentName = txtDepartmentName.getText().toUpperCase();
       DepartmentClass DepartmentClass = new DepartmentClass(departmentName);

        boolean departmentFound = DepartmentClass.departmentFound(departmentName); //object for the constructor

        if (txtDepartmentName.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Enter the Department Name to add", "Add Department",
                    JOptionPane.WARNING_MESSAGE);

        } else if (departmentFound) {

            JOptionPane.showMessageDialog(null, "Department is already added",
                    "Add Department", JOptionPane.WARNING_MESSAGE);

            txtDepartmentName.setText("");

        } else {

            boolean addDepartment = DepartmentClass.addDepartment();

            if (addDepartment) {

                JOptionPane.showMessageDialog(null, "New department added", "Add Department", JOptionPane.INFORMATION_MESSAGE);
               
                departmentTableModel = DepartmentClass.viewAllDepartments();
                tableAllDepartments.setModel(departmentTableModel);

            } else {

                JOptionPane.showMessageDialog(null, "Sorry! Something went wrong with the application, Will be fixing it soon.", "Add Department", JOptionPane.ERROR_MESSAGE);
            }

            txtDepartmentName.setText("");
        }
    }//GEN-LAST:event_btnAddDepartmentActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        String employeeID = txtEmployeeID.getText().toUpperCase();
        String employeeName = txtEmployeeName.getText().toUpperCase();
        String address = txtAddress.getText().toUpperCase();
        String department = cmbDepartment.getSelectedItem().toString().toUpperCase();
        String designation = cmbDesignation.getSelectedItem().toString().toUpperCase();
        String epfNum = txtEPF.getText().toUpperCase();

        boolean valid = true;

        boolean employeeIDFound = employeeClass.employeeIDFound(employeeID);
        boolean epfNumFound = employeeClass.epfNumFound(epfNum);

        if (txtEmployeeID.getText().isEmpty() || txtEmployeeName.getText().isEmpty() || txtAddress.getText().isEmpty()
                || cmbDepartment.getSelectedItem().toString().isEmpty() || cmbDesignation.getSelectedItem().toString().isEmpty() || txtEPF.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Fields can't be empty", "Register Employee", JOptionPane.WARNING_MESSAGE);

        } else {
            if (employeeIDFound) {

                JOptionPane.showMessageDialog(null, "Employee ID already Registered", "Register Employee", JOptionPane.WARNING_MESSAGE);
                valid = false;

                txtEmployeeID.setText("");

            }
            if (epfNumFound) {

                JOptionPane.showMessageDialog(null, "EPF No already Registered", "Register Employee", JOptionPane.WARNING_MESSAGE);
                valid = false;
                txtEPF.setText("");
            }

            if (valid) {
                
                    //creating an instance for the constructor
                ManagerClass managerClass = new ManagerClass(employeeID, employeeName, address, department, designation, epfNum);

                if (managerClass.addNewEmployee()) {

                    JOptionPane.showMessageDialog(null, "Employee Registered", "Employee Registration", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "Sorry! Something went wrong with the application, Will be fixing it soon.", "Employee Registration", JOptionPane.ERROR_MESSAGE);
                }

                txtEmployeeID.setText("");
                txtEmployeeName.setText("");
                txtAddress.setText("");
                txtEPF.setText("");

            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnAddDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDesignationActionPerformed

        String designation = txtDesignationName.getText().toUpperCase();
        DesignationsClass DesignationClass=new DesignationsClass(designation);  //object for the constructor

       
        boolean designationFound = DesignationClass.designationFound(designation);

        if (txtDesignationName.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Enter the Designation Name to add", "Add Designations", JOptionPane.WARNING_MESSAGE);

        } else if (designationFound) {

            JOptionPane.showMessageDialog(null, "Designation is already added", "Add Designations", JOptionPane.WARNING_MESSAGE);

            txtDesignationName.setText("");

        } else {

            boolean addNewJob = DesignationClass.addNewJobType();

            if (addNewJob) {

                JOptionPane.showMessageDialog(null, "New designation added", "Add Designations", JOptionPane.INFORMATION_MESSAGE);
               
                designationTableModel = DesignationClass.viewAllDesignations();
                tableAllDesignations.setModel(designationTableModel);

            } else {

                JOptionPane.showMessageDialog(null, "Sorry! Something went wrong with the application, Will be fixing it soon.", "Add Designations", JOptionPane.ERROR_MESSAGE);
            }

            txtDesignationName.setText("");
        }


    }//GEN-LAST:event_btnAddDesignationActionPerformed

    private void managerTabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_managerTabsStateChanged

        int selectedTab = managerTabs.getSelectedIndex();

        if (selectedTab == 0) {
            
            txtEmployeeID.setText("");
            txtEmployeeName.setText("");
            txtAddress.setText("");
            txtEPF.setText("");
            
            String departmentComboBox = departmentClass.ReturnAllDepartments();
            String designationComboBox = designationsClass.ReturnAllDesignations();

            String[] populateDepartment = departmentComboBox.split("\n");    // array contains the string as individual components
            String[] populateDesignation = designationComboBox.split("\n");

            cmbDepartment.setModel(new DefaultComboBoxModel<>(populateDepartment));  // using the strings as the generic type parameter
            cmbDesignation.setModel(new DefaultComboBoxModel<>(populateDesignation));  
            
        } else if (selectedTab == 1) {

            DefaultTableModel defaultTableModel = employeeClass.viewAllEmployee();
            tableAllEmployee.setModel(defaultTableModel);
            
        } else if (selectedTab == 2) {
            
            txtDepartmentName.setText("");
            txtDesignationName.setText("");
            departmentTableModel = departmentClass.viewAllDepartments();
            tableAllDepartments.setModel(departmentTableModel);

            designationTableModel = designationsClass.viewAllDesignations();
            tableAllDesignations.setModel(designationTableModel);

        } else if (selectedTab == 3) {
            
            txtSearchEmployee.setText("");
            searchResult.setText("");
        }
    }//GEN-LAST:event_managerTabsStateChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String employeeID = txtSearchEmployee.getText();
        String epfNo = txtSearchEmployee.getText();

        if (txtSearchEmployee.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Enter valid Employee ID or EPF No to search", "Search Employee", JOptionPane.WARNING_MESSAGE);

            searchResult.setText("");

        } else {

            if (managerClass.searchEmployee(employeeID, epfNo)) {

                searchResult.setText("\n \n" + "Employee ID : " + managerClass.getEmployeeID() + "\n \n"
                        + "Employee Name : " + managerClass.getEmployeeName() + "\n \n"
                        + "Address : " + managerClass.getAddress() + "\n \n"
                        + "Department : " + managerClass.getDepartment() + "\n \n"
                        + "Designation : " + managerClass.getDesignation() + "\n \n"
                        + "EPF No : " + managerClass.getEpfNum());

                txtSearchEmployee.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "There is no an Employee with given data" + "\n"
                        + "Try only entering the Employee ID or EPF No", "Search Employee", JOptionPane.ERROR_MESSAGE);

                searchResult.setText("");
                txtSearchEmployee.setText("");

            }

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed

        JTable employeeTable = tableAllEmployee;
        int selectedRow = employeeTable.getSelectedRow();

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, "Please select the Employee to delete from the employee list", "Delete Employee", JOptionPane.WARNING_MESSAGE);
        }
        if (selectedRow >= 0) {

            String employeeID = (String) employeeTable.getValueAt(selectedRow, 0);
            boolean result = managerClass.deleteEmployee(employeeID);

            if (result) {

                JOptionPane.showMessageDialog(null, "Employee deleted from the system", "Delete Employee", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel defaultTableModel = employeeClass.viewAllEmployee();
                tableAllEmployee.setModel(defaultTableModel);

            } else {

                JOptionPane.showMessageDialog(null, "Sorry! Something went wrong with the application, Will be fixing it soon.", "Delete Employee", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnDeleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDepartmentActionPerformed

        JTable departmentTable = tableAllDepartments;
        int selectedRow = departmentTable.getSelectedRow();

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, "Select the department you want to delete", "Delete Department", JOptionPane.WARNING_MESSAGE);

        } else if (selectedRow >= 0) {

            String depatmentName = (String) departmentTable.getValueAt(selectedRow, 0);
            boolean result = departmentClass.deleteDepartment(depatmentName);

            if (result) {

                JOptionPane.showMessageDialog(null, "Department Deleted", "Delete Department", JOptionPane.INFORMATION_MESSAGE);
                departmentTableModel = departmentClass.viewAllDepartments();
                tableAllDepartments.setModel(departmentTableModel);

            } else {

                JOptionPane.showMessageDialog(null, "Sorry! Something went wrong with the application, Will be fixing it soon.", "Delete Department", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnDeleteDepartmentActionPerformed

    private void btnDeleteDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDesignationActionPerformed

        JTable designationTable = tableAllDesignations;
        int selectedRow = designationTable.getSelectedRow();

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, "Select the designation you want to delete", "Delete Designations", JOptionPane.WARNING_MESSAGE);

        } else if (selectedRow >= 0) {

            String designationName = (String) designationTable.getValueAt(selectedRow, 0);
            boolean result = designationsClass.deleteDesignation(designationName);

            if (result) {

                JOptionPane.showMessageDialog(null, "Designation Deleted", "Delete Designations", JOptionPane.INFORMATION_MESSAGE);
                designationTableModel = designationsClass.viewAllDesignations();
                tableAllDesignations.setModel(designationTableModel);

            } else {

                JOptionPane.showMessageDialog(null, "Sorry! Something went wrong with the application, Will be fixing it soon.", "Delete Designations", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteDesignationActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDepartment;
    private javax.swing.JButton btnAddDesignation;
    private javax.swing.JButton btnDeleteDepartment;
    private javax.swing.JButton btnDeleteDesignation;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    public javax.swing.JComboBox<String> cmbDepartment;
    public javax.swing.JComboBox<String> cmbDesignation;
    private javax.swing.JPanel depsAndJobsTab;
    private javax.swing.JPanel empListTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane managerTabs;
    private javax.swing.JPanel registerTab;
    private javax.swing.JTextArea searchResult;
    private javax.swing.JPanel searchTab;
    private javax.swing.JTable tableAllDepartments;
    private javax.swing.JTable tableAllDesignations;
    private javax.swing.JTable tableAllEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDepartmentName;
    private javax.swing.JTextField txtDesignationName;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtSearchEmployee;
    // End of variables declaration//GEN-END:variables
}
