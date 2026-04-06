class Solution {
    public boolean isAnagram(String s, String t) {
      
        char[] char_s = s.toCharArray();
        Arrays.sort(char_s);
        String sorted_s = new String(char_s);
        System.out.println(sorted_s);
        char[] char_t = t.toCharArray();
        Arrays.sort(char_t);
        String sorted_t = new String(char_t);
        System.out.println(sorted_t);
        
        if (sorted_s.equals(sorted_t)){
            return true;
        }
        else {
            return false ;
        }
    }
}
