package com.pinot.msdrummanager.controller;

import com.pinot.msdrummanager.domain.entity.PadlockEntity;
import com.pinot.msdrummanager.service.PadlockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/padlock")
public class PadlockController {

    private final PadlockService padlockService;

    @GetMapping
    public ResponseEntity<List<PadlockEntity>> getAll() {
        return ResponseEntity.ok().body(padlockService.getAll());
    }

    @PostMapping
    public ResponseEntity<PadlockEntity> create(@RequestBody PadlockEntity padlock) {
        var entity = padlockService.create(padlock);

        return new ResponseEntity<PadlockEntity>(entity, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> update() {
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping
    public ResponseEntity<?> delete() {
        return ResponseEntity.ok().body(null);
    }

}
