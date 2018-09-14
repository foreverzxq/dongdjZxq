package service;

import com.common.LayUiResult;
import com.pojo.LyUser;

public interface GetLoginService {

    public LyUser getLoginUser(String username, String password);
}
