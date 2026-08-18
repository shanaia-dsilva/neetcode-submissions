class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS=new HashMap<>(), mapT=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++) {
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            mapS.put(cs, mapS.getOrDefault(cs,0)+1);
            mapT.put(ct, mapT.getOrDefault(ct,0)+1);
        }

        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(!mapS.get(c).equals(mapT.get(c))) return false;
        }
        return true;
    }
}
