package br.com.mike_games_service.domain.service;

import br.com.mike_games_service.domain.model.Answer;
import br.com.mike_games_service.domain.port.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository repository;

    public List<Answer> findAllByRecommendation(Long id){
        return repository.findAllByRecommendation_Id(id);
    }

    public void saveAnswer(Answer answer){
        repository.save(answer);
    }
}
