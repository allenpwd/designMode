package pwd.allen.adapter;

/**
 * @author 门那粒沙
 * @create 2020-05-04 9:49
 **/
public class Main {

    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfoAdapter();
        System.out.println(userInfo.getName());
        System.out.println(userInfo.getAge());
    }
}
