package com.tg.guestbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentsController {

  @GetMapping("/comments")
  public String commentsForm(Model model) {
    model.addAttribute("comments", new Comments());
    return "comments";
  }

  @PostMapping("/comments")
  public String commentsSubmit(@ModelAttribute Comments comments, Model model) {
    model.addAttribute("comments", comments);
    return "result";
  }

}