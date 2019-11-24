/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innameofgod1;

import java.util.ArrayList;

/**
 *
 * @author Daniel Septyadi
 */
public class LexicalAnalyzer {
    private String s;
    private ArrayList<Integer> token = new ArrayList<Integer>();

    public LexicalAnalyzer(String string, ArrayList token) {
        this.s = string;
        this.token = token;
    }

    public String getString() {
        return s;
    }

    public void setString(String string) {
        this.s = string;
    }
    
    public ArrayList getToken(){
        return token;
    }

    public void setToken(ArrayList token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return ("LexicalAnalyzer{"+"Input (string) ="+ s + ", Output (Token Lexic)= "+ token + '}');
    }
}
