package warm_up_challenges;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class JumpingOnTheCloudsChallenge_03 {

    public static int jumpingOnClouds(int[] c) {
        int positionCloud = 1;
        ArrayList valores = new ArrayList();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                if(i < c.length - 2){
                    if (c[i + 1] == 0 && c[i + 2] == 0) {
                        if (i + 1 == positionCloud) {
                            i = i + 2;
                            valores.add(c[i]);
                            positionCloud = positionCloud + 2;
                        } else {
                            valores.add(c[i]);
                            positionCloud++;
                        }
                    }
                } else
                    if(i < c.length - 1  && c[i + 1] == 0){
                        valores.add(c[i]);
                        positionCloud++;
                    }
            }
        }
        System.out.println(valores.size());

        return valores.size();
    }

    public static void main(String[] args) throws IOException {
        int[] array = {0, 0, 0, 0, 1, 0};
        jumpingOnClouds(array);
    }
}
