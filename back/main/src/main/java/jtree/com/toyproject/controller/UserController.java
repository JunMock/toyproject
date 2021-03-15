package jtree.com.toyproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jtree.com.toyproject.model.dto.User;
import jtree.com.toyproject.model.service.user.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.find(id);
    }
    
    @PostMapping("/user")
    public User createUser( @RequestBody User userInfo){
        User user = userService.create(userInfo);
        return user;
    }
    @PutMapping("/user")
    public User updateUser(@RequestBody User userInfo){
        try {
            return userService.update(userInfo);    
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable Integer id){
        try {
            userService.delete(id);    
            return "delete {"+id+"} success";
        } catch (Exception e) {
            e.printStackTrace();
            return "delete {"+id+"} fail";
        }
        
        
    }
}
