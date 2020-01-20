package pwd.allen.proxy.jdk;

import pwd.allen.service.IService;
import pwd.allen.service.impl.ServiceImpl;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理只能针对实现了接口的类生成代理
 * @author 门那粒沙
 * @create 2019-07-06 18:38
 **/
public class ProxyFactory implements InvocationHandler {
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    /**
     * 给目标对象生成代理对象
     * newProxyInstance方法是在Proxy类中是静态方法,且接收的三个参数依次为:
     *  ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
     *  Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
     *  InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
     */
    public Object getProxyInstance(){
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                interfaces,
                this
        );
    }

    /**
     * 事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
     *
     * @param proxy 代理对象
     * @param method 代理的目标对象的方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前:" + method.getName());
        //执行目标对象方法
        Object returnValue = method.invoke(target, args);
        System.out.println("方法执行后：" + method.getName());
        return returnValue;
    }

    public static void main(String[] args) {
        // 目标对象
        IService target = new ServiceImpl();
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IService proxy = (IService) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        System.out.println(proxy.sayHello("allen"));
        System.out.println(proxy.add(12, 345));

        //输出代理对象类的字节码到磁盘中，可以用反编译工具看到：
        // 代理类继承Proxy实现了IService，重载了父类的方法并在其中调用InvocationHandler.invoke方法
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IService.class});
            FileOutputStream os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
