import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sameNumbers();
    }
    public static void sameNumbers(){
        int[] arr={1,2,2,3,4,5,2,3,5,9,7,4,3,2,9,8,6};
        Arrays.sort(arr);

        List<Integer> secArr= new ArrayList<>();

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]==arr[i-1]){
                secArr.add(arr[i-1]);
            }
        }
        System.out.println(secArr);
    }
}