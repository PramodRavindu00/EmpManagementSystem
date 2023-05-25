package ClassPackage;

import java.io.*;

public class FileSystem {

    private static String FILE_PATH = "..\\st20251283_CSE4006_Writi1\\Files\\";
    File file;      //file constructor
    private String fileName;         //creating a variable to get a name to text file
    private FileWriter fileWriter;
    private FileReader fileReader;

    public FileSystem(String fileName) {
        this.fileName = fileName;
        createANewFile();
    }

    public boolean createANewFile() {
        try {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
                return true;
            }
            System.out.println("File Already Exists " + file.getName());
            return false;
        } catch (IOException ex) {
            System.err.println("An error occured when creating the file " + ex);
            return false;
        }

    }

    public boolean writeDataToFile(String record) {
        try {
            file.createNewFile();
            try (FileWriter fileWriter = new FileWriter(file, true);  
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                bufferedWriter.write(record);
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileWriter.close();
            }
            return true;
        } catch (IOException ex) {
            System.err.println("An error occcured while writing data to the file " + ex);
            return false;
        }
    }

    public BufferedReader readAFile() {
        if (!createANewFile()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
               
                return bufferedReader;
            } catch (IOException ex) {
                System.err.println("An error occcured while reading data " + ex);
            }
        }
        return null;
    }

    public boolean deleteAFile() {
        
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully: " + file.getName());
                return true;
            } else {
                System.err.println("File not deleted: " + file.getName());
                return false;
            }
        } else {
            System.err.println("File does not exist: " + file.getName());
            return false;
        }
    }

    public boolean renameAFile(String newName) {
        File newFile = new File(FILE_PATH + newName);
        if (file.renameTo(newFile)) {
           
            this.fileName = newName;  //new name assigns into the fileName variable 
            this.file = newFile;
            System.out.println("File renamed to: " + newName);
            
            return true;
        } else {
            System.err.println("Failed to rename file ");
        }
        return false;
    }

}
