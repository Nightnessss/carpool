package com.fehead.carpool.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Nightnessss 2019/5/22 19:13
 */
@FeignClient(name = "CARPOOL-USER-SERVICE")
public interface UserService {

    @GetMapping("/user/getAllUsers")
    public Object getAllUsers();
}
