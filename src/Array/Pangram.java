package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Pangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>() ;
        for(int i=0; i<sentence.length(); i++){
            Character ch = sentence.charAt(i);
            set.add(ch);
        }
        if(set.size() == 26){
            return true;
        }
        return false;
    }
}