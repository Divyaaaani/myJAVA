 // always take A.length -1 for last elem and not a.len coz it will give arr out of bound err.
 class Rotation {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Handle cases where k > n
        k = k % n;

        // Step 2: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 3: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 4: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse array from index start to end
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);   // 👈 NO object needed

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

