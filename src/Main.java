import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String dir = "D:\\";
        File t = new File(dir);
        String str = "Привет Мир!";
        str = str + str.length() +"\n";
        String str1 = "Как дела? ";
        str1 = str1 + str1.length() + "\n";
        byte buff [] = str.getBytes();
        byte buff1 [] = str1.getBytes();
        OutputStream obj = new FileOutputStream("D:\\1.txt");
        for(int i=0; i<buff.length; i++){
            obj.write(buff[i]);
        }
        for(int i=0; i<buff1.length; i++){
            obj.write(buff1[i]);
        }
        int readByte;
        String fileText;
        ByteArrayOutputStream readText = new ByteArrayOutputStream();
        FileInputStream is = new FileInputStream(new File("D:/1.txt"));
        while ((readByte = is.read()) != -1) {
            readText.write(readByte);
        }
        fileText = readText.toString();
        File newFile = new File("D:/2.txt");
        if (!newFile.exists()){
            newFile.createNewFile();
        }
        OutputStream fos = new FileOutputStream(newFile);
        fos.write(fileText.getBytes());
        fos.close();
    }
}