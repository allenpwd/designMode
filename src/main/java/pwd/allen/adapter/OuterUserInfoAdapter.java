package pwd.allen.adapter;

/**
 * 定义适配器，将OuterUserInfo适配到IUserInfo接口形式
 *
 * 适配的方式
 *  方式一：直接继承被适配类
 *  方式二：维护一个被适配类的对象
 *
 * @author 门那粒沙
 * @create 2020-05-04 9:45
 **/
public class OuterUserInfoAdapter extends OuterUserInfo implements IUserInfo {

    private String info;

    @Override
    public String getInfo() {
        if (info == null) {
            info = super.getInfo();
        }
        return info;
    }

    @Override
    public String getName() {
        return getInfo().split("\\|")[0];
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(getInfo().split("\\|")[1]);
    }
}
