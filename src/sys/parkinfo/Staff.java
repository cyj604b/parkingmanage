package sys.parkinfo;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class Staff {

    private String name;//姓名
    private String number;//编号
    private ArrayList<Park> parks=new ArrayList<Park>();//停放车辆信息

    /**
     * 构造函数
     * @param name 姓名
     * @param number 编号
     */
    public Staff(String name,String number)
    {
        this.name=name;
        this.number=number;
    }
    /**
     * 添加一个停车场
     * @param park
     */
    public void addPark(Park park)
    {
        parks.add(park);
    }
    /**
     * 删除一个停车场
     * @param parkNo
     */
    public boolean removePark(String parkNo)
    {
        boolean reValue=false;
        Park park=null;
        for(int i=0;i<parks.size();i++)
        {
            park=parks.get(i);
            if(park.getParkNumber().equals(parkNo))
            {
                parks.remove(i);
                reValue=true;
                break;
            }
        }
        return reValue;
    }
    /**
     * 得到停车场个数
     * @return
     */
    public int getParksNo()
    {
        return parks.size();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public ArrayList<Park> getParks() {
        return parks;
    }
    public void setParks(ArrayList<Park> parks) {
        this.parks = parks;
    }

}
