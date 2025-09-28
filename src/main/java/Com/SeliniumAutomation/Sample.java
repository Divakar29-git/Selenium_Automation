package Com.SeliniumAutomation;

import org.junit.Assert;
import org.junit.Test;

public class Sample {

    @Test
    public void testcode(){
        Assert.assertEquals("Thilak" , "Thilak");


    }
    @Test
    public void testcode1(){
        Assert.assertNotEquals("Divakar", "divakar");
    }

}
