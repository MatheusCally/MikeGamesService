package br.com.mike_games_service.domain.port;

import br.com.mike_games_service.domain.model.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository {

    List<Answer> findAllByRecommendation_Id(Long id);

    Answer save(Answer answer);
}
