package br.com.mike_games_service.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name="Answer")
@Table(name="answers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recommendation_id")
    private Recommendation recommendation;

    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "source_username")
    private String sourceUsername;

    @Column(name="date")
    private LocalDateTime date;
}
