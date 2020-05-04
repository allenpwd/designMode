### 策略模式
属于行为型模式。包装不同行为的算法，解耦算法调用类和算法封装类。解决 if...else 所带来的复杂和难以维护的问题。

#### 优点
- 算法可以自由切换。
- 避免使用多重条件判断。
- 扩展性良好。

#### 缺点
- 策略类会增多。
- 所有策略类都需要对外暴露。

#### 应用实例
- jdk中Arrays.parallelSort方法将Comparator接口作为传入参数，排序策略由该参数实现
- spring的Resource接口，以及不同的资源加载策略file system、class path、servlet等
- spring中的实例化策略，InstantiationStrategy接口

https://www.runoob.com/design-pattern/strategy-pattern.html