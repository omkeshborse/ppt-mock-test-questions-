
public class problemTwo{

 static int firstUniqChar(String s) {
        int[] frequency = new int[26];
        
        // Update frequency count of each character
        for (char c : s.toCharArray()) {
            frequency[ c - 'a']++;
        }
        
        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // No unique character found
        return -1;
    }
        public static void main(String[] args) {
            
          String  s = "leetcode" ;
          String  s1 = "loveleetcode" ;
          int result = firstUniqChar(s) ;
          int result1 = firstUniqChar(s1) ;
          System.out.print(result);
          System.out.println();
          System.out.print(result1);
        }
    
}
