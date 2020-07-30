package easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split("\\s+");
        if (splited.length != 0) {
            return splited[splited.length - 1].length();
        } else {
            return 0;
        }
    }
}
