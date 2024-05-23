package mk.ukim.finki.emt.votemanagement.domain.repository;

import mk.ukim.finki.emt.votemanagement.domain.model.Vote;
import mk.ukim.finki.emt.votemanagement.domain.model.VoteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, VoteId> {

}
