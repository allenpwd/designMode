package pwd.allen.common.service.impl;

import pwd.allen.common.service.IService;

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

    public final String finalMethod(String val) {
        return "this is a final method:" + val;
    }
}
