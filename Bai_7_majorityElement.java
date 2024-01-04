import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bai_7_majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i]))
                m.put(nums[i], m.get(nums[i])+1);
            else
                m.put(nums[i], 1);
        }
        int majorityElement = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }

}
