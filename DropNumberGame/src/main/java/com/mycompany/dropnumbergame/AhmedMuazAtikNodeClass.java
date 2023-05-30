package com.mycompany.dropnumbergame;

public class AhmedMuazAtikNodeClass<T> {

    T data;
    
    int col;
    
    AhmedMuazAtikNodeClass<T> next;
    AhmedMuazAtikNodeClass<T> up;
    AhmedMuazAtikNodeClass<T> right;

    //Constructor with 2 parameters.
    public AhmedMuazAtikNodeClass(T data, int col) {
        this.data = data;
        this.col = col;
        this.up = null;
        this.right = null;
    }
    
    //Constructor with 1 parameter.
    public AhmedMuazAtikNodeClass(T data) {
        this.data = data;
        this.next = null;
    }
}
