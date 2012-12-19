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

        final String thirdCarNumber = "J1111";
        final String thirdOwnerId = "G1221F31";
        Car thirdCar = new Car(thirdCarNumber, thirdOwnerId);
        assertEquals(thirdCarNumber, thirdCar.getCarNumber());
        assertEquals(thirdOwnerId, thirdCar.getOwnerId());

        final String fourthCarNumber = "J2222";
        final String fourthOwnerId = "GS1221F32";
        Car fourthCar = new Car(fourthCarNumber, fourthOwnerId);
        assertEquals(fourthCarNumber, fourthCar.getCarNumber());
        assertEquals(fourthOwnerId, fourthCar.getOwnerId());
    }
}
