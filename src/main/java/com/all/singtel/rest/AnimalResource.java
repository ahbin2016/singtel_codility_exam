package com.all.singtel.rest;

import com.all.singtel.Animal;
import com.all.singtel.util.AnimalCount;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/animal")
public class AnimalResource {
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Map<String, Integer>> getAllWalkingAnimals(@RequestBody Animal[] animals) {
    AnimalCount animalCount = new AnimalCount(animals);
    int result = animalCount.walkingAnimal;
    Map<String, Integer> response = Collections.singletonMap("count", result);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
