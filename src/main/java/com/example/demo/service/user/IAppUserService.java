package com.example.demo.service.user;

import com.example.demo.model.AppUser;
import com.example.demo.service.GeneralService;

public interface IAppUserService extends GeneralService<AppUser> {
    AppUser getUserByName(String name);
}
