class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder st = new StringBuilder();
        for (String s : words) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += weights[Math.abs(c - 97)];
            }
            int nc = 96 + Math.abs(122 - (96 + (sum % 26)));
            st.append((char) nc);
        }
        return st.toString();
    }
}