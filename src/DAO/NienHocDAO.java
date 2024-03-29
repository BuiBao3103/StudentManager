/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NienHocDTO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class NienHocDAO {

    public NienHocDTO getCurrentNienHoc() {
        NienHocDTO nh = null;
        try {
            FileReader reader = new FileReader("src/resource/config/NienHoc.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            int hk = Integer.parseInt(line.split(" ")[0]);
            int nam = Integer.parseInt(line.split(" ")[1]);
            reader.close();
            bufferedReader.close();
            nh = new NienHocDTO(hk, nam);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return nh;
    }

    public void updateCurrentNienHoc(int hk, int nam) {
        try {
            FileWriter writer = new FileWriter("src/resource/config/NienHoc.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(hk + " " + nam);
            bufferedWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
