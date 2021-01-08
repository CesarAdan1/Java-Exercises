package com.example.readtextfile;
import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Logger.*;

public class ReadFile {
    public File file;
    public String content;

    public ReadFile(File file){
        this.file = file;
        this.content = "";
        readContent();
    }

    public void readContent(){
        String lines = null;
        FileReader f = null;
        BufferedReader b = null;

        try {
            f = new FileReader(this.file);
            b = new BufferedReader(f);

            try {
                while ((lines = b.readLine()) != null){
                    this.content = this.content + "" + lines + "\n";
                }
            } catch(IOException ex){
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch(FileNotFoundException ex){
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getContent() {
        return content;
    }

    public int getWords() {
        if(this.content.equals("")){
            return 0;
        } else {
            StringTokenizer str = new StringTokenizer(this.content.replace("\n", ""));
            return str.countTokens();
        }
    }

    public int getLines() {
        if(this.content.equals("")){
            return 0;
        } else {
            return this.content.split("\n").length;
        }
    }

    public int getCharacters(){
        return this.content.replace(" ", "").replace("\n", "").length();
    }
}
