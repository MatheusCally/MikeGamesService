package br.com.mike_games_service.domain.port;

import br.com.mike_games_service.domain.model.Recommendation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository {

    List<Recommendation> findAllByTargetUsername(String username);

    Recommendation save(Recommendation recommendation);
}
