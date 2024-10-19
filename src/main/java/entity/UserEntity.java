package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name = "cashier")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private int age;
    private String company;

    public UserEntity(String fullname, String email, String password, int age, String company) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.company = company;
    }
}
