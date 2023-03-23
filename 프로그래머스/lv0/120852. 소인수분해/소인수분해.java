import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}