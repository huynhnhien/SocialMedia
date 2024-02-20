import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai_9_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
    }
}
