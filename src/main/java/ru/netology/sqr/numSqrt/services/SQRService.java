package ru.netology.sqr.numSqrt.services;

public class SQRService {
    public int calcNumberSquareRoots (int bottomLimit, int topLimit){
        int comp = 0;
        for (int i = 10; i <=99; i++){
            if (bottomLimit <= i*i && i*i <= topLimit){
                comp++;
            }
        }
        return comp++;
    }
}
