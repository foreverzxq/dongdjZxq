package service;

import com.common.DataUser;
import com.common.LayUiResult;
import com.pojo.JsSysUser;
import com.pojo.LyUser;

import java.util.List;

public interface GetUserService {

    public DataUser getUserListByjson(int page ,int limit,String key);

    public LayUiResult saveLyUser(LyUser lyUser);

    public LayUiResult deleteLyUser(String Id);

    public LayUiResult changeStatus(String id,String status);

    public LayUiResult getCountUser();
}
