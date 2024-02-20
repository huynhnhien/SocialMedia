import java.util.HashSet;
import java.util.Set;

public class Bai_11_SingleNumber {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int num :nums)
           res^=num;
        return res;
    }

}
