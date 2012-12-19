package sys.parkinfo;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午12:35
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    private String carNumber;//车牌号

    public Car(String carNumber)
    {
        this.carNumber = carNumber;
    }
    public String getCarNumber()
    {
        return carNumber;
    }

}