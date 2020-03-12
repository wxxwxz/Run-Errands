package wxx.dao.impl;

import org.springframework.stereotype.Repository;
import wxx.dao.DaoHelper;
import wxx.dao.IDealDao;
import wxx.entity.DealEntity;

import java.util.List;

@Repository
public class DealDaoImpl extends DaoHelper implements IDealDao {
    @Override
    public void saveDeal(String sql, DealEntity deal){
        this.insertByBean(sql,deal);
    }

    @Override
    public List<DealEntity> listDeal(String sql, Object[] keys){
        return this.query(sql,keys,DealEntity.class);
    }

    @Override
    public void updateDealData(String sql, Object[] keys) {
        this.update(sql,keys);
    }
}
