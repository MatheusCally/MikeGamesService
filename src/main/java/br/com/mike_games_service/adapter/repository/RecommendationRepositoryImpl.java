package br.com.mike_games_service.adapter.repository;

import br.com.mike_games_service.domain.model.Recommendation;
import br.com.mike_games_service.domain.port.RecommendationRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepositoryImpl extends RecommendationRepository, JpaRepository<Recommendation, Long> {
}
