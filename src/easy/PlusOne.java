package easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    int[] result = new int[digits.length + 1];
                    System.arraycopy(new int[]{1}, 0, result, 0, 1);
                    System.arraycopy(digits, 0, result, 1, digits.length);
                    digits = result;
                }
            }
        }
        return digits;
    }
}
