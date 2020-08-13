package technicalblog.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.postService;

import java.util.ArrayList;

@Controller
public class PostController {


    @Autowired
    private postService PostService;

    @RequestMapping("posts")
    public String getUserPosts(Model model){

        ArrayList<Post> posts = PostService.getOnePost();
        model.addAttribute("posts",posts);
        return "posts";
    }

}
