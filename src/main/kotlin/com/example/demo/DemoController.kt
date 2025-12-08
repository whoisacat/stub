package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController {

    @GetMapping("/")
    fun get(model: Model): String {
        model.addAttribute("title", "Эфемерная Палитра Сознаний")
        model.addAttribute("bodyText", "Люминесцентные хроники мерцающих вселенных переплетаются в неуловимом континууме внутреннего отклика.")
        model.addAttribute("bodyText2", "Иметь мнение - это привилегия. Для формирования мнения нужен ресурс. Поймали птичку голосистую и ну сжимать ее рукой.")
        model.addAttribute("footerText", "Кристаллизованный шелест парадоксальных грёз.")
        return "demo-view"
    }
}