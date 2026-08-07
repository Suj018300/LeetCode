class Solution {
    public int fib(int n) {
    if (n <= 1) {
            return n;
        }

        // Recursive case: calculate previous two terms
        int last = fib(n - 1);    // (N-1)th term
        int slast = fib(n- 2);   // (N-2)th term

        return last + slast;
    }
}