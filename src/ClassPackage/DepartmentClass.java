package ClassPackage;

import InterfacePackage.DepartmentInterface;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class DepartmentClass implements DepartmentInterface {

    FileSystem fsDep = new FileSystem("Departments.txt");

    private String department;

    public DepartmentClass() {
    }

    public DepartmentClass(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean addDepartment() {

        String record = department;

        if (!fsDep.createANewFile()) {
            return fsDep.writeDataToFile(record);
        }
        return false;
    }

    public String ReturnAllDepartments() {   //to return department details as a string

        String line, lines = "";

        try {

            try (BufferedReader bufferedReader = new BufferedReader(fsDep.readAFile())) {
                while ((line = bufferedReader.readLine()) != null) {

                    lines = lines + line + "\n";
                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occurred while reading data " + ex);
        }

        return lines;
    }

    public DefaultTableModel viewAllDepartments() {   //to return department details as a table form

        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("All departments");
        String line;

        try {
            BufferedReader bufferedReader = fsDep.readAFile();
            while ((line = bufferedReader.readLine()) != null) {
                String[] tableRow = line.split(" ");

                defaultTableModel.addRow(tableRow);

            }
            bufferedReader.close();
        } catch (IOException ex) {

            System.err.println("An error occurred while reading data " + ex);

        }

        return defaultTableModel;

    }

    public boolean departmentFound(String department) {     //checking the user entering department name is already added or not

        String input = department;

        boolean departmentFound = false;
        try {

            try (BufferedReader bufferedReader = fsDep.readAFile()) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {

                    if (line.equalsIgnoreCase(input)) {
                        departmentFound = true;
                        break;
                    }

                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occured while reading data " + ex);
        }
        return departmentFound;
    }

    @Override
    public boolean deleteDepartment(String departmentName) {

        boolean deleted = false;

        try {
            FileSystem fstemp = new FileSystem("temp_Department.txt");
            BufferedReader bufferedReader = fsDep.readAFile();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] word = line.split(" ");

                if (word[0].equals(departmentName)) {
                    continue;     //skip reading the matching line
                }
                fstemp.writeDataToFile(line);
            }
            bufferedReader.close();
            fsDep.deleteAFile();      //deleting the fsDep file
            fstemp.renameAFile("Departments.txt");          //renaming the file
            deleted = true;

        } catch (IOException ex) {
            System.err.println("An error occured while deleting data or renaming file " + ex);
        }
        return deleted;
    }
}
