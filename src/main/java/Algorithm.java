import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Algorithm {
    public static void main(String[] args) {
        //variables
        int[] list = {1,2,3};
        int num = 4;
        String letters = "abcde";
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"d", "e", "f"};
        String word = "hello";

        ArrayList<String> words = new ArrayList<>();
        words.add("quick");
        words.add("brown");
        words.add("fox");

        //main calls to sout
        int[] result = doubleNums(list);
        System.out.println("1. doubleNums: "+ Arrays.toString(result));

        int[] multResult = multiplyNums(list, num);
        System.out.println("2. multiplyNums: "+ Arrays.toString(multResult));

        String dubLetters = doubleLetters(letters);
        System.out.println("3. doubleLetters: "+dubLetters);

        ArrayList<String> interleaveResult = interleave(arr1, arr2);
        System.out.println("4. Interleave: "+interleaveResult);

        ArrayList<String> rangeResult = createRange(word, num);
        System.out.println("5. createRange: "+rangeResult);

        HashMap<String, Integer> flipArrayResult = flipArray(words);
        System.out.println("6. flipArray: "+flipArrayResult);
    }

    public static int[] doubleNums(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    public static int[] multiplyNums(int[] arr, int num){
        for(int i = 0; i < arr.length; i ++){
            arr[i] = arr[i]*num;
        }
        return arr;
    }

    public static String doubleLetters(String letters){
        String acc = "";
        for (int i = 0; i < letters.length(); i ++){
            acc += String.valueOf(letters.charAt(i)) + String.valueOf(letters.charAt(i));
        }
        return acc;
    }

    public static ArrayList<String> interleave(String[] arr1, String[] arr2){
        ArrayList<String> arr3 = new ArrayList<>();

        for(int i = 0; i<arr1.length; i++){
            arr3.add(arr1[i]);
            arr3.add(arr2[i]);
        }
        return arr3;
    }

    public static ArrayList<String> createRange(String word, int num){
        ArrayList<String> acc = new ArrayList<>();

        for (int i = 0; i < num; i++){
            acc.add(word);
        }
    return acc;
    }

    public static HashMap<String, Integer> flipArray(ArrayList<String> words) {
        HashMap<String, Integer> flipArrayResult = new HashMap<>();

        for(int i = 0; i < words.size(); i++){
            flipArrayResult.put(words.get(i), i);
        }
        return flipArrayResult;
    };


}
