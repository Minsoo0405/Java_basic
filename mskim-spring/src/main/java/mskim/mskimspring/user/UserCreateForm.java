package mskim.mskimspring.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 3, max = 20)
    @NotEmpty(message = "사용자 ID는 꼭 입력해주세요.")
     private String username;

    @NotEmpty(message = "비밀번호는 꼭 입력해주세요.")
     private String password1;

    @NotEmpty(message = "비밀번호는 꼭 입력해주세요.")
     private String password2;

    @Email // 이메일 형식으로 '@'가 들어가 있는지 확인해줌
    @NotEmpty(message = "이메일을 꼭 입력해주세요.")
     private String email;


}
