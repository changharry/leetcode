package easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
