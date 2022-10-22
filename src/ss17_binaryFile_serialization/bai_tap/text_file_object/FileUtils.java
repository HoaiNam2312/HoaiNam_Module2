package ss17_binaryFile_serialization.bai_tap.text_file_object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeFile(List<Product> productList, String fileAddress) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Product product : productList) {
                bufferedWriter.write(product.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readFile(String fileAddress) {
        List<Product> productList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                productList.add(new Product(line));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return productList;
    }
}
