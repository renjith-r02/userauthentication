package com.dzone.demo.userauthentication.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/

public class LoginEntity {

    @Id
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
