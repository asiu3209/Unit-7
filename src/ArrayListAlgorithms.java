import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class ArrayListAlgorithms {
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String i : stringList) {
            if (i.indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int belowAverage(ArrayList<Integer> intList) {
        int total = 0;
        int count = 0;
        int count2 = 0;
        double average = 0;
        for (int i : intList) {
            total += i;
            count++;
        }
        average = (double) total / count;
        for (int j : intList) {
            if (j < average) {
                count2++;
            }
        }
        return count2;
    }

    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            String temp = wordList.get(i);
            int length = wordList.get(i).length();
            if (temp.substring(length - 1, length).equals("s")) {
                wordList.set(i, temp.toUpperCase());
            }
        }
    }

    public static int indexOfMinimum(ArrayList<Integer> intList) {
        int min = intList.get(0);
        for (int i : intList) {
            if (i <= min) {
                min = i;
            }
        }
        return (intList.indexOf(min));
    }

    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2) {
        for (int i = 0; i < numList1.size(); i++) {
            if (numList1.get(i) != numList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void removeOdds(ArrayList<Integer> numList) {
        for (int i = numList.size() - 1; i >= 0; i--) {
            if (numList.get(i) % 2 == 1) {
                numList.remove(i);
            }
        }
    }

    public static void wackyVowels(ArrayList<String> wordList) {
        for (int i = wordList.size() - 1; i >= 0; i--) {
            String temp = wordList.get(i);
            if (temp.indexOf("a") != -1 || temp.indexOf("e") != -1 || temp.indexOf("i") != -1 || temp.indexOf("o") != -1) {
                wordList.remove(i);
            } else {
                wordList.add(i, temp);
            }
        }
    }

    public static void removeDuplicates(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            int temp = intList.get(i);
            for (int j = i + 1; j < intList.size(); j++) {
                if (temp == (intList.get(j))) {
                    intList.remove(j);
                    j--;
                }
            }
        }
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            wordList.add(i + 1, wordList.get(i).toUpperCase());
            i++;
        }
    }

    public static void duplicateUpperEnd(ArrayList<String> wordList) {
        int temp = wordList.size();
        for (int i = 0; i < temp; i++) {
            wordList.add(wordList.get(i).toUpperCase());
        }
    }

    public static void moveBWords(ArrayList<String> wordList) {
        ArrayList<String> bWords = new ArrayList<String>();
        int size = wordList.size() - 1;
        for (int i = size; i >= 0; i--) {
            if (wordList.get(i).indexOf("b") == 0) {
                bWords.add(wordList.get(i));
                wordList.remove(i);
            }
        }
        for (int i = 0; i < bWords.size(); i++) {
            wordList.add(0, bWords.get(i));
        }

    }

    public static ArrayList<Integer> modes(int[] numList) {
        int maxCount = 1;
        ArrayList<Integer> modesArr = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i : numList){
            temp.add(i);
        }
        for (int i = 0; i<numList.length;i++){
            int count = 0;
            for (int j = i+1; j<numList.length;j++){
                if (temp.get(i) == temp.get(j)){
                    count++;
                }
            }
            if (maxCount == count){
                maxCount = count;
                modesArr.add(numList[i]);
            }
            else if(maxCount < count){
                maxCount = count;
                modesArr.clear();
                modesArr.add(numList[i]);
            }

        }
        return modesArr;
    }
}
