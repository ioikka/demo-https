package io.ikka.demo.https.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping(value = "/time")
    public ResponseEntity time() {
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }
}
