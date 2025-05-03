import java.util.ArrayList;
import java.util.HashMap;

public class Exercise {
    public static void main(String[] args) {
        /**
         *  1. Check if a String is a Palindrome (malam, madam, level)
            2. Count the Number of Vowels (a, i, u, e, o) in a String
            3. Check if Two Strings Are Anagrams (listen -> silent, study -> dusty) using toCharArray
            4. Using HashMap Please count the character
            5. Remove Duplicate Characters from a String
            6. Find the Most Frequent Character in a String
            7. Check if Two Strings Are Anagrams without toCharArray method
            8. String[] students = {
                            "Mohamed Ahmed",
                            "Mohamed Ali",
                            "Mohamed Salah",
                            "Mohamed Hassan",
                            "Mohamed Ibrahim",
                            "Mohamed Noor",
                            "Mohamed Farah",
                            "Mohamed Yusuf",
                            "Mohamed Ismail",
                            "Mohamed Kamal"
                        };
                        I want the output to be
                        Ahmed, Muhammad
                        Salah, Muhammad
                        etc
         */

        // CASE 1
        /**
         * 1. create a variable that hold the original word
         * 2. create a varible that hold the reversed word
         * 3. loop from last index to the forward
         * 4. we check with if-statement is the word palindrome
         */

        String word = "level";
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println("The word " + word + " is polyndrome");
        } else {
            System.out.println("The word " + word + " isn't polyndrome");
        }
        System.out.println("=================================");



        // CASE 2 - Count the Number of Vowels (a, i, u, e, o) in a String
        /**
         * 1. create a variable that holds the text
         * 2. create an array variable that holds the vowels
         * 3. create an int variable that holds the vowels appererance
         * 3. looping for the text and looping for the vowels array
         * 4. increment the int varible if the vowels appears in the text
         */

        String text = "rendiii";
        String[] vowels = {"a", "i", "u", "e", "o"};
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            // System.out.println(text.charAt(i));
            for (int j = 0; j < vowels.length; j++) {
                // System.out.println(vowels[j]);
                if (String.valueOf(text.charAt(i)).contains(vowels[j])) {
                    count++;
                }
            }
        }
        System.out.println("The vowels in " + text + " appears " + count + " times.");
        System.out.println("=================================");



        // CASE 3 - Check if Two Strings Are Anagrams (listen -> silent, study -> dusty) using toCharArray
        /**
         * 1. create variables that contains the word to check
         * 2. we do toCharArray method of the word
         * 3. we arrange/sort the letter from a-z order
         * 4. we check with equalsIgnoreCase to check is the result of the word are same
         */

        String word1 = "study";
        String word2 = "dusty";

        char[] word1_in_array = word1.toCharArray();
        java.util.Arrays.sort(word1_in_array);
        String word1Result = String.valueOf(word1_in_array);

        char[] word2_in_array = word2.toCharArray();
        java.util.Arrays.sort(word2_in_array);
        String word2Result = String.valueOf(word2_in_array);

        if (word1Result.equalsIgnoreCase(word2Result)) {
            System.out.println("Word " + word1 + " and word " + word2 + " is anagrams");
        } else {
            System.out.println("Word " + word1 + " and word " + word2 + " isn't anagrams");
        }
        System.out.println("=================================");



        // CASE 4 - Using HashMap Please count the character
        /**
         * 1. Create a variable that contains the sentence
         * 2. Create a variable as HashMap
         * 3. loop the sentence
         * 4. check the char with if-statement and count the apperance
         */
        String sentence = "Rendy Elang Lesmana".toUpperCase();
        HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();

        for (char ch : sentence.toCharArray()) {
            if (ch == ' ') {
                continue;
            } else if (countChar.containsKey(ch)) {
                countChar.put(ch, countChar.get(ch) + 1);
            } else {
                countChar.put(ch, 1);
            }
        }
        System.out.println("Sentence: " + sentence);
        for (char key : countChar.keySet()) {
            System.out.println("Character " + key + " appears " + countChar.get(key) + " times.");
        }
        System.out.println("=================================");



        // CASE 5 - Remove Duplicate Characters from a String
        /**
         * 1. Create variables before after that holds the sentence
         * 2. loop through before
         * 3. check and assign to after variable
         */
        String before = "from the river to the sea, palestine will be free".toUpperCase();
        String after = "";

        for (char ch : before.toCharArray()) {
            if (ch == ' ') {
                continue;
            } else if (after.contains(String.valueOf(ch))) {
                continue;
            } else {
                after += ch;
            }
        }
        System.out.println("Before: " + before);
        System.out.println("After: " + after);

        System.out.println("=================================");



        // CASE 6 - Find the Most Frequent Character in a String
        String whatever = "rendy elang lesmana";
        int max = 0;
        ArrayList<Character> mostFrequentChar = new ArrayList<>();
        HashMap<Character, Integer> charCounting = new HashMap<Character, Integer>();

        for (char ch : whatever.toCharArray()) {
            if (ch == ' ') {
                continue;
            } else if (charCounting.containsKey(ch)) {
                charCounting.put(ch, charCounting.get(ch) + 1);
            } else {
                charCounting.put(ch, 1);
                // if (charCounting.get(ch) > max) {
                //     max = charCounting.get(ch);
                //     mostFrequentChar = ch;
                // }
            }

            if (charCounting.get(ch) > max) {
                max = charCounting.get(ch);
                mostFrequentChar.clear();
                mostFrequentChar.add(ch);
            } else if (charCounting.get(ch) == max) {
                if (!mostFrequentChar.contains(ch)) {
                    mostFrequentChar.add(ch);
                }
            }
        }
        System.out.println("Sentence: " + whatever);
        for (char key : charCounting.keySet()) {
            System.out.println("Character " + key + " appears " + charCounting.get(key) + " times.");
        }
        System.out.println("The most frequent character is " + mostFrequentChar + " with " + max + " apperance");
        System.out.println("=================================");


        
        // CASE 7 - Check if Two Strings Are Anagrams without toCharArray method
        String kata1 = "study";
        String kata2 = "dusty";

        if (kata1.length() != kata2.length()) {
            System.out.println("Word " + kata1 + " and word " + kata2 + " aren't anagram");
        } else {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            for (int i = 0; i < kata1.length(); i++) {
                char ch = kata1.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }

            for (int i = 0; i < kata2.length(); i++) {
                char ch = kata2.charAt(i);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            if (map1.equals(map2)) {
                System.out.println("Word " + kata1 + " and word " + kata2 + " are anagrams");
            } else {
                System.out.println("Word " + kata1 + " and word " + kata2 + " aren't anagrams");
            }
        }
        System.out.println("=================================");



        // CASE 8
        String[] students = {
            "Mohamed Ahmed",
            "Mohamed Ali",
            "Mohamed Salah",
            "Mohamed Hassan",
            "Mohamed Ibrahim",
            "Mohamed Noor",
            "Mohamed Farah",
            "Mohamed Yusuf",
            "Mohamed Ismail",
            "Mohamed Kamal"
        };

        for (String student : students) {
            String[] fullName = student.split(" ");
            String firstName = fullName[0];
            String lastName = fullName[1];
            System.out.println(lastName + ", " + firstName);
        }
    }
}
