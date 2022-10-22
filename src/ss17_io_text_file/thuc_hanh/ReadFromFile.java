package ss17_io_text_file.thuc_hanh;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\thuc_hanh\\read.txt"));
            PrintWriter printWriter = new PrintWriter("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\thuc_hanh\\write.txt","UTF-8");
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
                printWriter.flush();
            }
            printWriter.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
