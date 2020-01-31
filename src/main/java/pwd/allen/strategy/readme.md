包装不同行为的算法，解耦算法调用类和算法封装类

### 模式的应用例子
- jdk中Arrays.parallelSort方法将Comparator接口作为传入参数，排序策略由该参数实现
- spring的Resource接口，以及不同的资源加载策略file system、class path、servlet等
- spring中的实例化策略，InstantiationStrategy接口
