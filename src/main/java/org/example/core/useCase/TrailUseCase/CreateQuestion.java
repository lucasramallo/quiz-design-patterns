package org.example.core.useCase.TrailUseCase;

import org.example.core.domain.Question;
import org.example.core.repository.ITrailRepository;

import java.util.ArrayList;

public class CreateQuestion {
    private ITrailRepository repository;
    public CreateQuestion(ITrailRepository repository){
        this.repository = repository;
    }

    public void execute(String description, ArrayList<String> alternatives, int index){
//        TODO: Question question = new Question(description, );
    }
}
