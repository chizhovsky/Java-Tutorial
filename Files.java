import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Files {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        String [] names = dir.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        File file = new File("Java-lessons.iml");
        System.out.println("Length of file Java-lessons.iml: " + file.length());
        FileInputStream input = new FileInputStream(file);
        int length = input.available();
        System.out.println("Available for reading: " + length);
        byte [] data = new byte[length];
        input.read(data);
        FileOutputStream output = new FileOutputStream(file, true);
        String newText = "<!-- Hello world files! -->>";
        byte [] newTextBytes = newText.getBytes();
        output.write(newTextBytes);
        output.close();
    }
}
