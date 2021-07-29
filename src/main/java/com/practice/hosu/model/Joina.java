package com.practice.hosu.model;

import com.practice.hosu.dto.RequestJoinDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Joina {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String userid;

    @Column(nullable = true)
    private String password;

    @Column(nullable = true)
    private String email;

    public Joina(RequestJoinDto requestJoinDto){

        this.userid=requestJoinDto.getUserid();
        this.name=requestJoinDto.getName();
        this.email=requestJoinDto.getEmail();
        this.password=requestJoinDto.getPassword();
    }

}
