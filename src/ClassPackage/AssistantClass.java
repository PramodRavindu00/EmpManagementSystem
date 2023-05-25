package ClassPackage;

import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

//sub classes accessing methods and variables of a superclass //Inheritance used
public class AssistantClass extends EmployeeClass {

    EmployeeClass employeeClass = new EmployeeClass();

    private String EmployeeID = employeeClass.employeeID;
    private String EmployeeName = employeeClass.employeeName;
    private String Department = employeeClass.department;

    public String getEmployeeID() {
        return EmployeeID;
    }

    @Override
    public void setEmployeeID(String employeeID) {
        this.EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    @Override
    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public String getDepartment() {
        return Department;
    }

    @Override
    public void setDepartment(String department) {
        this.Department = department;
    }

    @Override
    public DefaultTableModel viewAllEmployee() {    //method returns the values as a table form
                                                    //override method from the employee class to perform in a different way

        DefaultTableModel defaultTableModel = new DefaultTableModel();  //object of the table

        defaultTableModel.addColumn("Employee ID");
        defaultTableModel.addColumn("Employee Name");
        defaultTableModel.addColumn("Department");   //making columns for the table

        String line;

        try {
            try (BufferedReader bufferedReader = new BufferedReader(fs.readAFile())) {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split(" ");
                    String[] tableRow = {words[0], words[1], words[3]}; //getting only the selected values are in the array indexes
                    if (tableRow.length == 3) {
                        defaultTableModel.addRow(tableRow);
                    }
                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occurred while displaying data " + ex);
        }

        return defaultTableModel;
    }

}
