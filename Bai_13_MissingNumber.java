import java.util.Arrays;

public class Bai_13_MissingNumber {
    public int missingNumber(int[] nums) {
       int[] tem= Arrays.stream(nums).sorted().toArray();
       for (int i=0;i< tem.length;i++){
           if(i==tem.length-1)
               break;
           if(tem[i+1]-tem[i]!=1)
               return tem[i]+1;
       }
       if(tem[0]==0)
           return tem[nums.length-1]+1;
        return tem[0]-1;

    }
}
