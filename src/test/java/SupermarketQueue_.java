import org.junit.Test;

import static org.junit.Assert.*;

public class SupermarketQueue_ {

    @Test
    public void if_there_are_not_customers_return_0(){
        int [] vector=new int[0];
        assertEquals(SupermarketQueue.queueTime(vector, 1), 0);
    }

    @Test
    public void only_till_return_sum_of_waitTime_customers(){
        int[] vector=new int[]{5,3,4};
        assertEquals(SupermarketQueue.queueTime(vector, 1), 12);
    }

    @Test
    public void number_till_is_greater_than_number_customers(){
        int[] vector=new int[]{5,3,4};
        assertEquals(SupermarketQueue.queueTime(vector, 100), 5);
    }

    @Test
    public void only_customer(){
        int[] vector=new int[]{5};
        assertEquals(SupermarketQueue.queueTime(vector, 100), 5);
    }

    @Test
    public void number_till_is_0(){
        int[] vector=new int[]{5,10,2,4,5};
        assertEquals(SupermarketQueue.queueTime(vector, 0), 26);
    }
    


}
