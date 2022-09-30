package com.exam.services.impl;

import com.exam.models.exam.Quiz;
import com.exam.repo.QuizRepository;
import com.exam.services.QuizService;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz getQuiz(Long quizId) {
        return this.quizRepository.findById(quizId).get();
    }

    @Override
    public Set<Quiz> getQuizzes() {
        return new LinkedHashSet<>(this.quizRepository.findAll());
    }

    @Override
    public void deleteQuiz(Long quizId) {
        Quiz quiz = new Quiz();
        quiz.setqId(quizId);
        this.quizRepository.delete(quiz);
    }
}
