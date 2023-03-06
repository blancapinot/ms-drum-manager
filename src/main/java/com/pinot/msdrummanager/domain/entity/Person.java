package com.pinot.msdrummanager.domain.entity;

import com.pinot.msdrummanager.domain.constant.UserStatusEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    @Email
    private String email;
    private String fullName;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatusEnum status;
}
