package com.example.swaggerApiDocs;

import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("Pet")
public class controller {
    private List<Pet> petList = new ArrayList<>();


    @PostConstruct
    public void init() {
        petList.add(new Pet(1, "Test Pet", new Date()));
    }

    @PostMapping
    public ResponseEntity<Pet> save(@RequestBody Pet pet) {
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    public ResponseEntity<List<Pet>> getAll() {
        return ResponseEntity.ok(petList);
    }
}
