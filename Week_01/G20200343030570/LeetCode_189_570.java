class Solution {

    private void reverse(int[] nums,int start,int end){
        int i,j;
        int temp;
        for(i=start,j=end;i<j;++i,--j){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

    }
    public void rotate(int[] nums, int k) {
        //�����������������
        while(k>=nums.length && k>=0){
            k=k-nums.length;
        }
        //�����㷨
        if(k!=0){
            //��������Ԫ������
            this.reverse(nums,0,nums.length-1);
            //ǰk��Ԫ������
            this.reverse(nums,0,k-1);
            //����Ԫ������
            this.reverse(nums,k,nums.length-1);
        }

    }

}