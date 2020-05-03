package pwd.allen.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import pwd.allen.common.service.IService;
import pwd.allen.common.service.impl.ServiceImpl;

import java.lang.reflect.Method;

/**
 * CGLIB(Code Generation Library)是Code生成类库
 * 通过动态继承目标对象实现动态代理
 *
 * CGlib调用效率比JDK代理通过反射调用高，它采用了fastClass机制
 * 它的原理简单来说就是:为代理类和被代理类各生成一个类,这个类会为代理类或被代理类的方法分配一个 index(int类型)
 * 这个 index当作ー个入参,Fastclass就可以直接定位要调用的方法并直接进行调用,省去了反射调用
 *
 *
 * @author lenovo
 * @create 2020-01-20 9:54
 **/
public class ProxyFactory implements MethodInterceptor {

    /**
     * 通过CGLIB动态代理获取代理对象的过程
     * @param clazz
     * @return
     */
    public <T> T getInstance(Class<T> clazz) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, System.getProperty("user.home") + "\\Desktop");

        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(clazz);
        // 设置enhancer的回调对象
        enhancer.setCallback(this);
        // 创建代理对象
        return (T) enhancer.create();
    }

    /**
     *
     * @param o cglib生成的代理对象
     * @param method 被代理对象方法
     * @param objects 方法入参
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前:" + method.getName());
        //执行目标对象方法
        Object returnValue = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后：" + method.getName());
        return returnValue;
    }

    public static void main(String[] args) {
        IService service = new ProxyFactory().getInstance(ServiceImpl.class);
        System.out.println(service.sayHello("测试cglib"));
        System.out.println(service.add(12, 23));

        //final修饰的方法无法被cglib代理
        System.out.println(((ServiceImpl) service).finalMethod("final"));
    }
}
