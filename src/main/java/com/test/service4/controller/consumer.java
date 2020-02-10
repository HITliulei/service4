package com.test.service4.controller;

import com.test.service4.entity.User;
import com.test.service4.utils.MSendRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Lei
 * @Date 2020/2/9 17:08
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer")
public class consumer {

    @Autowired
    private MSendRequest mSendRequest;

    @GetMapping("/get1")
    public String getRequestVersion(){
        return mSendRequest.sendRequest("http://gateway/service3/provider/getServiceInfo","1.0.0", String.class, RequestMethod.GET);
    }
    @GetMapping("/get2/{id}")
    public User get(@PathVariable("id")int id){
        return mSendRequest.sendRequest("http://gateway/service3/provider/get/"+id, User.class, RequestMethod.GET);
    }

    @GetMapping("/getServce5")
    public String get(){
        return mSendRequest.sendRequest("http://gateway/service5/provider/getServiceInfo", String.class, RequestMethod.GET);
    }
}
