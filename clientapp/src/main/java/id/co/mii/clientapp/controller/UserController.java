package id.co.mii.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import id.co.mii.clientapp.model.User;
import id.co.mii.clientapp.service.UserService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("user", userService.getAll());
        model.addAttribute("isActive", "user");
        return "user/index";
    }

    @GetMapping("/create")
    public String createForm(User user, Model model) {
        return "user/create";
    }

    @PostMapping
    public String create(User user) {
        userService.create(user);
        return "redirect:/user";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "user/update";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, User user) {
        userService.update(id, user);
        return "redirect:/user";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/user";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "user/detail";
    }

}
