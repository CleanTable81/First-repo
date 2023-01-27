/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfile1;

/**
 *
 * @author gamer
 */
public class testmaker {
    private int numQuest;
    private String firstQ;
    testmaker(int numQuestions) {
        this.numQuest = numQuestions;
    }

    public int getNumQuest() {
        return numQuest;
    }

    public void setNumQuest(int numQuest) {
        this.numQuest = numQuest;
    }
    
    public String getFirstQ() {
        return firstQ;
    }
    
    public void setFirstQ(String newQ) {
        this.firstQ = newQ;
    }
}
