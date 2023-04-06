package mskim.mskimspring.user;

import javax.persistence.*;
// SQL - create table(id int auto_increment primary key, username varchar(50), ..._
// 아래의 Entity 어노테이션을 지정해서 클래스가 DB 인거처럼 수행
// Getter -> DB의 값을 가져오는데 활용
// Setter -> DB의 값을 저장하는데 활용

@Entity
public class SignUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // 동일한 아이디를 중복생성하지 않게 함
    private String username;

    private String password;

    @Column(unique = true)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
