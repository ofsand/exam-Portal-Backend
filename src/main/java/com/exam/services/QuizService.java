package com.exam.services;

import com.exam.models.exam.Quiz;

import java.util.Set;

public interface QuizService {

    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Quiz getQuiz(Long quizId);
    public Set<Quiz> getQuizzes();
    public void deleteQuiz(Long quizId);
}
