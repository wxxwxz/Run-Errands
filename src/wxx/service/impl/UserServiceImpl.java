package wxx.service.impl;

import org.springframework.stereotype.Service;
import wxx.dao.IUserDao;
import wxx.entity.ResultCause;
import wxx.entity.UserEntity;
import wxx.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public ResultCause checkUser(String id, String password) {
        UserEntity user = getTargetUser(id);
        if (user == null){
            //未查到该用户，即用户不存在
            return new ResultCause(ResultCause.FAIL_CODE,"用户名或密码错误");
        }else if (user.getPassword().equals(password)){
            //登录验证成功
            return new ResultCause(ResultCause.SUCCESS_CODE,"登录成功");
        }
        //密码错误
        return new ResultCause(ResultCause.FAIL_CODE,"用户名或密码错误");
    }

    @Override
    public ResultCause registerUser(UserEntity user) {
        if (getTargetUser(user.getId()) != null){
            return new ResultCause(ResultCause.FAIL_CODE,"用户名已存在");
        }else {
            String sql = "insert into user (userID,userName,password) values (:name,:name,:password)";
            userDao.saveUser(sql,user);
        }
        return new ResultCause(ResultCause.SUCCESS_CODE,"注册成功");
    }
    @Override
    public UserEntity getUserInfo(String name) {
        String sql = "select userName,userID from user where userName = ?";
        return userDao.listUsers(sql,new Object[]{name}).get(0);
    }

    private UserEntity getTargetUser(String id){
        String sql = "select * from user where userID = ?";
        List<UserEntity> userEntities = userDao.listUsers(sql,new Object[]{id});
        return (userEntities!=null&&userEntities.size()>0)?userEntities.get(0):null;
    }
}
