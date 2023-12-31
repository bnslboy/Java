import java.util.Scanner;

public class array2d {

    public static void printArr2D(int arr[][]) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean searchkey(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.println("Found key at ( " + i + " , " + j + " )");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static int largest_in_2d(int arr[][]){
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(lar < arr[i][j]){
                    lar = arr[i][j];
                }
            }
        }
        return lar;
    }

    public static void fill_arr2d_by_user(int arr[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void printArr2D_in_spiral(int arr[][]) {
        int sr = 0;
        int er = arr.length - 1;
        int sc = 0;
        int ec = arr[0].length - 1;
    
        while (er >= sr && ec >= sc) {
            
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }
            sr++;
            for (int i = sr; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            ec--;
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    System.out.print(arr[er][i] + " ");
                }
                er--;
            }
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    System.out.print(arr[i][sc] + " ");
                }
                sc++;
            }
        }
    }

    public static int[][] fill_arr2d_by_numbers(int n) {
        int arr[][] = new int[n][n];
        int b = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = b;
                b++;
            }
        }
        return arr;

        
    }

    public static int[][] transpose(int arr[][]){
        int tarr[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tarr[j][i] = arr[i][j];
            }
        }
        return tarr;

    }

    public static int diagonal_sum(int arr[][]){
        int sum = 0;
        if(arr.length != arr[0].length){
            return Integer.MIN_VALUE;
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if(i==j || i+j == arr.length-1){
        //             sum = sum + arr[i][j];
        //         }
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if(i != arr.length - 1 - i){
                sum += arr[i][arr.length - 1 -i];

            }
        }
        return sum;
    }

    public static boolean staircase_search(int arr[][],int key){
        //time complexcity O(n+m)
        int i = 0;
        int j = arr[0].length - 1;
        while (i <arr.length && j >= 0) {
            if(arr[i][j] == key){
                System.out.println(key + " at the value ( " + i +" , " + j  + " )");
                return true;
            }
            else if (arr[i][j]>key) {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }


    public static void main(String[] args) {
        int arr[][] = fill_arr2d_by_numbers(5);
        // int arr[][] = {{1,2,3},{4,5,6}};
        // int tarr[][] = transpose(arr);
        printArr2D(arr);
        staircase_search(arr, 17);
    }
}
