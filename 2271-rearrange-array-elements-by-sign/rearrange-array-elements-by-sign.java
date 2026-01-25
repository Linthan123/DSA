class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int p = 0, q= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                pos[p++] = nums[i];
            }
            else{
                neg[q++] = nums[i];
            }
        }

        List<Integer> res = new ArrayList<>();
        res.add(pos[0]);
        int i = 0, j = 1;
        while(i < neg.length || j < pos.length){
            if(i < neg.length && (res.size() % 2 != 0)){
                res.add(neg[i]);
                i++;
            }
            if(j < pos.length && (res.size() % 2 == 0)){
                res.add(pos[j]);
                j++;
            }
        }
        int[] arr = new int[nums.length];
        int index = 0;
        for(int n : res){
            arr[index++] = n;
        }
        return arr;
    }
}