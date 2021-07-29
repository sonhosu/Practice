package com.practice.hosu.controller;

import com.practice.hosu.dto.RequestJoinDto;
import com.practice.hosu.model.Joina;
import com.practice.hosu.model.Joinrepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final Joinrepository joinrepository;

    @PostMapping("/Join")
    public Joina postjoin(@RequestBody RequestJoinDto requestJoinDto){
        Joina join = new Joina(requestJoinDto);
      return   joinrepository.save(join);
    }
    @GetMapping("/Join")
    public List<Joina> getjoin(){
        return joinrepository.findAll();
    }
}
