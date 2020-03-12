package wxx.service.impl;

import org.springframework.stereotype.Service;
import wxx.dao.IReportDao;
import wxx.entity.ReportEntity;
import wxx.entity.ResultCause;
import wxx.service.IReportService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReportServiceImpl implements IReportService {
    @Resource
    private IReportDao reportDao;

    @Override
    public ResultCause addReport(ReportEntity report) {
        String sql = "insert into report (reporter,course) values (:reporter,:course)";
        reportDao.saveReport(sql,report);
        return new ResultCause(ResultCause.SUCCESS_CODE,"添加数据成功");
    }

    @Override
    public List<ReportEntity> listUsdReport() {
        String sql = "select * from report where isSolved = 0";
        return reportDao.listReport(sql,new Object[]{});
    }

    @Override
    public List<ReportEntity> listSdReport() {
        String sql = "select * from report where isSolved = 1";
        return reportDao.listReport(sql,new Object[]{});
    }

    @Override
    public List<ReportEntity> listMyReport(String id) {
        String sql = "select * from report where reporter = ?";
        return reportDao.listReport(sql,new Object[]{id});
    }

    @Override
    public ResultCause solveReport(Integer id) {
        ResultCause result = new ResultCause();
        String sql = "update report set isSolved = 1 where reportID = ?";
        reportDao.updateReportData(sql,new Object[]{getTargetReport(id).getReportID()});
        result.setCode(ResultCause.SUCCESS_CODE);
        result.setDesc("pass");
        return result;
    }

    @Override
    public ResultCause addSolve(Integer id,String dispose) {
        ResultCause result = new ResultCause();
        String sql = "update report set dispose = ? where reportID = ?";
        reportDao.updateReportData(sql,new Object[]{dispose,getTargetReport(id).getReportID()});
        result.setCode(ResultCause.SUCCESS_CODE);
        result.setDesc("pass");
        return result;
    }

    private ReportEntity getTargetReport(Integer id){
        String sql = "select * from report where reportID = ?";
        List<ReportEntity> reportEntities = reportDao.listReport(sql,new Object[]{id});
        return (reportEntities!=null&&reportEntities.size()>0)?reportEntities.get(0):null;
    }
}
