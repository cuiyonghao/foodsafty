package com.foodsafty.web;

import com.foodsafty.dao.UserDao;
import com.foodsafty.service.FoodSaftyService;
import com.foodsafty.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/foodSafty")
public class foodSaftyController {
    @Autowired
    private FoodSaftyService foodSaftyService;

    private user user1;

    @RequestMapping( value = "/list", method = RequestMethod.GET)
    public String list(Model model){
        List<user>  list = foodSaftyService.getUserList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/userLogin")
    public String userLogin(){
        return "userLogin";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("userId") String userId,@RequestParam("userPassword") String userPassword,HttpSession session){
        System.out.println(userId);
        user1 = foodSaftyService.getUserById(userId);
        System.out.println(user1.getUserPassword());
        if(userPassword.equals(user1.getUserPassword())) {
            session.setAttribute("userId",userId);
            return "list";
        }else{
            return "index";
        }
    }


 /*   @RequestMapping(value = "/login/user")
    public String*/


}
