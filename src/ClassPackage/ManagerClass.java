package ClassPackage;

import InterfacePackage.HRManagerInterface;

import java.io.*;

//sub classes accessing methods and variables of a superclass //Inheritance used
public class ManagerClass extends EmployeeClass implements HRManagerInterface {

    public ManagerClass() {

    }

    FileSystem fsEmp = new FileSystem("Employee_Details.txt");
    
    
    EmployeeClass employeeClass = new EmployeeClass();

    private String EmployeeID     =   employeeClass.employeeID;
    private String EmployeeName   =   employeeClass.employeeName;
    private String Address        =   employeeClass.address;
    private String Department     =   employeeClass.department;
    private String Designation    =   employeeClass.designation;
    private String EpfNum         =   employeeClass.epfNum;

    public ManagerClass(String employeeID, String employeeName, String address, String department,
            String designation, String epfNum) {

        this.EmployeeID = employeeID;
        this.EmployeeName = employeeName;
        this.Address = address;
        this.Department = department;
        this.Designation = designation;
        this.EpfNum = epfNum;
    }

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

    public String getAddress() {
        return Address;
    }

    @Override
    public void setAddress(String address) {
        this.Address = address;
    }

    public String getDepartment() {
        return Department;
    }

    @Override
    public void setDepartment(String department) {
        this.Department = department;
    }

    public String getDesignation() {
        return Designation;
    }

    @Override
    public void setDesignation(String designation) {
        this.Designation = designation;
    }

    public String getEpfNum() {
        return EpfNum;
    }

    @Override
    public void setEpfNum(String epfNum) {
        this.EpfNum = epfNum;
    }

    @Override
    public boolean addNewEmployee() {
        if (!fsEmp.createANewFile()) {
            String record = EmployeeID + " " + EmployeeName + " "
                    + Address + " " + Department + " " + Designation + " " + EpfNum;
            return fsEmp.writeDataToFile(record);
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(String employeeID) {

        boolean deleted = false;
        try {

            FileSystem fstemp = new FileSystem("temp_Employee.txt");
            BufferedReader bufferedReader = fsEmp.readAFile();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] word = line.split(" ");
                if (word[0].equals(employeeID)) {
                    continue;               //skip reading the line which contains the employeeID 
                }
                fstemp.writeDataToFile(line);
            }

            bufferedReader.close();
            fsEmp.deleteAFile();
            fstemp.renameAFile("Employee_Details.txt");

            deleted = true;

        } catch (IOException ex) {
            System.err.println("An error occured while deleting data or renaming file " + ex);
        }
        return deleted;
    }

}
