package ClassPackage;

import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class UserClass {

    FileSystem fs = new FileSystem("User_Info.txt");

    private String UserName;   //making private variables
    private String Password;
    private String UserType;

    public UserClass() {
    }

    public UserClass(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;

    }

    public UserClass(String UserName, String Password, String UserType) {
        this.UserName = UserName;
        this.Password = Password;
        this.UserType = UserType;
    }

    // public setter and getter methods to access variables in other classes (ENCAPSULATION)
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public boolean validateUserLogin() {
        try {
            String[] words = null;
            try (BufferedReader bufferReader = fs.readAFile()) {
                String user;

                while ((user = bufferReader.readLine()) != null) {
                    words = user.split(" ");

                    if (words[0].equals(UserName) && words[1].equals(Password)) {
                        this.setUserName(words[0]);
                        this.setPassword(words[1]);
                        this.setUserType(words[2]);  //assigning the userType with the 2nd index of the array
                        bufferReader.close();
                        return true;
                    }

                }
                bufferReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occured while validating login credentials" + ex);
        }

        return false;
    }

    public boolean addNewUser() {
        if (!fs.createANewFile()) {
            String record = UserName + " " + Password + " " + UserType;
            return fs.writeDataToFile(record);
        }
        return false;
    }

    public boolean userNameFound(String userName) {   //checking the userName is already added
        //prevent entering the userName twice

        String input = userName;

        boolean userNameFound = false;
        try {
            String[] words = null;
            try (BufferedReader bufferedReader = fs.readAFile()) {
                String FindLine;

                while ((FindLine = bufferedReader.readLine()) != null) {
                    words = FindLine.split(" ");
                    if (words[0].equalsIgnoreCase(input)) {
                        userNameFound = true;
                        bufferedReader.close();
                        break;     //exit from the loop without reading the remaining lines of the text file
                    }

                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occured while reading data " + ex);
        }
        return userNameFound;
    }

    public boolean ManagerFound(String userType) {

        String input = userType;
        boolean ManagerFound = false;
        try {
            String[] words = null;
            try (BufferedReader bufferedReader = fs.readAFile()) {
                String FindLine;

                while ((FindLine = bufferedReader.readLine()) != null) {
                    words = FindLine.split(" ");
                    if (words[2].equalsIgnoreCase(input)) {   //checking the 2nd index of words array matches with the input
                        ManagerFound = true;
                        bufferedReader.close();
                        break;
                    }

                }
                bufferedReader.close();
            }
        } catch (IOException ex) {
            System.err.println("An error occured while reading data " + ex);
        }
        return ManagerFound;
    }

    public DefaultTableModel viewAllUsers() {

        DefaultTableModel defaultTableModel = new DefaultTableModel();   //table object
        defaultTableModel.addColumn("User Name");
        defaultTableModel.addColumn("Password");                    //adding columns and names
        defaultTableModel.addColumn("User Type");

        String line;

        try {
            BufferedReader bufferedReader = fs.readAFile();
            while ((line = bufferedReader.readLine()) != null) {

                String[] tableRow = line.split(" ");
                defaultTableModel.addRow(tableRow);
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.err.println("An error occurred while reading data " + ex);

        }
        return defaultTableModel;    //returning the table model
    }

    public boolean deleteAUser(String userName) {

        boolean deleted = false;
        try {

            FileSystem fstemp = new FileSystem("temp_user.txt");
            BufferedReader bufferedReader = fs.readAFile();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] word = line.split(" ");
                if (word[0].equals(userName)) {
                    continue;
                }
                fstemp.writeDataToFile(line);
            }

            bufferedReader.close();
            fs.deleteAFile();
            fstemp.renameAFile("User_Info.txt");
            deleted = true;

        } catch (IOException ex) {
            System.err.println("An error occured while deleting data or renaming file " + ex);
        }
        return deleted;
    }
}
