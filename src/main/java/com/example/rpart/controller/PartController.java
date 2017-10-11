package com.example.rpart.controller;

import com.example.rpart.model.Part;
import com.example.rpart.repository.PartRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by markpuddick on 10/10/17.
 */
@RestController
public class PartController {

    private final PartRepository partRepository;

    public PartController(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @GetMapping("/parts")
    public Flux<Part> getParts(@RequestParam(value="category", defaultValue="") String category) {
        Flux<Part> parts = partRepository.findByCategory(category);
        return parts;
    }

    @GetMapping("/parts/{part_id}")
    Mono<Part> findById(@PathVariable String pid) {
        Mono<Part> part = this.partRepository.findById(pid);
        return part;
    }
}
