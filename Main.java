public class Main {

    public static void main(String[] args) {
        
    }

    public static int shellSort(int [] a){
        int n = a.length;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if(a[j] > a[j + step]){
                        int x = a[j];
                        a[j] = a[j + step];
                        a[j + step] = x;
                    }
                }
            }
        }
    }
}
