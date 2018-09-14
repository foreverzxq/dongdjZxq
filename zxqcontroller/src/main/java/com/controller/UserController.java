package com.controller;

import com.common.DataUser;
import com.common.LayUiResult;
import com.github.pagehelper.Page;
import com.pojo.JsSysUser;
import com.pojo.LyUser;
import net.sf.jsqlparser.expression.StringValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GetUserService;

import javax.xml.crypto.Data;
import java.util.List;

@Controller
@RequestMapping("/page/user/")
public class UserController {

    @Autowired
    private GetUserService getUserService;

    @RequestMapping("userList")
//    @ResponseBody
    public String getUser(Model model){
//       List<JsSysUser> jsSysUserList = getUserService.getUserList();
//       model.addAttribute("jsSysUserList",jsSysUserList);
       return "/page/user/userList";
    }


    @RequestMapping("list")
    @ResponseBody
    private DataUser getList(@RequestParam("limit") int limit,@RequestParam("page") int page,@RequestParam(value = "key", required = false) String key){
     //   System.out.println("limit====="+limit);
       // System.out.println("page========"+page);
      //  System.out.println("key"+key);

            DataUser dataUser = getUserService.getUserListByjson(page,limit,key);
            return  dataUser;
    }

    @RequestMapping("userAdd")
    private String userAdd(){
        return "/page/user/userAdd";
    }


    @RequestMapping(value = "saveUser",method= RequestMethod.POST)
    @ResponseBody
    private LayUiResult saveLayUser(LyUser lyUser) throws Exception {
      LayUiResult layUiResult  = getUserService.saveLyUser(lyUser);
        if (layUiResult.getStatus() != 200) {
            throw new Exception();
        }
      return  layUiResult;
    }


    @RequestMapping(value = "deleteUser",method = RequestMethod.GET)
    @ResponseBody
    private LayUiResult deleteLayUser(@RequestParam("ids") String ids) throws Exception {
        String idarr[] = ids.split(",");
        LayUiResult layUiResult  = new LayUiResult();
        for(int i=0;i<idarr.length;i++){
             layUiResult = getUserService.deleteLyUser(idarr[i]);
        }
        if (layUiResult.getStatus() != 200) {
            throw new Exception();
        }
        return  layUiResult;
    }

    @RequestMapping(value = "changeStatus",method = RequestMethod.GET)
    @ResponseBody
    private LayUiResult changeUserStatus(@RequestParam("ids") String ids,@RequestParam("flag") String flag) throws Exception {
        LayUiResult layUiResult  = getUserService.changeStatus(ids,flag);
        if (layUiResult.getStatus() != 200) {
            throw new Exception();
        }
         return layUiResult;
    }

    @RequestMapping("userCnt")
    @ResponseBody
    private LayUiResult getUserCnt() throws Exception {
        LayUiResult layUiResult = getUserService.getCountUser();
        if(layUiResult.getStatus() !=200){
            throw  new Exception();
        }
        return layUiResult;
    }

}
