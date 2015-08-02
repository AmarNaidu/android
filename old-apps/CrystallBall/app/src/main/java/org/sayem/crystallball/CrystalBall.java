package org.sayem.crystallball;

import java.util.Random;

public class CrystalBall {

    public String [] mAnswers = {

            "It is certain",
            "It is decidedly so",
            "All signs say YES",
            "The stars are not aligned",
            "It is doubtful",
            "Better not tell you now",
            "Concentrate and ask again",
            "Unable to answer now"
    };

    public String getAnAnswer(){

        String answer = "";
        // Randomly elect one of three mAnswers: Yes, No, or Maybe

        Random random = new Random();
        int randomNum = random.nextInt(mAnswers.length);

        answer = mAnswers[randomNum];

        return answer;
    }
}
