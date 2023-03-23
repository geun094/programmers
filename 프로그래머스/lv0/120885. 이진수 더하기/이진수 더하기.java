class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        // 이진수를 10진수로 변환
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        
        // 두 10진수를 더함
        int sum = a + b;
        
        // 합을 다시 이진수로 변환
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}