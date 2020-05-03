### 责任链模式（Chain of Responsibility Pattern）
为请求创建了一个接收者对象的链，如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者。
#### 优点
- 降低耦合度。它将请求的发送者和接收者解耦。 
- 简化了对象。使得对象不需要知道链的结构。
- 增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。
- 增加新的请求处理类很方便。
#### 缺点
- 不能保证请求一定被接收。
- 系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。
- 可能不容易观察运行时的特征，有碍于除错。
#### 应用实例
- js的事件冒泡
- JAVA WEB 中 Apache Tomcat 对 Encoding 的处理
- servlet中的filter：Filter和FilterChain
- dubbo中的filter：Filter封装成 Invoker的匿名类，通过链表这样的数据结构来完成责任链
- mybatis中的plugin：通过动态代理的方式，使用Plugin代理实际的Executor类
- netty