class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxLen=Math.min(s.length(),1);
        Set<Character> seen = new HashSet<>();
        while( end <s.length()){
            char c=s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(c);
            int windowsize = end-start+1;
            maxLen =Math.max(maxLen,windowsize);
            end +=1;
        }
        return maxLen;
    }
}