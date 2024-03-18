<<<<<<< HEAD:src/main/java/org/example/core/domain/Question.java
package org.example.core.domain;

import org.example.core.interfaces.IQuestion;

=======
package org.example.domain;
import org.example.interfaces.IQuestion;
>>>>>>> ac4c8da4d417946ba4001d93000c55da1396d882:src/main/java/org/example/domain/Question.java
import java.util.ArrayList;
import java.util.UUID;

public class Question implements IQuestion {
    private final UUID questionId;
    private String description;

    private ArrayList<Alternative> alternatives;
    public Question(String description, ArrayList<Alternative> alternatives) {
        this.questionId = UUID.randomUUID();
        this.description = description;
        this.alternatives = alternatives;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Alternative> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(ArrayList<Alternative> alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public UUID getID() {
        return this.questionId;
    }
}
