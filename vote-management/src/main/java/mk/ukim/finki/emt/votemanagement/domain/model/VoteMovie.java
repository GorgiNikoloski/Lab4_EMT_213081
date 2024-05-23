package mk.ukim.finki.emt.votemanagement.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "vote_movie")
public class VoteMovie extends AbstractEntity<VoteMovieId> {
}
