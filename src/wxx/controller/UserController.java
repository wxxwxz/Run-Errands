package wxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wxx.entity.ResultCause;
import wxx.entity.UserEntity;
import wxx.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController extends SuperAction{
    @Resource
    private IUserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause login(String name, String password) throws IOException {
        ResultCause result = userService.checkUser(name,password);
        HttpSession session = request.getSession();
        session.removeAttribute(session.getId());
        if (result.getCode().equals(ResultCause.SUCCESS_CODE)){
            session.setAttribute(session.getId(),name);
        }
        return result;
    }

    @RequestMapping(value = "/register", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause register(UserEntity user){
        return userService.registerUser(user);
    }

}
