package sys.parkinfo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午12:41
 * To change this template use File | Settings | File Templates.
 */
public class CarTest {
    @Test
    public void testCreate(){
        final String firstCarNumber = "J8888";
        Car firstCar = new Car(firstCarNumber);
        assertEquals(firstCarNumber, firstCar.getCarNumber());

        final String secondCarNumber = "J6666";
        Car secondCar = new Car(secondCarNumber);
        assertEquals(secondCarNumber, secondCar.getCarNumber());
        assertEquals(firstCarNumber, firstCar.getCarNumber());


    }
}
