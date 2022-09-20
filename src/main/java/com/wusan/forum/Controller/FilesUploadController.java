package com.wusan.forum.controller;

import com.wusan.forum.entity.UserInfo;
import com.wusan.forum.mapper.UserMapper;
import com.wusan.forum.service.Impl.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FilesUploadController {
    @Autowired
    public UserserviceImpl userservice;
    //图片上传测试
    @ResponseBody
    @RequestMapping("upload")
    public Map upload(MultipartFile file, HttpServletRequest request){
        HttpSession session=request.getSession();
        UserInfo userInfo= (UserInfo) session.getAttribute("userInfo");
        String uid= userInfo.getUid().toString();
        System.out.println(uid);
        String prefix="";
        String dateStr="";

        //保存上传
        OutputStream out = null;
        InputStream fileInput=null;
        try{
            if(file!=null){
                //获取上传文件名
                String originalName = file.getOriginalFilename();
                //获取上传文件的图片后缀
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                //通过当前时间等信息生成一个不会重复的文件名
                Date date = new Date();
                String uuid = UUID.randomUUID()+"";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                dateStr = simpleDateFormat.format(date);
                //设置需要存放图片的本地路径
                String filepath = "C:/Users/29659/Desktop/forum/src/main/resources/static/img/" + dateStr+"/"+uuid+"." + prefix;


                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
                Map<String,Object> map2=new HashMap<>();
                Map<String,Object> map=new HashMap<>();
                map.put("code",0);
                map.put("msg","");
                map.put("data",map2);
                String uicon= dateStr+"/"+uuid+"." + prefix;
                System.out.println(uicon);
                map2.put("src",uicon);

                Integer result=userservice.upUicon(uid,uicon);
                if (result==1){
                    return map;
                }

            }

        }catch (Exception e){
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(fileInput!=null){
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        map.put("msg","");
        return map;

    }
}
