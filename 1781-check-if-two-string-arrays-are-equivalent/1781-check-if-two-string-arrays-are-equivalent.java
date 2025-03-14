class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wrd1 = new StringBuilder();
        StringBuilder wrd2 = new StringBuilder();
        for (String n : word1) {
            wrd1.append(n);
        }
        for (String n : word2) {
            wrd2.append(n);
        }
        
        return wrd1.toString().contentEquals(wrd2);
    }
}