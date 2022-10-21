package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            File file = new File("newFile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            pw.println("работает :D");
            pw.println("работает х2");
            pw.println("55555555");
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e){
            System.out.println("Error" + e);
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }
        }
    }
}
