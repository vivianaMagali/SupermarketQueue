import java.util.Arrays;

public class SupermarketQueue {

    public static int queueTime (int[] customers, int numberTill) {


        if (customers.length == 0) return 0;

        int waitTime;


        waitTime = customers[0];
        if (numberTill > customers.length) {
            for (int i = 0; i < customers.length; i++) {
                if (waitTime < customers[i]) {
                    waitTime = customers[i];
                }
            }
            return waitTime;
        }


        waitTime=0;
        if(numberTill==1  || numberTill==0){
            for (int i = 0; i <customers.length; i++) {
                waitTime+=customers[i];
            }
            return waitTime;
        }

        if (customers.length==1) return customers[0];




        int[] sumCount= Arrays.copyOfRange(customers,0,numberTill);
        int[] count2= Arrays.copyOfRange(customers,numberTill,customers.length);


        for (int j = 0; j < count2.length; j++) {
            int tmp=sumCount[0];
            int aux=0;
            for (int i = 0; i < sumCount.length; i++) {
                if(tmp>sumCount[i]){
                    tmp=sumCount[i];
                    aux=i;
                }
            }

            sumCount[aux]+=count2[j];
        }

        waitTime=0;
        for (int i = 0; i < sumCount.length; i++) {
            if (waitTime<sumCount[i]){
                waitTime=sumCount[i];
            }
        }
        return waitTime;
    }
}
