import java.io.*;

//class for reading and writing to files by Character
public class FileIO {

    private String fileName = null;
    private String fileContent = "";

    FileIO (String filePath) {
        this.fileName = filePath;
    }

    //reads from files by character
    public String readCharFile() {

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader input = new BufferedReader(fileReader);

            String line = null;
            while ((line = input.readLine()) != null) {
                fileContent += line+"\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    //writes to files by character
    public void writeCharFile(String fileContentToWrite) {

        try {
            PrintWriter output = new PrintWriter(fileName);
            output.println(fileContentToWrite);
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
