package sudaish;
import java.util.Arrays;
public class SegregateZeroesAndOnes {

	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 0};

       
        segregateArray(arr);

       
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void segregateArray(int[] arr) {
        int left = 0, right = arr.length - 1;

       
        while (left < right) {
          
            while (arr[left] == 0 && left < right) {
                left++;
            }

          
            while (arr[right] == 1 && left < right) {
                right--;
            }

      
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

	}

}
