package wxx.service;

import wxx.entity.ManagerEntity;
import wxx.entity.ResultCause;

public interface IManagerService {
    /**
     * 登录验证
     * @param name
     * @param password
     * @return
     */
    public ResultCause checkManager(String name, String password);

    /**
     * 用户注册
     * @param manager
     * @return
     */
    public ResultCause registerManager(ManagerEntity manager);


}
