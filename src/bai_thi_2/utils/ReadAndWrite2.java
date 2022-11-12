package bai_thi_2.utils;

import bai_thi_2.models.ChinhHang;
import bai_thi_2.models.XachTay;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ReadAndWrite2 {

    public static void writeFileChinhHang(ArrayList<ChinhHang> list, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (ChinhHang chinhHang : list) {
                bufferedWriter.write(chinhHang.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileXachTay(ArrayList<XachTay> list, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (XachTay xachTay : list) {
                bufferedWriter.write(xachTay.getInfo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static ArrayList<XachTay> readFileXachTay(String fileAddress) {
        ArrayList<XachTay> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                XachTay xachTay = new XachTay(Integer.parseInt(lineArr[0]), lineArr[1],Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), lineArr[4],lineArr[5], lineArr[6]);
                list.add(xachTay);

            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<ChinhHang> readFileChinhHang(String fileAddress) {
        ArrayList<ChinhHang> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                ChinhHang chinhHang = new ChinhHang(Integer.parseInt(lineArr[0]), lineArr[1],Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), lineArr[4],Integer.parseInt(lineArr[5]), lineArr[6]);
                list.add(chinhHang);

            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
