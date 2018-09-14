package service.Impl;

import com.mapper.JsSysUserMapper;
import com.pojo.JsSysUser;
import com.pojo.JsSysUserExample;
import com.pojo.JsSysUserExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GetLoginService;

import java.util.List;

@Service
public class GetLoginServiceImpl implements GetLoginService {
    @Autowired
    private JsSysUserMapper jsSysUserMapper;
    @Override
    public JsSysUser getLoginUser(String username, String password) {
        JsSysUserExample jsSysUserExample = new JsSysUserExample();
        Criteria criteria = jsSysUserExample.createCriteria();
        criteria.andLoginCodeEqualTo(username);
       // criteria.andPasswordEqualTo(password);

       List<JsSysUser> jsSysUserList =  jsSysUserMapper.selectByExample(jsSysUserExample);
       if(null != jsSysUserList && jsSysUserList.size()>0){
           JsSysUser jsSysUser = new JsSysUser();
           jsSysUser = jsSysUserList.get(0);
           return jsSysUser;
       }

        return null;
    }
}
