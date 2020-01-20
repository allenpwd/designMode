### 代理模式优点:
1. 代理模式能将代理对象与真实被调用目标对象分离。
2. 在一定程度上降低了系统的耦合性,扩展性好。
3. 可以起到保护目标对象的作用
4. 可以增强目标对象的功能


### CGLIB和JDK动态代理对比
1. JDK动态代理实现了被代理对象的接口, CGLIB代理继承了被代理对象。
2. JDK动态代理和CGLb代理都在运行期生成字节码,JDK动态代理直接写 Class字节码,
CGLb代理使用ASM框架写 Class字节码, Cglib代理实现更复杂,生成代理类比JDK动态代理
效率低
3. JDK动态代理调用代理方法是通过反射机制调用的,CGLb代理是通过 Fast Class机制
直接调用方法的,CGLb代理的执行效率更高。