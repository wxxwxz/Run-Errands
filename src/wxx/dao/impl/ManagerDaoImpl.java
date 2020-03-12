package wxx.dao.impl;

import org.springframework.stereotype.Repository;
import wxx.dao.DaoHelper;
import wxx.dao.IManagerDao;
import wxx.entity.ManagerEntity;

import java.util.List;

@Repository
public class ManagerDaoImpl extends DaoHelper implements IManagerDao {
    @Override
    public void saveManager(String sql, ManagerEntity manager) {
        this.insertByBean(sql,manager);
    }

    @Override
    public List<ManagerEntity> listManagers(String sql, Object[] keys) {
        return this.query(sql,keys, ManagerEntity.class);
    }
}
