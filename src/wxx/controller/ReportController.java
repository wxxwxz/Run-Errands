package wxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wxx.entity.ReportEntity;
import wxx.entity.ResultCause;
import wxx.service.IReportService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/report")
public class ReportController {
    @Resource
    private IReportService reportService;

    @RequestMapping(value = "/addReport", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause addReportData(ReportEntity report){
        return reportService.addReport(report);
    }

    @RequestMapping(value = "/getUsdReportList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<ReportEntity> getUsdReportList(){
        return reportService.listUsdReport();
    }

    @RequestMapping(value = "/getSdReportList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<ReportEntity> getSdReportList(){
        return reportService.listSdReport();
    }

    @RequestMapping(value = "/getMyReportList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<ReportEntity> getMyReportList(String id){
        return reportService.listMyReport(id);
    }

    @RequestMapping(value = "/solveReport", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause solveReport(Integer id){
        return reportService.solveReport(id);
    }

    @RequestMapping(value = "/addSolve", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause addSolve(Integer id,String dispose){
        return reportService.addSolve(id,dispose);
    }
}
