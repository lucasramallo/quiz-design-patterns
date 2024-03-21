package org.example.core.usecases;

import org.example.core.domain.Trail;
import org.example.core.interfaces.IQuestion;

import java.util.UUID;

public class DeleteQuestionUseCase {
    private Trail trail;

    public DeleteQuestionUseCase(Trail trail) {
        this.trail = trail;
    }

    public void deleteQuestion(UUID questionId) {
        // Verificar se a questão existe na trilha
        IQuestion questionToDelete = null; // Inicializa a variável que será usada para armazenar a questão a ser deletada
        for (IQuestion question : trail.getQuestions()) { // Percorre todas as questões na trilha
            if (question.getID().equals(questionId)) { // Verifica se a ID da questão é igual à ID fornecida como argumento
                questionToDelete = question; // Se a questão for encontrada, atribui a questão a ser deletada à variável
                break; // Interrompe o loop assim que a questão é encontrada
            }
        }

        // Remover a questão da trilha, se encontrada
        if (questionToDelete != null) { // Verifica se a questão foi encontrada
            trail.getQuestions().remove(questionToDelete); // Remove a questão da trilha
            System.out.println("Questão removida com sucesso!"); // Imprime uma mensagem informando que a questão foi removida
        }
        System.out.println("Questão não encontrada na trilha."); // Imprime uma mensagem informando que a questão não foi encontrada
    }
}