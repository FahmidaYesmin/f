public class KeprakerNumbers {

    public static void main(String[] args) {

        System.out.println(kepraker(1,100));
    }

    public static int kepraker(int n, int t){

        int count = 0;

        for(int i=n; i<=t; i++){

            int number = i;
            long s = i * i;
            int s1 = (int) s;
            String num = Integer.toString(s1);
            int numsize = num.length();
            String nu = Integer.toString(number);
            int nusize = nu.length();

            if(nusize < 2){
                if( i == 1 || i == 9){
                    System.out.println(i + " ");
                }
                else{
                    continue;
                }
            }
            else{
                String a1 = num.substring(0,numsize-nusize);
                String a2 = num.substring(numsize-nusize);

                int x = Integer.parseInt(a1);
                int y = Integer.parseInt(a2);
                int sum = x + y;

                if(sum == i && (sum != 10)){

                    System.out.println(i + " ");

                    count++;
                }
            }
        }
        if (count == 0){

            System.out.println("INVAILD RANGE");
        }
        return 0;
    }
}
