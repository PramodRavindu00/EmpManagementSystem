package ClassPackage;

import java.io.*;
import InterfacePackage.EmployeeInterface;
import javax.swing.table.DefaultTableModel;

public class EmployeeClass implements EmployeeInterface {

    FileSystem fs = new FileSystem("Employee_Details.txt");

    public String employeeID;
    public String employeeName;
    public String address;
    public String department;
    public String designation;
    public String epfNum;

    public EmployeeClass() {
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEpfNum(String epfNum) {
        this.epfNum = epfNum;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public DefaultTableModel viewAllEmployee() {

        DefaultTableModel defaultTableModel = new DefaultTableModel();     //creating a DefaultTableModel object
        String line;
        defaultTableModel.addColumn("Employee ID");
        defaultTableModel.addColumn("Employee Name");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Department");          //adding columns to the table
        defaultTableModel.addColumn("Designation");
        defaultTableModel.addColumn("EPF No");
        try {
            BufferedReader bufferedReader = new BufferedReader(fs.readAFile());
            while ((line = bufferedReader.readLine()) != null) {
                String[] tableRow = line.split(" ");
                if (tableRow.length == 6) {              //this block only executes if the array has  only 6 strings
                    defaultTableModel.addRow(tableRow);
                }
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.err.println("An error occurred while reading data " + ex);
        }
        return defaultTableModel;

    }

    public boolean searchEmployee(String employeeID, String epfNo) {   // search can be done by two parameters
        //search method for the manager
        boolean isFound = false;
        try {
            String[] emp = null;
            try (BufferedReader bufferedReader = fs.readAFile()) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    emp = line.split(" ");
                    if (emp[0].equalsIgnoreCase(employeeID) || emp[5].equalsIgnoreCase(epfNo)) {
                        isFound = true;

                        this.setEmployeeID(emp[0]);
                        this.setEmployeeName(emp[1]);
                        this.setAddress(emp[2]);           /* assiging values returned from the matched line */
                        this.setDepartment(emp[3]);       /* into variables */
                        this.setDesignation(emp[4]);
                        this.setEpfNum(emp[5]);

                        break;

                    }

                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occurred while Searching Employee " + ex);
        }
        return isFound;
    }

    public boolean searchEmployee(String employeeID) {    //search method for the assistant
        boolean isFound = false;
        try {
            String[] emp = null;
            try (BufferedReader bufferedReader = fs.readAFile()) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    emp = line.split(" ");

                    if (emp[0].equalsIgnoreCase(employeeID)) {
                        isFound = true;
                        this.setEmployeeID(emp[0]);
                        this.setEmployeeName(emp[1]);
                        this.setDepartment(emp[3]);
                        break;
                    }
                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occurred while Searching Employee " + ex);
        }
        return isFound;
    }

    public boolean employeeIDFound(String employeeID) {  //to check an employeeID is already added in the system
        // to prevent entering same employeeID twice
        String input = employeeID;

        boolean employeeIDFound = false;
        try {
            String[] words = null;
            try (BufferedReader bufferedReader = fs.readAFile()) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    words = line.split(" ");
                    if (words[0].equalsIgnoreCase(input)) {
                        employeeIDFound = true;
                        break;
                    }

                }
                bufferedReader.close();
            }

        } catch (IOException ex) {
            System.err.println("An error occured while reading data " + ex);
        }
        return employeeIDFound;
    }

    public boolean epfNumFound(String epfNum) {        //to check an epfNum is already added in the system
        // to prevent entering same epfNum twice
        String input = epfNum;

        boolean epfNumFound = false;
        try {

            String[] words = null;
            try (BufferedReader bufferedReader = fs.readAFile()) {

                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    words = line.split(" ");

                    if (words[5].equalsIgnoreCase(input)) {
                        epfNumFound = true;
                        break;
                    }

                }
                bufferedReader.close();
            }

        } catch (IOException ex) {
            System.err.println("An error occured while reading data " + ex);
        }
        return epfNumFound;
    }
}
