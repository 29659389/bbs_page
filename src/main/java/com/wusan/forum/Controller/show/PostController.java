package com.wusan.forum.controller.show;
import com.wusan.forum.entity.show.Post;
import com.wusan.forum.service.show.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller

public class PostController {
    @Autowired
    public PostService postService;
    //查询帖子
   @RequestMapping("findPost")
   public String findPost(Model model,String pid){
       List<Post> list=postService.findPost(pid);
       List<Post> list1=postService.findReply(pid);

       model.addAttribute("list",list);
       model.addAttribute("list1",list1);
       //System.out.println(model.getAttribute("list1"));

       return "show/post";
   }

}
