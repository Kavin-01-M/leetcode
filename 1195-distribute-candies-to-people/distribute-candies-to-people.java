class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int[] arr = new int[num_people];

        int i = 0;
        int gives = 1;

        while (candies > 0) {

            if (candies >= gives) {
                arr[i] += gives;
                candies -= gives;
            } else {
                arr[i] += candies;
                candies = 0;
            }

            gives++;

            i = (i + 1) % num_people;
        }

        return arr;
    }
}
            
        
    
