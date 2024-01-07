package Array;
import java.util.ArrayList;
import java.util.List;

class Candies {
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
        if(candies[i] > max){
        max = candies[i];
        }
        }
        for(int i=0; i<candies.length; i++){
        int val = candies[i] + extraCandies;
        if( val >= max){
        ans.add(true);
        }else{
        ans.add(false);
        }
        }
        return ans;
        }
        }
