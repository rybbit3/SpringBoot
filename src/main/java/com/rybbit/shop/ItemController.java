package com.rybbit.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);

        var a = new Item();
        System.out.println(a.getTitle());

        return "list.html";
    }

    @GetMapping("/write")
    String write() {
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(String title, String price) {

        // 1. 빈 Item 객체 생성 (과제 힌트: new Item())
        Item item = new Item();

        // 2. 받아온 데이터를 객체에 집어넣기
        item.title = item.getTitle();
        item.price = item.getPrice();

        // 3. Repository를 통해 DB에 저장 (과제 힌트: save())
        itemRepository.save(item);

        // 4. 저장이 끝나면 메인 페이지 등으로 이동
        return "redirect:/list";
    }
}
