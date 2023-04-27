import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {

    public static void makeFile(String fileName){
        try {
            File file = new File(fileName+".txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }

    public static void writeFile(String toBeWriten, String fileName){
        makeFile(fileName);
        try {
            FileWriter Writer = new FileWriter(fileName+".txt");
            Writer.write(toBeWriten);
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

    }
    public static void writeFile(String[] toBeWriten, String fileName){
        String toBeWritenString=new String();
        for (int i = 0; i < toBeWriten.length; i++) {
            toBeWritenString+=toBeWriten[i];
        }
        writeFile(toBeWritenString,fileName);
    }

    public static String readFile(String fileName){
        String data=new String();
        try {
            File Obj = new File(fileName+".txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                 data += Reader.nextLine()+"\n";
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        return data;
    }

}
