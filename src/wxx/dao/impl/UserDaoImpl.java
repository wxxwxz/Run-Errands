package wxx.dao.impl;

import org.springframework.stereotype.Repository;
import wxx.dao.DaoHelper;
import wxx.dao.IUserDao;
import wxx.entity.UserEntity;

import java.util.List;

@Repository
public class UserDaoImpl extends DaoHelper implements IUserDao {
    @Override
    public void saveUser(String sql, UserEntity user) {
        this.insertByBean(sql,user);
    }

    @Override
    public List<UserEntity> listUsers(String sql, Object[] keys) {
        return this.query(sql,keys,UserEntity.class);
    }

}
