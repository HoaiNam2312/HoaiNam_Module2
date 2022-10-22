package ss17_io_text_file.thuc_hanh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        try {
            PrintWriter printWriter = new PrintWriter("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\read.txt", StandardCharsets.UTF_8);
//            BufferedWriter buffered = new BufferedWriter(new FileWriter("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\read.txt", false));
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
