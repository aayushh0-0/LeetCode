class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
    ArrayList<Integer> ans = new ArrayList<>();
    int k=0;
    for(int i=0;i<words.length;i++)
    {
        if(words[i].contains(String.valueOf(x)))
        {
            ans.add(i);
        }
    }
    return ans;  
    }
}