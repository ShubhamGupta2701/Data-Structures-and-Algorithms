package String;
public class PalindromicSubstrings {
    public boolean isPalindrome(String s){
        int i=0;
        int n = s.length()-1;
        while(i<=n){
            if(s.charAt(i)!=s.charAt(n)) return false;
            i++;
            n--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int ans=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str = s.substring(i,j+1);
                if(isPalindrome(str)) ans++; 
            }
        }
        return ans;
    }
}
