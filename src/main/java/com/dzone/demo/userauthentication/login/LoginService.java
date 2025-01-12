package com.dzone.demo.userauthentication.login;

import com.dzone.demo.userauthentication.login.controller.LoginDTO;
import com.dzone.demo.userauthentication.login.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@NamedInterface("LoginService")
@Service
public class LoginService {


    LoginRepository loginRepository;

    LoginService(@Autowired LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void saveLogin( LoginDTO loginDTO1) {
        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername(loginDTO1.getUsername());
        loginEntity.setPassword(loginDTO1.getPassword());
        loginRepository.save(loginEntity);

    }

    public boolean login(LoginDTO loginDTO) {

        Optional<LoginEntity> loginEntity = loginRepository.findById(loginDTO.getUsername());
        if (loginEntity.isPresent()) {
            LoginEntity loginEntity1 = loginEntity.get();
            return loginEntity1.getPassword().equals(loginDTO.getPassword());
        }

        return false;
    }
}
