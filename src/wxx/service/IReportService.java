package wxx.service;

import wxx.entity.ReportEntity;
import wxx.entity.ResultCause;

import java.util.List;

public interface IReportService {

    public ResultCause addReport(ReportEntity report);

    //unsolved report
    public List<ReportEntity> listUsdReport();

    //solved report
    public List<ReportEntity> listSdReport();

    //my report
    public List<ReportEntity> listMyReport(String id);

    //change flag
    public ResultCause solveReport(Integer id);

    //add dispose
    public ResultCause addSolve(Integer id,String dispose);

}
