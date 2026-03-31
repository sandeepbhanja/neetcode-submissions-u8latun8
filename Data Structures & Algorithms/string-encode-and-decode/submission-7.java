class Solution {

    List<Integer> wordIndex = new ArrayList<>();

    public String encode(List<String> strs) {
        String finalString = "";
        int prevIndex = 0;
        for(String s: strs){
            finalString += s;
            prevIndex += s.length();
            wordIndex.add(prevIndex);
        }
        return finalString;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int prevIndex = 0;
        for(int i=0;i<wordIndex.size();i++){
            String tempString = str.substring(prevIndex,wordIndex.get(i));
            ans.add(tempString);
            prevIndex = wordIndex.get(i);
        }
        return ans;
    }
}
