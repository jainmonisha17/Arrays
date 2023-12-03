// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES College, Bengaluru
// CGPA: 6.37
// linkdn: https://www.linkedin.com/in/jainmonisha17/
// github: https://github.com/jainmonisha17

class MaximumConsecutiveOnes {
    public static void main(String args[]) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        int ans = findConsecutiveOnes(arr);

        System.out.println("The maximum consecutive ones are: " + ans);
    }

    public static int findConsecutiveOnes(int arr[]) {
        int count = 0;
        int maximum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
                maximum = Math.max(count, maximum);
            } else {
                count = 0;
            }
        }
        
        return maximum;
    }
}

// TC -> O(N) coz only single pass
// SC -> O(1) coz no extra space used here.

