package wxx.dao;

import wxx.entity.ManagerEntity;

import java.util.List;

public interface IManagerDao {
    /**
     * 新增用户
     * @param sql
     * @param manager
     */
    public void saveManager(String sql, ManagerEntity manager);

    /**
     * 根据条件获取用户列表
     * @param sql
     * @param keys
     * @return
     */
    public List<ManagerEntity> listManagers(String sql, Object[] keys);
}
