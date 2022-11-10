package bai_thi.utils;

import Bai_Tap_Lon.account.AccountLessor;
import bai_thi.models.NguoiDangKy;
import bai_thi.models.OTO;
import bai_thi.models.XeTai;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ReadAndWrite {
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public static void writeFileNguoiDangKy(ArrayList<NguoiDangKy> list, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (NguoiDangKy nguoiDangKy : list) {
                if (nguoiDangKy.getXeTai() != null) {
                    bufferedWriter.write(nguoiDangKy.getInfoXeTai());
                    bufferedWriter.newLine();
                } else {
                    bufferedWriter.write(nguoiDangKy.getInfoOto());
                    bufferedWriter.newLine();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static ArrayList<NguoiDangKy> readFileNguoiDangKy(String fileAddress) {
        //Thay kiểu dữ liệu
        ArrayList<NguoiDangKy> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                if (lineArr[4].equals("Tải")) {
                    XeTai xeTai = new XeTai(lineArr[3],lineArr[4],lineArr[5],df.parse(lineArr[6]), Integer.parseInt(lineArr[7]), Integer.parseInt(lineArr[8]), Integer.parseInt(lineArr[9]));
                    NguoiDangKy nguoiDangKy = new NguoiDangKy(lineArr[0],lineArr[1],df.parse(lineArr[2]),lineArr[3],xeTai);
                    list.add(nguoiDangKy);
                    continue;
                }
                OTO oto = new OTO(lineArr[3], lineArr[4], lineArr[5], df.parse(lineArr[6]), Integer.parseInt(lineArr[7]), Integer.parseInt(lineArr[8]), Integer.parseInt(lineArr[9]), lineArr[10]);
                NguoiDangKy nguoiDangKy = new NguoiDangKy(lineArr[0],lineArr[1],df.parse(lineArr[2]),lineArr[3],oto);
                list.add(nguoiDangKy);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static ArrayList<XeTai> readFileXeTai(String fileAddress) {
        ArrayList<XeTai> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");

                XeTai xeTai = new XeTai(lineArr[0],lineArr[1],lineArr[2],df.parse(lineArr[3]),Integer.parseInt(lineArr[4]),Integer.parseInt(lineArr[5]),Integer.parseInt(lineArr[6]));
                list.add(xeTai);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static ArrayList<OTO> readFileOto(String fileAddress) {
        ArrayList<OTO> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");

                OTO oto = new OTO(lineArr[0],lineArr[1],lineArr[2],df.parse(lineArr[3]),Integer.parseInt(lineArr[4]),Integer.parseInt(lineArr[5]),Integer.parseInt(lineArr[6]),lineArr[7]);
                list.add(oto);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
