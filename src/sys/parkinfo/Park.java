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
    private final int totalParkPlace;
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

    public boolean addCar(Car car){
        boolean reValue=true;
        if(cars.size() >= totalParkPlace)
        {
            reValue=false;
            System.out.println("停车场（" + parkNumber + "）已没有空位，车辆（"+car.toString()+"）停放失败！");
        }else{
            cars.add(car);
        }
        return reValue;
    }

    public boolean takeCar(Car car){
        boolean reValue = false;
        for(Car targetCar:cars)
        {
            if (car.toString().equals(targetCar.toString())){
                cars.remove(targetCar);
                reValue = true;
                break;
            }
        }
        return reValue;
    }

    public List<Car> getAllCars(){
        return cars;
    }
}
