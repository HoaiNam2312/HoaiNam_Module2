package ss17_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class CopyFile {
    public static void copyFiles(String sourcePath, String targetPath) throws FileNotFoundException {
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            BufferedReader readText = Files.newBufferedReader(sourceFile.toPath(), StandardCharsets.UTF_8);
            PrintWriter writeText = new PrintWriter(targetPath, StandardCharsets.UTF_8);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            while (true) {
                line = readText.readLine();
                if (line == null) {
                    break;
                }
                writeText.print(line);
                writeText.flush();
            }
            writeText.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int countCharacter(String sourcePath) throws IOException {
        File sourceFile = new File(sourcePath);
        BufferedReader readText = Files.newBufferedReader(sourceFile.toPath(), StandardCharsets.UTF_8);
        int count = 0;
        while (readText.read() != -1) {
            count++;
        }
        return count;
    }
}
