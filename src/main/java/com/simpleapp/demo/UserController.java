package com.simpleapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome, Hello EZOPS!";
    }

    @RequestMapping(path="/api/user/add")
    public @ResponseBody String addNewUser (@RequestParam String name){
        User u = new User();
        u.setName(name);
        userRepository.save(u);
        return "Added User";
    }

    @RequestMapping(path="/api/user/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
