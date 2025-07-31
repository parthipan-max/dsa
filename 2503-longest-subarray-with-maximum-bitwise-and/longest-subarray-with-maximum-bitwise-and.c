int longestSubarray(int* nums, int numsSize) {
  int n=nums[0];
  for(int i=0;i<numsSize;i++){
    if(nums[i]>n){
        n=nums[i];
    }
  }
  int count=0;
  int res=0;
  for(int i=0;i<numsSize;i++){
    if(nums[i]==n){
        count++;
        if(count>res){
            res=count;
        }
    }
    else{
        count=0;
    }
   
  }
   return res;  

}
