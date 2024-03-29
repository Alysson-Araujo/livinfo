package com.livinfo.backendlivinfo.domain.user;


import com.livinfo.backendlivinfo.listeners.UserEntityListener;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@EntityListeners(UserEntityListener.class)
public class User {
    public User(UserDTO dto){
        this.completeName = dto.completeName();
        this.email = dto.email();
        this.username = dto.username();
        this.dateOfBirth = dto.dateOfBirth();
        this.password = dto.password();

        if (dto.userType() == null) {
            this.userType = UserType.COMMON;
        } else {
            this.userType = dto.userType();
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;

    private String completeName;

    @Column(unique = true)
    private String email;

    private String password;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    private UserType userType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;
}