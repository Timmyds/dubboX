/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.demo.consumer;

import javax.annotation.Resource;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.test.api.HelloService;
import com.dubbox.test.api.UserService;
import com.dubbox.test.api.user.facade.AnotherUserRestService;
import com.dubbox.test.api.user.facade.UserRestService;

public class DemoAction {

    private HelloService helloService;


    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
    private UserService userService;

    private AnotherUserRestService anotherUserRestService; 
    
    private UserRestService userRestService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setAnotherUserRestService(AnotherUserRestService anotherUserRestService) {
        this.anotherUserRestService = anotherUserRestService;
    }
    


	public void setUserRestService(UserRestService userRestService) {
		this.userRestService = userRestService;
	}

	public void start() throws Exception {
       

//        long start = System.currentTimeMillis();

//        for (int i = 0; i < 10000; i ++) {
//        System.out.println(bidService.bid(request).getId());
        System.out.println("SUCCESS: -------------------- " + helloService.hello("connsumer-调用"));
     /*   User user = new User(1L, "larrypage");
        System.out.println("SUCCESS: registered user with id " + anotherUserRestService.registerUser(user).getId());
*/
        /*RpcContext.getContext().setAttachment("clientName", "demo");
        RpcContext.getContext().setAttachment("clientImpl", "dubbox");*/
        System.out.println("SUCCESS_anotherUserRestService:" + anotherUserRestService.getUser(1L));
        System.out.println("SUCESS_userService: " + userService.getUser(2L).toString());
        System.out.println("SUCESS_userRestService: " + userRestService.getUser(3L).toString());
    }

}