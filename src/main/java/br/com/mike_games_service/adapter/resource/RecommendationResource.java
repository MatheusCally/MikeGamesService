package br.com.mike_games_service.adapter.resource;

import br.com.mike_games_service.domain.model.Recommendation;
import br.com.mike_games_service.domain.service.RecommendationService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Resource
@RestController
@RequestMapping("/recommendation")
public class RecommendationResource {

    @Autowired
    private RecommendationService service;

    @GetMapping("/{username}")
    private ResponseEntity<List<Recommendation>> findAllByRecommendation(@PathVariable("username") String username){
        return ResponseEntity.ok(this.service.findRecommendations(username));
    }

    @PostMapping
    private ResponseEntity<String> save(@RequestBody Recommendation recommendation){
        service.save(recommendation);
        return ResponseEntity.ok("Success");
    }

}
