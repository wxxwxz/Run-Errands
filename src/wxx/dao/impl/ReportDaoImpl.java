package wxx.dao.impl;

import org.springframework.stereotype.Repository;
import wxx.dao.DaoHelper;
import wxx.dao.IReportDao;
import wxx.entity.ReportEntity;

import java.util.List;

@Repository
public class ReportDaoImpl extends DaoHelper implements IReportDao {
    @Override
    public void saveReport(String sql, ReportEntity report){
        this.insertByBean(sql,report);
    }

    @Override
    public List<ReportEntity> listReport(String sql, Object[] keys){
        return this.query(sql,keys,ReportEntity.class);
    }

    @Override
    public void updateReportData(String sql, Object[] keys) {
        this.update(sql,keys);
    }

}
