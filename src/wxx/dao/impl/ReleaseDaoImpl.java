package wxx.dao.impl;

import org.springframework.stereotype.Repository;
import wxx.dao.DaoHelper;
import wxx.dao.IReleaseDao;
import wxx.entity.ReleaseEntity;

import java.util.List;

@Repository
public class ReleaseDaoImpl extends DaoHelper implements IReleaseDao {
    @Override
    public void saveRelease(String sql, ReleaseEntity release){
        this.insertByBean(sql,release);
    }

    @Override
    public List<ReleaseEntity> listRelease(String sql, Object[] keys){
        return this.query(sql,keys,ReleaseEntity.class);
    }

    @Override
    public void updateReleaseData(String sql, Object[] keys) {
        this.update(sql,keys);
    }

}
