package pwd.allen.singleton;

/**
 * @author 门那粒沙
 * @create 2020-03-09 20:56
 **/
public class Pwd {

    private static volatile Pwd pwd;

    private Pwd() {
        System.out.println("这里只会初始化一次...");
    }

    public static Pwd getInstance() {
        if (pwd == null) {
            synchronized (Pwd.class) {
                //DCL(double check lock)双端检锁机制；不推荐直接把synchronized加在方法上，同步整个方法导致并发性下降
                if (pwd == null) {
                    //这里初始化赋值过程有可能会指令重排，有可能pwd赋值了但是Pwd还没有初始化，这样拿到的实例会有问题；故加上volatile禁用指令重排
                    pwd = new Pwd();
                }
            }
        }
        return pwd;
    }
}
