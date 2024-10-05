package br.com.mike_games_service.domain.service;

import br.com.mike_games_service.domain.model.Recommendation;
import br.com.mike_games_service.domain.port.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    private RecommendationRepository repository;

    public List<Recommendation> findRecommendations(String username){
        return this.repository.findAllByTargetUsername(username);
    }

    public void save(Recommendation recommendation){
        repository.save(recommendation);
    }
}
