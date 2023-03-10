package me.mexx.noskiapp.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
@Tag(name = "API для работы с файлом")
@RequiredArgsConstructor
public class FilesController {

}
