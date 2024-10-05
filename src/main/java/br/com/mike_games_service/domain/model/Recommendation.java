package br.com.mike_games_service.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name="Recommendation")
@Table(name="recommendations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "target_username")
    private String targetUsername;

    @Column(name = "source_username")
    private String sourceUsername;

    @Column(name="date")
    private LocalDateTime date;


}
