public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 == 0 && len2 == 0){
            throw new RuntimeException("两个数组不能同时为空");
        }

        if (len1 == 0){
            return (len2 % 2 == 0) ? ((double)(nums2[len2 / 2] + nums2[len2 / 2 - 1])) / 2 : (double)nums2[(len2 - 1) / 2];
        }
        if (len2 == 0){
            return (len1 % 2 == 0) ? ((double)(nums1[len1 / 2] + nums1[len1 / 2 - 1])) / 2 : (double)nums1[(len1 - 1) / 2];
        }

        if (len1 > len2){
            return findMedianSortedArrays(nums2, nums1);
        }


        int head = 0, tail = len1;
        double median1 = 0, median2 = 0;
        int m = len2 / 2;
        while (head < tail){
            int i = (head + tail) / 2;
            if (nums1[i] < nums2[m]){

            }else{

            }
        }
        return 1.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,8,9};
        int[] nums2 = {2,4,5,6,8};

        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
