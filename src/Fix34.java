import java.util.Arrays;

public class Fix34 {
/*

Return an array that contains exactly the same numbers as the given array, but rearranged so that
every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
and a 3 appears in the array before any 4.
 */

  public static void main(String[] args) {
    int[] nums = {1, 3, 1, 4, 4, 3, 1};
    System.out.printf("\nthe int array %s gives the outcome: " + Arrays.toString(fix34(nums)) + "\n",
        Arrays.toString(nums));
  }


// two loops
 public static int[] fix34(int[] nums) {
   int temp = 0;
   for (int i = 0; i < nums.length; i++) {
     for(int j = 0; j < nums.length; j++) {
       if (nums[i] == 4 && nums[j] == 3) {
         temp = nums[j + 1];
         nums[j + 1] = nums[i];
         nums[i] = temp;
       }
     }
   }
     return nums;
 }

// one loop - reason why the for loop with i can go to nums.length and not stops at nums.length - 1,
// is in the explanation stating that every 3 has a number after it that is not a 3.
//  public static int[] fix34(int[] nums) {
//    int temp = 0;
//
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] == 3) {
//        temp = nums[i + 1];
//        nums[i + 1] = 4;
//
//        for (int j = i + 2; j < nums.length; j++) {
//          if (nums[j] == 4) {
//            nums[j] = temp;
//          }
//        }
//      }
//    }
//    return nums;
//  }


}
