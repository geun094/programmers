class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.split(" ");
        
        for(int i = 0; i < array.length; i++) {
			if(i == 0) {
                answer += Integer.parseInt(array[i]);
            } else if(array[i].equals("+")) {
            	answer += Integer.parseInt(array[i+1]);
            } else if(array[i].equals("-")) {
            	answer -= Integer.parseInt(array[i+1]);
            } else {
            	continue;
            }
		}
        
        return answer;
    }
}