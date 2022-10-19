package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CopyFile.copyFiles("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\textFile.txt","E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\newText.txt");
        System.out.println("Số ký tự trong file nguồn: "+CopyFile.countCharacter("E:\\CODEGYM\\Module 2\\src\\ss16_io_text_file\\textFile.txt"));
    }
}
