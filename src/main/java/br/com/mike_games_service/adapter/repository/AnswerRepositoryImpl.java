package br.com.mike_games_service.adapter.repository;

import br.com.mike_games_service.domain.model.Answer;
import br.com.mike_games_service.domain.port.AnswerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepositoryImpl extends AnswerRepository, JpaRepository<Answer, Long> {
}
