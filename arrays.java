/**
 * array
 */
public class arrays {

    public static void subarray (int number[]){
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j <= number.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    System.out.print(number[j2]);
                }
                System.out.println();
            }System.out.println();
        }
    }
    
    public static void maxsum(int number[]) {
        int maxsum = 0;
        int a = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j <= number.length; j++) {
                for (int j2 = i; j2 < j; j2++) {
                    a = a + number[j2];
                }
                if (a >maxsum){
                    maxsum = a;
                    a = 0;
                }else{
                    a = 0;
                }
                
            }
        }System.out.println(maxsum);
    }

    public static int missingNumber(int array[], int n) {
        int sum = n*(n+1)/2;
        
        for (int a : array){
            sum = sum - a;
        }
        return sum;
    }

    public static void main(String[] args) {
        // int number[] = {2,4,6,8,10};
        int number[] = {1,-2,6,-1,3};
        // subarray(number);
        maxsum(number);
    }

}