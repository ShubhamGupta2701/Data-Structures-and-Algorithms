import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacters {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            String word = words[i];
            for(char ch:word.toCharArray()){
                if(ch == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
