import system.Formula;
import utils.FileHandler;
import utils.Utils;

import java.util.ArrayList;

import static utils.FileHandler.getArrayFromFile;

public class CheckIt {

    public static void main(String[] args) {

        try {
            String fileIn = args[0];
            String fileOut = args[1];

            if (Utils.filesChecker(fileIn, fileOut)) startProcess(fileIn, fileOut);

        } catch (Exception e) {
            System.out.println("parameters not found");
        }
    }


    public static void startProcess(String fileIn, String fileOut) {

        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Integer> wrongSymbolsPositions;

        for (Formula formula : getArrayFromFile(fileIn)) {

            wrongSymbolsPositions = formula.getWrongSymbolsPositions();

            if (!wrongSymbolsPositions.isEmpty()) {

                String formulaString = formula.getFormula();

                arrayList.add(formulaString);
                arrayList.add(Utils.symbolPointerString(formulaString.length(), wrongSymbolsPositions));
            }
        }
        FileHandler.putArrayToFile(arrayList, fileOut);
    }
}
