package com.rybbit.shop;

import lombok.Getter;
import lombok.Setter;

// Java private 실습

@Getter
@Setter
public class homework {
    private String name;
    private Integer age;

    public void 한살더하기(){
        this.age += 1;
    }
    public void 나이설정(Integer age){
        if (age > 0 && age < 100){
            this.age = age;
        }

    }
}
