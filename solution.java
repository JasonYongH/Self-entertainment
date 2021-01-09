class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, tail = 0;
        int max_len = 0;
        while(tail < s.length())
        {
            for(int i = tail - 1; i >= start; --i)
            {
                if (s.charAt(i) == s.charAt(tail))
                {
                    max_len = (tail - start) > max_len?(tail - start): max_len;
                    start = i + 1;
                    continue;
                }
            }
            ++tail;
        }
        return max_len;
    }
    public static void main(String[] args)
    {
        Solution tes = new Solution();
        System.out.println(tes.lengthOfLongestSubstring("abcabcbb"));
    }
}