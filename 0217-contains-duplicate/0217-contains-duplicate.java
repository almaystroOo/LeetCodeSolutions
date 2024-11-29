class Solution {
    public boolean containsDuplicate(int[] nums) {
    //check if array contains duplicate element ??s
        // solution:
        //1- loop throw elements
        //2- using array.contains
        //-- bad cuz o(n*2)
        //check if array contains duplicate element ??
        // 2nd solution:
        //using HashSet to check contained elements or add them
         HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        
        } return false;
    }
}