/*
 * Copyright 2006-2014 handu.com.
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

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.test.api.HelloService;
import com.dubbox.test.api.UserService;
import com.dubbox.test.api.user.facade.AnotherUserRestService;
import com.dubbox.test.api.user.facade.UserRestService;

/**
 * @author Jinkai.Ma
 */
@Component
public class DemoJavaConfigAction {

    @Reference
    private HelloService helloService;

    @Reference
    private AnotherUserRestService anotherUserRestService;
    	
    @Reference
    private UserService userService;
   /* @Reference
    private UserRestService userRestService;*/
    @PostConstruct
    public void start() throws Exception {

        System.err.println("SUCESS: got bid response id: " + helloService.hello("消费者调用"));
        System.err.println("SUCESS_anotherUserRestService" + anotherUserRestService.getUser(1L));
        System.err.println("SUCESS_userService:" + userService.getUser(1L));
       /* System.err.println("SUCESS_userRestService:" + userRestService.getUser(1L));*/
    }
}
