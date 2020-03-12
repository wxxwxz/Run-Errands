package wxx.dao;

import wxx.entity.DealEntity;

import java.util.List;

public interface IDealDao {
    public void saveDeal(String sql, DealEntity deal);

    public List<DealEntity> listDeal(String sql, Object[] keys);

    public void updateDealData(String sql, Object[] keys);
}
