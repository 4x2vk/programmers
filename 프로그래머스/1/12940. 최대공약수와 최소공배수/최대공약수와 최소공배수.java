class Solution {
    public int[] solution(int n, int m) {
        int gcd = findGCD(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}
