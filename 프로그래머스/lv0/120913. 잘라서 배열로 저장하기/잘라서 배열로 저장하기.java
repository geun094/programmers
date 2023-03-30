import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < my_str.length(); i += n) {
			result.add(my_str.substring(i, Math.min(my_str.length(), (i + n))));
		}
        
        String[] answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
}