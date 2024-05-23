package mk.ukim.finki.emt.votemanagement.service;

import mk.ukim.finki.emt.votemanagement.domain.model.Vote;
import mk.ukim.finki.emt.votemanagement.domain.model.VoteId;

import java.util.List;
import java.util.Optional;

public interface VoteService {

    VoteId voteMovie();     // placeOrder => voteMovie

    List<Vote> findAll();

    Optional<Vote> findById(VoteId id);


}
