package com.foodsafty.web;

import com.foodsafty.service.FoodSaftyService;
import com.foodsafty.entity.user;
import com.foodsafty.service.impl.foodSaftyServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/foodSafty")
public class foodSaftyController {

    private FoodSaftyService foodSaftyServiceimpl = new foodSaftyServiceimpl();
    private user user;

    @RequestMapping( value = "/list", method = RequestMethod.GET)
    public String list(Model model){
        List<user>  list = foodSaftyServiceimpl.getUserList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/userLogin")
    public String userLogin(){
        return "userLogin";
    }


    @RequestMapping(value = "/login")
    public String login(String userId,String userPassword,HttpSession httpSession){
        user = foodSaftyServiceimpl.getUserById(userId);
        if(userPassword == user.getUserPassword()) {
            httpSession.setAttribute("userId",userId);
            return "list";
        }else{
            return "index";
        }
    }


 /*   @RequestMapping(value = "/login/user")
    public String*/


}
