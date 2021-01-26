import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] handle(int[] nums, Integer target){
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]), i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] res = handle(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
