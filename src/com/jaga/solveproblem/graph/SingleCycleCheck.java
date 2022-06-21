package com.jaga.solveproblem.graph;

public class SingleCycleCheck {

    public static void main(String[] args) {

        int array[]  = { 2, 3, 1, -4, -4, 2 };

        int n = array.length;
        int numOfElementsVisited=0;
        int currentIdx=0;

        boolean singleCycle = isSingleCycle(array, n, numOfElementsVisited, currentIdx);
        System.out.println(singleCycle);

    }

    private static boolean isSingleCycle(int[] array, int n, int numOfElementsVisited, int currentIdx) {

        while(numOfElementsVisited < n) {
            if(numOfElementsVisited >0 && currentIdx ==0) {
                return false;
            }
            numOfElementsVisited++;
            currentIdx = getCurrentIndex(array,currentIdx);
        }

        return currentIdx==0;
    }

    private static int getCurrentIndex(int[] array, int currentIdx) {
        int jump = array[currentIdx];
        int nextIndex = (currentIdx+jump) % array.length;
        return nextIndex>=0?nextIndex: nextIndex+array.length;
    }
}
