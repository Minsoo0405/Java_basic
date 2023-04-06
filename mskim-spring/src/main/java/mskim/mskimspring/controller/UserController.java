package mskim.mskimspring.controller;

import lombok.RequiredArgsConstructor;
import mskim.mskimspring.service.UserService;
import mskim.mskimspring.user.UserCreateForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor // 의존성 주입 3가지 방법중에서 가장 현업에서 많이 쓰는 방법
public class UserController {

    private final UserService userService;

    @GetMapping("/signup") // /user/signup --> RequestMapping으로 인해 경로 변경해줌
    public String signup(UserCreateForm userCreateForm) {
        return "signup_form";
    }

    @PostMapping("/signup")
    public String sign(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "signup_form";
        }

        if (!userCreateForm.getPassword1().equals(userCreateForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordInCorrect",
                    "입력하신 2개의 비밀번호가 일치하지 않습니다.");
        }

        userService.create(userCreateForm.getUsername(), userCreateForm.getPassword1(),
                userCreateForm.getEmail());

        return "redirect:/";

    }
}
