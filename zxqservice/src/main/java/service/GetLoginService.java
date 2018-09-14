package service;

import com.pojo.JsSysUser;

public interface GetLoginService {

    public JsSysUser getLoginUser(String username,String password);
}
