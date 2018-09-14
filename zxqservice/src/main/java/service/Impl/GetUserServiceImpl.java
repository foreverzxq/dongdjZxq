package service.Impl;

import com.common.DataUser;
import com.common.LayUiResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.JsSysUserMapper;
import com.mapper.LyUserMapper;
import com.pojo.*;
import com.pojo.LyUserExample.Criteria;
import com.pojo.LyUserExample;
import com.untils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GetUserService;

import java.util.ArrayList;
import java.util.List;
@Service
public class GetUserServiceImpl implements GetUserService {

    @Autowired
    private LyUserMapper lyUserMapper;

    @Autowired
    private JsSysUserMapper jsSysUserMapper;

    @Override
    public DataUser getUserListByjson(int page ,int limit,String key) {

        LyUserExample lyUserExample = new LyUserExample();
        Criteria criteria = lyUserExample.createCriteria();
        if(null != key&&!"".equals(key)){
             criteria.andUserNameLike("%"+key+"%");
        }
        PageHelper.startPage(page, limit);
        List<LyUser> users = lyUserMapper.selectByExample(lyUserExample);
        DataUser dataUser = new DataUser();
        if(null!=users && users.size()>0) {
            PageInfo<LyUser> pageInfo = new PageInfo<LyUser>(users);
            dataUser.setCode("0");
            dataUser.setMsg("");
            dataUser.setCount(String.valueOf(pageInfo.getTotal()));
            dataUser.setData(users);
            return dataUser;
        }else {
            dataUser.setCode("0");
            dataUser.setMsg("");
            dataUser.setCount("0");
            dataUser.setData("");
            return dataUser;
        }

    }

    @Override
    public LayUiResult saveLyUser(LyUser lyUser) {
        String data = "";
        if("".equals(lyUser.getUsersId())){
            lyUser.setUsersId(String.valueOf(IDUtils.genItemId()));
            lyUserMapper.insert(lyUser);
            data="insert";
            return LayUiResult.ok(data);
        }else {
            lyUserMapper.updateByPrimaryKey(lyUser);
            data = "update";
            return LayUiResult.ok(data);
        }
    }

    @Override
    public LayUiResult deleteLyUser(String Id) {
          int succ = lyUserMapper.deleteByPrimaryKey(Id);
          if(succ>0){
              return LayUiResult.ok(succ);
          }else {
              return LayUiResult.ok();
          }
    }

    @Override
    public LayUiResult changeStatus(String id,String status) {
         LyUser lyUser = lyUserMapper.selectByPrimaryKey(id);
         lyUser.setUserStatus(status);
        int succ = 0;
         if(null !=lyUser) {
             succ = lyUserMapper.updateByPrimaryKey(lyUser);
            if(succ >0){
              return LayUiResult.ok(succ);
            }else {
                return  LayUiResult.ok();
            }
         }
         return null;
    }

    @Override
    public LayUiResult getCountUser() {
        LyUserExample lyUserExample = new LyUserExample();
       List<LyUser> lyUserList =  lyUserMapper.selectByExample(lyUserExample);
       if(null !=lyUserList && lyUserList.size()>0){
           return  LayUiResult.ok(lyUserList.size());
       }
        return LayUiResult.ok(0);
    }

    @Override
    public LayUiResult checkUserName(String username) {
          /*1 用户名已存在
            2 不能为空
            3 该用户名可用
          * */
        LyUserExample lyUserExample = new LyUserExample();
        Criteria criteria = lyUserExample.createCriteria();
        if(null == username|| "".equals(username)){
            return LayUiResult.ok(2);
        }
        criteria.andUserNameEqualTo(username);
        List<LyUser> lyUserList = lyUserMapper.selectByExample(lyUserExample);
        if(null != lyUserList && lyUserList.size()>0){
            return LayUiResult.ok(1);
        }
        return LayUiResult.ok(3);
    }

    @Override
    public LayUiResult checkEmail(String email) {
        LyUserExample lyUserExample = new LyUserExample();
        Criteria criteria = lyUserExample.createCriteria();
        if(null == email){
            return LayUiResult.ok(2);
        }
        if(!email.contains("@")){
            return LayUiResult.ok(4);
        }
        criteria.andUserEmailEqualTo(email);
        List<LyUser> lyUserList = lyUserMapper.selectByExample(lyUserExample);
        if(null != lyUserList && lyUserList.size()>0){
            return LayUiResult.ok(1);
        }
        return LayUiResult.ok(3);
    }

}
