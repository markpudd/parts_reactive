package com.example.rpart.repository;

import com.example.rpart.model.Part;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * Created by markpuddick on 9/10/17.
 */

public interface PartRepository extends ReactiveMongoRepository<Part, String> {

    public Flux<Part> findByCategory(@Param("category")String category);
    //public List<Part> findBySubPartsLocation(@Param("location")Location location);

}