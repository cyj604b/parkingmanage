package sys.parkinfo;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-19
 * Time: 下午5:17
 * To change this template use File | Settings | File Templates.
 */
public class Director{

    private String name;//姓名
    private ArrayList<Manager> managers=new ArrayList<Manager>();//所管理经理信息
    /**
     * 构造函数
     * @param name
     */
    public Director(String name)
    {
        this.name=name;
    }
    /**
     * 添加多个经理
     * @param managers
     */
    public void addManager(ArrayList<Manager> managers)
    {
        this.managers=managers;
    }
    /**
     * 添加一个经理
     * @param manager
     */
    public void addManager(Manager manager)
    {
        managers.add(manager);
    }
    /**
     * 得到下属经理人员信息
     * @return
     */
    public ArrayList<Manager> getManagers()
    {
        return managers;
    }
    /**
     * 得到经理个数
     * @return
     */
    public int getManagersCount()
    {
        int count=managers.size();
        return count;
    }
    /**
     * 根据经理姓名删除经理
     * @param managerName
     */
    public void deleteManager(String managerName)
    {

    }
}
