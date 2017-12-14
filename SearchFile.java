//Search a File
//For Java Phone Book


package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchFile {
    public void parseFile(String fileName, String searchString) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNext()) {
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(searchStr)){
                System.out.println(line);
            }
        }
    }
}
