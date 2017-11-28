package com.prikhodko.dbproject.domain;

import com.prikhodko.dbproject.domain.base.AbstractEntity;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends AbstractEntity {
    private String name;
    private String lastName;
    private String middleName;
}