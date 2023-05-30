package com.mycompany.dropnumbergame;

public class AhmedMuazAtikTestClass {

    public static void main(String[] args) {
        int[][] values = {{0, 2}, {3, 2}, {1, 4}, {2, 2},
        {4, 4}, {1, 2}, {4, 4}, {0, 8},
        {0, 8}, {1, 32},
        {2, 2}, {2, 64}, {3, 16},
        {1, 64}, {2, 32}, {0, 16},
        {4, 16}, {2, 32},
        {1, 64}, {3, 8}, {3, 4},
        {3, 2}, {3, 2},
        {1, 2}, {2, 64}, {2, 32},
        {2, 16}, {2, 8}, {2, 8},
        {1, 4}, {1, 8}};

        AhmedMuazAtikMultiLinkedListClass<Integer> test = new AhmedMuazAtikMultiLinkedListClass<>();
        
        System.out.println("------------------------\nCOL NUM: " + 0 + "\nVALUE: " + 2 + "\n------------------------");
        
        for (int i = 0; i < values.length; i++) {
            test.node_addition(values[i][0], values[i][1]); //Adding all the elements into the multi linked list.
            test.print();
        }
    }
}
