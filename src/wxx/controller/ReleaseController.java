package wxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wxx.entity.ReleaseEntity;
import wxx.entity.ResultCause;
import wxx.service.IReleaseService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/release")
public class ReleaseController extends SuperAction{
    @Resource
    private IReleaseService releaseService;

    @RequestMapping(value = "/addRelease", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause addReleaseData(ReleaseEntity release){
        return releaseService.addRelease(release);
    }

    @RequestMapping(value = "/getReleaseList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<ReleaseEntity> getReleaseList(){
        return releaseService.listRelease();
    }

    @RequestMapping(value = "/getUcReleaseList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<ReleaseEntity> getUcReleaseList(){
        return releaseService.listUcRelease();
    }

    @RequestMapping(value = "/getMyReleaseList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<ReleaseEntity> getMyReleaseList(String id){
        return releaseService.listMyRelease(id);
    }

    @RequestMapping(value = "/checkRelease", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause updateRelease(Integer id){
        return releaseService.checkRelease(id);
    }

    @RequestMapping(value = "/beReceived", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause beReceived(Integer id){
        return releaseService.beReceived(id);
    }

}
