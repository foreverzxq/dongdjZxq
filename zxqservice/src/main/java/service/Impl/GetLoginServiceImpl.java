package service.Impl;

import com.mapper.JsSysUserMapper;
import com.mapper.LyUserMapper;
import com.pojo.JsSysUser;
import com.pojo.LyUserExample;
import com.pojo.LyUserExample.Criteria;
import com.pojo.LyUser;
import com.pojo.LyUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GetLoginService;

import java.util.List;

@Service
public class GetLoginServiceImpl implements GetLoginService {
    @Autowired
    private LyUserMapper lyUserMapper;
    @Override
    public LyUser getLoginUser(String username, String password) {
        LyUserExample lyUserExample = new LyUserExample();
        Criteria criteria = lyUserExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andUserPwdEqualTo(password);

       List<LyUser> lyUserList =  lyUserMapper.selectByExample(lyUserExample);
       if(null != lyUserList && lyUserList.size()>0){
           LyUser lyUser = lyUserList.get(0);
           return lyUser;
       }

        return null;
    }
}
