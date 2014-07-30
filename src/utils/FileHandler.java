package utils;

import system.Formula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileHandler {

    public static ArrayList<Formula> getArrayFromFile(String fileIn) {
        File file = new File(fileIn);
        ArrayList<Formula> formulas = new ArrayList<Formula>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                formulas.add(new Formula(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return formulas;
    }

    public static void putArrayToFile(ArrayList<String> arrayList, String fileOut) {

        File file = new File(fileOut);

        try {

            PrintWriter printWriter = new PrintWriter(file);

            for (String string : arrayList) {
                printWriter.write(string + "\n");
            }
            printWriter.close();
        } catch (Exception e) {

        }


    }
}
