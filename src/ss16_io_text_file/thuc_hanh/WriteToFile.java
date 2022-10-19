package ss16_io_text_file.thuc_hanh;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        try {
            PrintWriter printWriter = new PrintWriter("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\textFile.txt", StandardCharsets.UTF_8);
            printWriter.println("Xin chào ae43");
            printWriter.print("Hoài Nam ");
            printWriter.print("Ly Ngok");
            printWriter.flush();
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
