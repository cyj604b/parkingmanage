package sys.parkinfo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午1:09
 * To change this template use File | Settings | File Templates.
 */
public class ParkTest {
    @Test
    public void testCreate(){
        Park park = new Park("001", 20);
        assertEquals("001", park.getParkNumber());
        assertEquals(20, park.getTotalParkPlace());
    }
}
