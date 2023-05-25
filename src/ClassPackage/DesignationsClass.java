package ClassPackage;

import InterfacePackage.DesignationsInterface;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class DesignationsClass implements DesignationsInterface {

    FileSystem fsJob = new FileSystem("Designations.txt");
    private String designation;

    public DesignationsClass() {
    }

    public DesignationsClass(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean addNewJobType() {
        String record = designation;
        if (!fsJob.createANewFile()) {

            return fsJob.writeDataToFile(record);
        }

        return false;
    }

    public String ReturnAllDesignations() {    //return designations as a string

        String line, lines = "";

        try {

            try (BufferedReader bufferedReader = new BufferedReader(fsJob.readAFile())) {
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

    public DefaultTableModel viewAllDesignations() {   //to return designations as a table model

        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("All Designations");
        String line;

        try {
            BufferedReader bufferedReader = fsJob.readAFile();
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

    public boolean designationFound(String designation) {    //to check an designation is already added in the system
                                                             // to prevent adding same department twice

        String input = designation;

        boolean designationFound = false;
        try {

            try (BufferedReader bufferedReader = fsJob.readAFile()) {
                String line;

                while ((line = bufferedReader.readLine()) != null) {

                    if (line.equalsIgnoreCase(input)) {
                        designationFound = true;
                        break;
                    }
                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occured while reading data " + ex);
        }
        return designationFound;
    }

    @Override
    public boolean deleteDesignation(String designationName) {

        boolean deleted = false;

        try {
            FileSystem fstemp = new FileSystem("temp_designation.txt");
            BufferedReader bufferedReader = fsJob.readAFile();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] word = line.split(" ");

                if (word[0].equals(designationName)) {
                    continue;   //skip the matching line
                }

                fstemp.writeDataToFile(line);

            }
            bufferedReader.close();
            fsJob.deleteAFile();
            fstemp.renameAFile("Designations.txt");
            deleted = true;

        } catch (IOException ex) {
            System.err.println("An error occured while deleting data or renaming file " + ex);
        }
        return deleted;
    }

}
