package ss16_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ReadFromFile {
    public static void main(String[] args) {
        File file = new File("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\thuc_hanh\\textFile.txt");

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
