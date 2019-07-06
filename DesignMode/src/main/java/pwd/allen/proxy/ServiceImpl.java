package pwd.allen.proxy;

/**
 * @author 门那粒沙
 * @create 2019-07-06 18:43
 **/
public class ServiceImpl implements IService {
    @Override
    public String sayHello(String name) {
        return "hello!" + name;
    }

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
