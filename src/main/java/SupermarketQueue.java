import java.util.Arrays;

public class SupermarketQueue {

    public static int queueTime(int[] customes, int numberTill){

        int waitTime=0;

        if(customes.length==0){
            return 0;
        }

        int res1=customes[0];

        if(numberTill>customes.length){
            for (int i = 0; i < customes.length; i++) {
                if (res1<customes[i]){
                    res1=customes[i];
                }
            }
            return res1;
        }




        if(numberTill==1  || numberTill==0 && customes.length!=0){
            for (int i = 0; i <customes.length; i++) {
                waitTime+=customes[i];
            }
            return waitTime;
        }

        if (customes.length==1){
            if(numberTill==1){
                return customes[0];
            }else{
                return customes[0];
            }

        }



        int result=0;

        int[] count= Arrays.copyOfRange(customes,0,numberTill);
        int[] sumCount= Arrays.copyOfRange(customes,0,numberTill);
        int[] count2= Arrays.copyOfRange(customes,numberTill,customes.length);
        int res=count[0];


        for (int j = 0; j < count2.length; j++) {
            int tmp=sumCount[0];
            int aux=0;
            for (int i = 0; i < sumCount.length; i++) {
                if(tmp>sumCount[i]){
                    tmp=sumCount[i];
                    aux=i;
                }
            }

            count[aux]=count2[j];
                /*for (int i = 0; i < count.length; i++) {

                }*/
            sumCount[aux]+=count2[j];
        }

        for (int i = 0; i < sumCount.length; i++) {
            if (result<sumCount[i]){
                result=sumCount[i];
            }
        }


        return result;

    }
}
