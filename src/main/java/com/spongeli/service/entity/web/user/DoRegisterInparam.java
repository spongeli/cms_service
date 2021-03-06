package com.spongeli.service.entity.web.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class DoRegisterInparam {


    @NotNull(message = "用户名不能为空")
    private String username;
    @NotNull(message = "验证码不能为空")
    private String verify;

    @NotNull(message = "密码不能为空")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$", message = "密码格式有误")
    private String password;

    @NotNull(message = "重复密码不能为空")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$", message = "重复密码格式有误")
    private String password2;

    private Byte role = 0; //角色

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }
}
