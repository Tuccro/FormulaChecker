package utils;

import java.io.File;
import java.util.ArrayList;

public class Utils {

    public static boolean fileExists(String filePath) {
        File file = new File(filePath);
        if (file.canRead()) return true;
        else return false;
    }

    public static boolean filesChecker(String fileIn, String fileOut) {

        if (Utils.fileExists(fileIn) && Utils.fileExists(fileOut)) {
            return true;
        } else {
            if (!Utils.fileExists(fileIn)) System.out.println(fileIn + " not found");
            if (!Utils.fileExists(fileOut)) System.out.println(fileOut + " not found");
            return false;
        }

    }


    public static String symbolPointerString(int stringSize, ArrayList<Integer> numbers) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(stringSize);
        for (int i = 0; i < stringSize; i++) {
            stringBuffer.setCharAt(i, ' ');
        }

        for (int number : numbers) {
            stringBuffer.setCharAt(number, '^');
        }
        return stringBuffer.toString();
    }
}
