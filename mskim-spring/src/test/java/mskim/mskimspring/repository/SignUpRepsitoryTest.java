package mskim.mskimspring.repository;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import mskim.mskimspring.user.SignUp;
import mskim.mskimspring.user.SignUpRepository;
import org.apache.el.parser.AstSetData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class SignUpRepsitoryTest {

    @Autowired
    private SignUpRepository signUpRepository;

    @Test
    void testJpa() {
        SignUp user1 = new SignUp();
        user1.setUsername("user1");
        user1.setPassword("user1user1");
        user1.setEmail("user1@user1.com");
        this.signUpRepository.save(user1);

        SignUp user2 = new SignUp();
        user2.setUsername("user2");
        user2.setPassword("user2user2");
        user2.setEmail("user2@user2.com");
        this.signUpRepository.save(user2);
    }

    @Test
    void testJpa2() {
        List<SignUp> all = this.signUpRepository.findAll();
        Assertions.assertEquals(2, all.size());

        SignUp user = all.get(0); // id, username, password, email
        Assertions.assertEquals("user1", user.getUsername());
        // Assertions.assertEquals("user1", "user2222"); 테스트 코드
    }

    @Test
    void testJpa3() {
        Optional<SignUp> up = this.signUpRepository.findById(1L);
        if (up.isPresent()) {
            SignUp user = up.get();
            Assertions.assertEquals("user1", user.getUsername());
        }
    }

    @Test
    void testJpa4() {
        SignUp user = this.signUpRepository.findByUsername("user2");
        Assertions.assertEquals("user2@user2.com", user.getEmail());
    }

    @Test
    void testJpa5() {
        SignUp user = this.signUpRepository.findByUsernameAndEmail("user1", "user1@user1.com");
        Assertions.assertEquals(1, user.getId());
    }

    @Test
    void testJpa6() {
        List<SignUp> userList = this.signUpRepository.findByEmailLike("%com");
        SignUp user = userList.get(1);
        Assertions.assertEquals("user2@user2.com", user.getEmail());

    }

    // 수정
    @Test
    void testJpa7() {
        Optional<SignUp> user = this.signUpRepository.findById(2L);
        Assertions.assertTrue(user.isPresent());
        SignUp u = user.get();
        u.setEmail("lol@lol.com");
        this.signUpRepository.save(u);
    }

    // 삭제
    @Test
    void TestJpa8() {
        Assertions.assertEquals(2, this.signUpRepository.count());
        Optional<SignUp> user = this.signUpRepository.findById(2L);
        Assertions.assertTrue(user.isPresent());
        SignUp u = user.get();
        this.signUpRepository.delete(u); // findById(2L)에 해당하는 user2 데이터를 의미함
        Assertions.assertEquals(1, this.signUpRepository.count());

    }
}
