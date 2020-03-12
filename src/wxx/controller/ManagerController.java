package wxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wxx.entity.ManagerEntity;
import wxx.entity.ResultCause;
import wxx.service.IManagerService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/manager")
public class ManagerController extends SuperAction{
    @Resource
    private IManagerService managerService;
//  manager/login?name=161700001&password=161700001
    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause login(String name, String password){
        return managerService.checkManager(name,password);
    }

    @RequestMapping(value = "/register", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause register(ManagerEntity manager){
        return managerService.registerManager(manager);
    }
}
