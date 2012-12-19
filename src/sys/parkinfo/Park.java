package sys.parkinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午1:08
 * To change this template use File | Settings | File Templates.
 */
public class Park {
    private String parkNumber;
    private int totalParkPlace;
    private List<Car> cars=new ArrayList<Car>();

    public Park(String parkNumber, int totalParkPlace)
    {
        this.parkNumber = parkNumber;
        this.totalParkPlace = totalParkPlace;
    }

    public String getParkNumber() {
        return parkNumber;
    }

    public int getTotalParkPlace() {
        return totalParkPlace;
    }

    public int getNumberOfCars() {
        return cars.size();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void takeCar(Car car){
        cars.remove(car);
    }

    public List<Car> getAllCars(){
        return cars;
    }
}
