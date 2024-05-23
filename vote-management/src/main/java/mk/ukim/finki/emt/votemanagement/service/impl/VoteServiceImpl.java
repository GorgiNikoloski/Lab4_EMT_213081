package mk.ukim.finki.emt.votemanagement.service.impl;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.votemanagement.domain.model.Vote;
import mk.ukim.finki.emt.votemanagement.domain.model.VoteId;
import mk.ukim.finki.emt.votemanagement.domain.repository.VoteRepository;
import mk.ukim.finki.emt.votemanagement.service.VoteService;
import mk.ukim.finki.emt.votemanagement.service.forms.VoteForm;
import org.springframework.stereotype.Service;

import javax.xml.transform.Source;
import javax.xml.validation.Validator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor     // da naprajt konstruktor so site argumenti
public class VoteServiceImpl implements VoteService {

    private final VoteRepository voteRepository;
    private final Validator validator;

    @Override
    public VoteId voteMovie() {
        Objects.requireNonNull(voteMovie(), "you must vote a movie");

        return null;
    }

    @Override
    public List<Vote> findAll() {
        return voteRepository.findAll();
    }

    @Override
    public Optional<Vote> findById(VoteId id) {
        return voteRepository.findById(id);
    }
}
