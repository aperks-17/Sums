
public class Sums
{
    public static int sumOfOdds(int[] odds){
        int sum=0;
        for(int i=0; i<odds.length; i++){
            if(Math.abs(odds[i]%2)==1){
                sum=odds[i]+sum;
            }
        }
        return sum;
    }
}
