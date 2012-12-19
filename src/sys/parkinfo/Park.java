package sys.parkinfo;

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
}
