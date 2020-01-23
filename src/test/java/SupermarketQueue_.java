import org.junit.Test;

import static org.junit.Assert.*;

public class SupermarketQueue_ {

    @Test
    public void if_there_are_not_customers_return_0(){
        assertEquals(SupermarketQueue.queueTime(new int[0], 1), 0);
    }

    @Test
    public void test(){
        int[] vector=new int[]{5,3,4};
        assertEquals(SupermarketQueue.queueTime(vector, 1), 12);
    }


}
