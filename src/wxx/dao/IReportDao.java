package wxx.dao;

import wxx.entity.ReportEntity;

import java.util.List;

public interface IReportDao {
    public void saveReport(String sql, ReportEntity report);

    public List<ReportEntity> listReport(String sql, Object[] keys);

    public void updateReportData(String sql, Object[] keys);
}
