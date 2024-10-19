package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name = "admin" )
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private int age;
    private String company;

    public Admin(String fullname, String email, String password, int age, String company) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.company = company;
    }
}
