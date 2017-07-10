
package com.dubbox.test.service.user;

import java.util.concurrent.atomic.AtomicLong;

import com.dubbox.test.api.User;
import com.dubbox.test.api.UserService;

/**
 * @author lishen
 */
public class UserServiceImpl implements UserService {

    private final AtomicLong idGen = new AtomicLong();

    public User getUser(Long id) {
        return new User(id, "username" + id);
    }


    public Long registerUser(User user) {
//        System.out.println("Username is " + user.getName());
        return idGen.incrementAndGet();
    }
}
