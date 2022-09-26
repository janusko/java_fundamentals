import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        Random randomNum = new Random();

        for(int i = 1; i <= 10; i++) {
            tenRolls.add(randomNum.nextInt(21));
        }
        return tenRolls;
    }

    public String getRandomLetter() {
        Random randomLetter = new Random();
        String alphabetLetters = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetLetters.charAt(i));
        }
        return alphabet[randomLetter.nextInt(26)];
    }

    public String generatePassword() {
        String password = "";

        for(int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        // we don't know how long the array will be, so use an arrayList.

        ArrayList<String> setPassword = new ArrayList<String>();

        for(int i = 0; i < length; i++) {
            setPassword.add(generatePassword());
        }
        return setPassword;
    }
}