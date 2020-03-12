package wxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wxx.entity.DealEntity;
import wxx.entity.ResultCause;
import wxx.service.IDealService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/deal")
public class DealController {
    @Resource
    private IDealService dealService;

    @RequestMapping(value = "/addDeal", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause addDealData(DealEntity deal){
        return dealService.addDeal(deal);
    }

    @RequestMapping(value = "/getMyDealList", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<DealEntity> getMyDealList(String id){
        return dealService.listMyDeal(id);
    }
}
