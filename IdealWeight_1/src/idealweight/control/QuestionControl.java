/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.control;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import idealweight.exceptions.QuestionControlException;
import idealweight.model.Question;

/**
 *
 * @author Mann
 */
public class QuestionControl {

    public static Question getQuestion(String type) {
        try {
            Question question;

            Question[] questions = createQuestionList();
            Question[] validQuestions = new Question[2];
            int nextArrayIndex = 0;

            // Loop through and get questions for this subject
            for (int i = 0; i < questions.length; i++){

                if (questions[i].getSubject() == type) {
                    validQuestions[nextArrayIndex] = questions[i];
                    nextArrayIndex++;
                }

            }

            // Loop through validQuestions and choose one randomly
            Random r = new Random();
            int result = r.nextInt(nextArrayIndex);
            question = validQuestions[result];

            //error handling
            if (question == null){
                throw new QuestionControlException("Question not found.");
            }

            return question;
            
        } catch(QuestionControlException qce){
            return null;
        }
    } 
   
    public static void saveStudyList(String filePath) throws QuestionControlException {
        
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            Question[] questionList = createQuestionList();
            
            output.writeObject(questionList); //write the game object out to file
        }
        catch(Exception e) {
            throw new QuestionControlException(e.getMessage());
        }
        
    }
    
    public static Question[] createQuestionList(){
    
        Question[] questions = new Question[15];

        //Fruits Questions
        
        Question question1 = new Question();
        question1.setQuestion("Which is NOT an acid fruit?");
        question1.setAnswerCorrect(4);
        question1.setAnswerPotential1("Kiwi");
        question1.setAnswerPotential2("Water apple");
        question1.setAnswerPotential3("Bannana");
        question1.setAnswerPotential4("Orange (variety)");
        question1.setSubject("Acid fruits");
        questions[0] = question1;

        Question question2 = new Question();
        question2.setQuestion("What is a sweet fruit?");
        question2.setAnswerCorrect(3);
        question2.setAnswerPotential1("Cocoa");
        question2.setAnswerPotential2("Macadamia");
        question2.setAnswerPotential3("Cherry");
        question2.setAnswerPotential4("Chestnut");
        question2.setSubject("Sweet fruits");
        questions[1] = question2;
        
        Question question3 = new Question();
        question3.setQuestion("What is a Neutral fruit?");
        question3.setAnswerCorrect(1);
        question3.setAnswerPotential1("Peanut");
        question3.setAnswerPotential2("Orange");
        question3.setAnswerPotential3("Grapefruit");
        question3.setAnswerPotential4("Lime");
        question3.setSubject("Neutral fruits");
        questions[2] = question3;
        

        //Vegetables questions
        
        Question question4 = new Question();
        question4.setQuestion("What food is NOT considered a tuber?");
        question4.setAnswerCorrect(4);
        question4.setAnswerPotential1("The potato or potato");
        question4.setAnswerPotential2("The carrot");
        question4.setAnswerPotential3("The pumpkin");
        question4.setAnswerPotential4("Rice");
        question4.setSubject("Tubers");
        questions[3] = question4;

        Question question5 = new Question();
        question5.setQuestion("The Incas learned to develop diverse techniques to store them, and due to the Spanish conquest, was introduced in the European continent during century XVI");
        question5.setAnswerCorrect(2);
        question5.setAnswerPotential1("tomato");
        question5.setAnswerPotential2("the potato");
        question5.setAnswerPotential3("carrot");
        question5.setAnswerPotential4("parsley");
        question5.setSubject("Tubers");
        questions[4] = question5;
        
        Question question6 = new Question();
        question6.setQuestion("What fruit is known as the \"magic fruit\" or \"miracle fruit\"?");
        question6.setAnswerCorrect(3);
        question6.setAnswerPotential1("Rubus idaeus");
        question6.setAnswerPotential2("Carica papaya");
        question6.setAnswerPotential3("Synsepalum dulcificum");
        question6.setAnswerPotential4("Keynoohtum");
        question6.setSubject("Of fruit");
        questions[5] = question6;
        
        Question question7 = new Question();
        question7.setQuestion("Which fruit is the most refreshing?");
        question7.setAnswerCorrect(2);
        question7.setAnswerPotential1("Watermelon");
        question7.setAnswerPotential2("Strawberry");
        question7.setAnswerPotential3("Cantaloupe");
        question7.setAnswerPotential4("Banana");
        question7.setSubject("Of fruit");
        questions[6] = question7;

        Question question8 = new Question();
        question8.setQuestion("The Chinese have used this noble root in their medicine for over 2000 years");
        question8.setAnswerCorrect(1);
        question8.setAnswerPotential1("Ginger");
        question8.setAnswerPotential2("Carrot");
        question8.setAnswerPotential3("Tomato");
        question8.setAnswerPotential4("Parsley");
        question8.setSubject("At root");
        questions[7] = question8;
        
        Question question9 = new Question();
        question9.setQuestion("In ancient Greece, people used this vegetable a lot in cures.");
        question9.setAnswerCorrect(2);
        question9.setAnswerPotential1("Fennel");
        question9.setAnswerPotential2("Radish");
        question9.setAnswerPotential3("Carrot");
        question9.setAnswerPotential4("Onion");
        question9.setSubject("At root");
        questions[8] = question9;

        //proteins questions
        
        Question question10 = new Question();
        question10.setQuestion("In .... stand out the vitamins A, D, E and group B and minerals such as phosphorus, iron, sodium, zinc and selenium");
        question10.setAnswerCorrect(1);
        question10.setAnswerPotential1("Eggs");
        question10.setAnswerPotential2("fish");
        question10.setAnswerPotential3("milk");
        question10.setAnswerPotential4("meat");
        question10.setSubject("Animal origin proteins");
        questions[9] = question10;

        Question question11 = new Question();
        question11.setQuestion("Where we do NOT find proteins?");
        question11.setAnswerCorrect(2);
        question11.setAnswerPotential1("Pork");
        question11.setAnswerPotential2("snail");
        question11.setAnswerPotential3("lamb");
        question11.setAnswerPotential4("rabbit");
        question11.setSubject("Animal origin proteins");
        questions[10] = question11;

        Question question12 = new Question();
        question12.setQuestion("Which is not an advantage?");
        question12.setAnswerCorrect(4);
        question12.setAnswerPotential1("Low in fat");
        question12.setAnswerPotential2("Ability to help reduce cholesterol levels");
        question12.setAnswerPotential3("Prevention of cardiovascular diseases");
        question12.setAnswerPotential4("Activate your metabolism");
        question12.setSubject("vegetable origin proteins");
        questions[11] = question12;

        //Cereals questions
        
        Question question13 = new Question();
        question13.setQuestion("Beneficios del trigo:");
        question13.setAnswerCorrect(1);
        question13.setAnswerPotential1("Regulation of intestinal transit");
        question13.setAnswerPotential2("Weakens hair and nails");
        question13.setAnswerPotential3("Digestive system regulator");
        question13.setAnswerPotential4("Causes breast cancer");
        question13.setSubject("Wheat");
        questions[12] = question13;

        Question question14 = new Question();
        question14.setQuestion("95% of world cereal production is concentrated in Asia");
        question14.setAnswerCorrect(3);
        question14.setAnswerPotential1("Rice");
        question14.setAnswerPotential2("Chiken");
        question14.setAnswerPotential3("milk");
        question14.setAnswerPotential4("Pluto");
        question14.setSubject("Rice");
        questions[13] = question14;
        
        Question question15 = new Question();
        question15.setQuestion("Which is NOT a characteristic of barley?");
        question15.setAnswerCorrect(2);
        question15.setAnswerPotential1("It has more protein than wheat but has much less gluten");
        question15.setAnswerPotential2("Not indicated for hepatic spring cures");
        question15.setAnswerPotential3("Good source of inositol, substance long considered a vitamin of group B");
        question15.setAnswerPotential4("Good source of potassium, magnesium and phosphorus, but its greatest virtue is the richness in trace elements");
        question15.setSubject("Barley");
        questions[14] = question15;

        return questions;
    }
  
}
