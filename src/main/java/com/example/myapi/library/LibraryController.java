package com.example.myapi.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    Library newLibrary = new Library(40, 20);
    @GetMapping("/books")
    public Library getNewLibrary() {
        return newLibrary;
    }
}
