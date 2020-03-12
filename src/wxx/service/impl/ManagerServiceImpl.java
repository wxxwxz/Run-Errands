package wxx.service.impl;

import org.springframework.stereotype.Service;
import wxx.dao.IManagerDao;
import wxx.entity.ResultCause;
import wxx.entity.ManagerEntity;
import wxx.service.IManagerService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl implements IManagerService {
    @Resource
    private IManagerDao managerDao;

    @Override
    public ResultCause checkManager(String name, String password) {
        ManagerEntity manager = getTargetManager(name);
        if (manager == null){
            //未查到该用户，即用户不存在
            return new ResultCause(ResultCause.FAIL_CODE,"用户名或密码错误");
        }else if (manager.getPassword().equals(password)){
            //登录验证成功
            return new ResultCause(ResultCause.SUCCESS_CODE,"登录成功");
        }
        //密码错误
        return new ResultCause(ResultCause.FAIL_CODE,"用户名或密码错误");
    }

    @Override
    public ResultCause registerManager(ManagerEntity manager) {
        if (getTargetManager(manager.getId()) != null){
            return new ResultCause(ResultCause.FAIL_CODE,"用户名已存在");
        }else {
            String sql = "insert into manager (managerID,managerName,password) values (:name,:name,:password)";
            managerDao.saveManager(sql,manager);
        }
        return new ResultCause(ResultCause.SUCCESS_CODE,"注册成功");
    }

    private ManagerEntity getTargetManager(String name){
        String sql = "select * from manager where managerName = ?";
        List<ManagerEntity> managerEntities = managerDao.listManagers(sql,new Object[]{name});
        return (managerEntities!=null&&managerEntities.size()>0)?managerEntities.get(0):null;
    }
}
