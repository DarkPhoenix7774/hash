import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

public class Main {


    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        Documento documento = new Documento(1,5,"D", "C",12, Calendar.getInstance().getTime(),"asd");

        MessageDigest md = MessageDigest.getInstance("MD5");
        try (InputStream is = Files.newInputStream(Paths.get("C:\\Users\\KEVIN\\Desktop\\hash\\Practica6 - copia\\generador.txt"))) {
            {
            }
            byte[] digest = md.digest();

        }
    }
}
