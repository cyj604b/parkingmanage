package sys.parkinfo;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午12:35
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    private final String carNumber;//车牌号
    private final String ownerId;
    Car(String carNumber)
    {
        this.carNumber = carNumber;
        this.ownerId = " ";
    }
    Car(String carNumber, String ownerId){
        this.carNumber = carNumber;
        this.ownerId = ownerId;
    }
    public String getCarNumber()
    {
        return carNumber;
    }

    public String getOwnerId() {
        return ownerId;
    }
}