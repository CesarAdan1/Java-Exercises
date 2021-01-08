package com.example.readtextfile;

import java.io.File;
import java.util.LinkedList;

public class principal {
    public static void main(String[] args) throws Exception{
        int lines = 0, words = 0, characters = 0;

        LinkedList<File> listFiles = new LinkedList<>();
        for(int i = 1; i <= 5; i++){
           // listFiles.add(new File("C:\\Users\\cejuca\\Documents\\Java\\src\\Files\\texto" + ".txt"));
            //listFiles.add(new File("C:\\Users\\cejuca\\Documents\\Java\\src\\Files\\texto.txt"));
            ///listFiles.add(new File("../Files/texto")) ;
        }

        for(int i = 0; i < listFiles.size(); i++){
            ReadFile filein = new ReadFile(listFiles.get(i)) ;
            lines += filein.getLines();
            words += filein.getWords();
            characters += filein.getCharacters();
        }

        System.out.println("lines:  " + lines + "\n words:  " + words + "\ncharacters: " + characters);
    }
}