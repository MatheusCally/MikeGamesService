package br.com.mike_games_service.adapter.resource;

import br.com.mike_games_service.domain.model.Answer;
import br.com.mike_games_service.domain.service.AnswerService;
import jakarta.annotation.Resource;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Resource
@RestController
@RequestMapping("/answers")
public class AnswerResource {

    @Autowired
    private AnswerService service;

    @GetMapping("/{id}")
    private ResponseEntity<List<Answer>> findAllByRecommendation(@PathVariable("id") Long id){
        return ResponseEntity.ok(this.service.findAllByRecommendation(id));
    }

    @PostMapping
    private ResponseEntity<String> save(@RequestBody Answer answer){
        service.saveAnswer(answer);
        return ResponseEntity.ok("Success");
    }
}
