/*
 * This file implements the best player for Assignment 2
 * Written by: Ingale Omkar (U2020724H)
 */

public class Ingale_Omkar_Player extends Player {
    // Has a pre-set number of "forgiveness" to grant
    // Once the number has been reached, it defects 

    int betrayalTolerance = 10;

    int selectAction(int n, int[] myHistory, int[] oppHistory1, int[] oppHistory2) {
        if(n == 0) return 0; // cooperate on first round 
        int betrayals = 0;
        for(int i = 0 ; i < oppHistory1.length ; i++) {
            if(oppHistory1[i] == 1 || oppHistory2[i] == 1) betrayals++;
        }
        return (betrayals < betrayalTolerance) ? 0 : 1;
    }
}
