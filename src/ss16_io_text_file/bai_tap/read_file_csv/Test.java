package ss16_io_text_file.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        File fileSource = new File("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\FileCSV.csv");
        BufferedReader reader = Files.newBufferedReader(fileSource.toPath(), StandardCharsets.UTF_8);
        String line = "", text = "";
        try {
            while ((line = reader.readLine()) != null) {
                String textArray[] = line.split(",");
                List<String> result = new ArrayList<>();

                for (int i = 0; i < textArray.length; i++) {
                    result.add(textArray[i]);
                }
                System.out.println(
                        "Country [id= "
                                + result.get(0)
                                + ", code= " + result.get(1)
                                + " , name=" + result.get(2)
                                + "]");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
