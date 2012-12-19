package sys.parkinfo;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午1:09
 * To change this template use File | Settings | File Templates.
 */
public class ParkTest {
    private Park park;
    @Before
    public void setUp(){
        park = new Park("001", 20);
    }
    @Test
    public void testCreate(){
        assertEquals("001", park.getParkNumber());
        assertEquals(20, park.getTotalParkPlace());
        assertEquals(0, park.getNumberOfCars());
    }
    @Test
    public void testAddCars(){
        Car car1 = new Car("J8888", "GS1221F31");
        assertTrue(park.addCar(car1));
        assertEquals(1, park.getNumberOfCars());
        List<Car> allCars = park.getAllCars();
        assertEquals(1, allCars.size());
        assertEquals(car1, allCars.get(0));

        Car car2 = new Car("J6666", "GS1221F32");
        assertTrue(park.addCar(car2));
        assertEquals(2, park.getNumberOfCars());
        assertEquals(2, allCars.size());
        assertEquals(car1, allCars.get(0));
        assertEquals(car2, allCars.get(1));

        for(int i = 0; i < 18; i++){
            Car car = new Car("J6666", " ");
            park.addCar(car);
        }
        assertEquals(20, allCars.size());

        Car car3 = new Car("J5555", "GS1221F33");
        assertFalse(park.addCar(car3));
        assertEquals(20, allCars.size());
    }
    @Test
    public void testTakeCars(){
        Car car = new Car("J4444", "GS1221F34");
        assertFalse(park.takeCar(car));
        Car car1 = new Car("J4444", "GS1221F31");
        assertFalse(park.takeCar(car1));
        Car car2 = new Car("J7777", "GS1221F34");
        assertFalse(park.takeCar(car2));
        park.addCar(car);
        assertEquals(1, park.getNumberOfCars());
        assertFalse(park.takeCar(car1));
        assertFalse(park.takeCar(car2));
        assertTrue(park.takeCar(car));
        assertEquals(0, park.getNumberOfCars());
    }
}
