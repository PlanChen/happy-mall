package cn.happymall.common.lock;

/**
 * Created by chenlili on 18/7/18.
 */
public interface DistributedLockCallback<T> {
    /**
     * 调用者必须在此方法中实现需要加分布式锁的业务逻辑
     *
     * @return
     */
    public T process();

    /**
     * 得到分布式锁名称
     *
     * @return
     */
    public String getLockName();
}
