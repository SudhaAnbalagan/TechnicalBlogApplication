package technicalblog.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import technicalblog.model.Post;
import technicalblog.service.postService;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {


    @Autowired
    private postService PostService;

    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post>posts=PostService.getAllPost();

        model.addAttribute("posts",posts);

    return "index";
    }
}
