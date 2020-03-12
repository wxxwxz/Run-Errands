package wxx.service;

import wxx.entity.ResultCause;
import wxx.entity.UserEntity;

public interface IUserService {
    /**
     * 登录验证
     * @param name
     * @param password
     * @return
     */
    public ResultCause checkUser(String name, String password);

    /**
     * 用户注册
     * @param user
     * @return
     */
    public ResultCause registerUser(UserEntity user);

    /**
     * 通过用户名获取用户信息
     * @param name
     * @return
     */
    public UserEntity getUserInfo(String name);
}
