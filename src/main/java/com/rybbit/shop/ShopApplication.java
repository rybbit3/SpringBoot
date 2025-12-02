package com.rybbit.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
        class Friend {
            String name = "kim";
            int age = 20;
            Friend(String 이름){ // ()안에 파라미터 추가
                this.name = 이름;
            }
        }

        var friend1 = new Friend("kim");
        var friend2 = new Friend("park");

        System.out.println(friend1.name);
        System.out.println(friend2.name);

        var a = new Item();
        System.out.println(a);
	}

}
