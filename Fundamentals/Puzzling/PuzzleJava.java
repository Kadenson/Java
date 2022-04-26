import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i = 1; i < 10; i++){
            random10.add(rand.nextInt(20) + 1);
        }

        return random10;
    }

    public String getRandomLetter(){
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = new String[26];

        for(int i = 0; i < 26; i++){
            alphabetArray[i] = String.valueOf(alphabet.charAt(i));
        }


        return alphabetArray[rand.nextInt(26)];
    }

    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }
}