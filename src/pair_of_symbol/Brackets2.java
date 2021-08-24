package pair_of_symbol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Brackets2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] array = reader.readLine().toCharArray();
        //клонируем массив, чтобы не изменять исходный
        char[] testArray = array.clone();
        List<char[]> listOfPair = Arrays.asList(new char[]{'{', '}'}, new char[]{'(', ')'},
                new char[]{'[', ']'}, new char[]{'a', 'b'});
        boolean isLineCorrect = false;
        if (testArray.length > 1) {
            for (int i = 0; i < testArray.length; i++) {
                if (testArray[i] == 0) {
                    continue;
                }
                for (int j = 0; j < listOfPair.size(); j++) {
                    isLineCorrect = findPairElement(testArray, i, listOfPair.get(j));
                    if (isLineCorrect == true) {
                        break;
                    }
                }
            }
        }
        System.out.println(isLineCorrect);
    }

    //найти в массиве array, начиная с элемента i пару элементов из pairElement
    public static boolean findPairElement(char[] array, int i, char[] pairElement) {
        if (array[i] == pairElement[0]) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == pairElement[1]) {
                    array[i] = 0;
                    array[j] = 0;
                    return true;
                }
            }
        }
        return false;
    }
}

