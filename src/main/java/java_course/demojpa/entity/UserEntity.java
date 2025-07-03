package java_course.demojpa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_users")

public class UserEntity {

    @Id
    @Column(name = "user_id")
    //a partir da anotação abaixo, o SpringData JPA gera automaticamente um valor de Id pro usuário.
    // Tirando a necessidade de definir ele dentro de UserService.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;

    @Column(name = "username")
    private String name;

    @Column(name = "age")
    private Long age;

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    public UserEntity() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


}
