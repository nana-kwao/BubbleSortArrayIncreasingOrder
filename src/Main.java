import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //get the array
        int[] ages = {23, 54, 65, 32, 34, 28, 46, 94, 12};

        //ages.length
        int n = ages.length;

        //rearrange to ascending
        for (int x = 0; x < n -1; x++){
            for (int y = 0; y < n -1 -x; y++) {
                if (ages[y] > ages[y +1]){
                    int z = ages[y];
                    ages[y] = ages[y + 1];
                    ages[y+1] = z;
                }
            }
        }
        //print sorted array
        System.out.println(Arrays.toString(ages));
    }
}