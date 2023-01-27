/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfile1;

/**
 *
 * @author gamer
 */
public class pop_quiz extends testmaker {
    private int numQuestQuiz;
    
    public pop_quiz() {
        this.numQuestQuiz = 0;
    }
    
    public pop_quiz(int numQuest) {
        if (numQuest > 0 && numQuest < 6) {
            this.numQuestQuiz = numQuest;
        }
        
        else {
            System.out.println("Too many or too few questions, class creation failed.");
        }
    }

    public int getNumQuestQuiz() {
        return numQuestQuiz;
    }

    public void setNumQuestQuiz(int numQuest) {
        this.numQuestQuiz = numQuest;
    }
}
