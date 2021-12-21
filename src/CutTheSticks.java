import java.util.Arrays;

public class CutTheSticks {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,3,3,2,1};
        Arrays.sort(array);
        int n = array[0];
        int m = array.length -1;
        int count = 0, tem =0;


        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        while(tem != 1) {
            for (int i = 0; i < array.length; i++) {

                array[i] = array[i] - n;
                if (array[i] > 0) {
                    count++;
                }
                if (i == array.length - 1) {
                    if(count > 0) {
                        tem = count;
                        count = 0;
                    }
                }
            }
            System.out.println(tem);
        }
    }
}
