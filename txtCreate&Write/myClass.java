import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class myClass {
public static File file;

    public static void createFile(String name){
        file = new File(name);
        try {
            if (file.createNewFile()) {
                System.out.println("File created "+file.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("IO error");
            e.printStackTrace();
        }
    }

    public static void writeFile(String text){
        try {
            FileWriter wfile = new FileWriter(file);
            wfile.write(text);
            wfile.close();
        } catch (IOException e) {
            System.out.println("IO error");
            e.printStackTrace();
        }
    }
}
