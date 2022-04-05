// Jennifer Broxson
// C00278444
// CMPS 261
// Program Description: ----------------------
//I certify that the code in the method functions including method function main of this project are entirely my own work.

package com.company;

import java.util.*;
import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //create Maps
        Map<String, Integer> xy2001 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2001 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2002 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2002 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2003 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2003 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2004 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2004 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2005 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2005 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2006 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2006 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2007 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2007 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2008 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2008 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2009 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2009 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xy2010 = new LinkedHashMap<String, Integer>();
        Map<String, Integer> xx2010 = new LinkedHashMap<String, Integer>();

        //read from the URLs
        Scanner input2001 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2002 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2003 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2004 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2005 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2006 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2007 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2008 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2009 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());
        Scanner input2010 = new Scanner(new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking2001.txt").openStream());

        //populate the maps
        createMaps(input2001, xy2001, xx2001);
        createMaps(input2002, xy2002, xx2002);
        createMaps(input2003, xy2003, xx2003);
        createMaps(input2004, xy2004, xx2004);
        createMaps(input2005, xy2005, xx2005);
        createMaps(input2006, xy2006, xx2006);
        createMaps(input2007, xy2007, xx2007);
        createMaps(input2008, xy2008, xx2008);
        createMaps(input2009, xy2009, xx2009);
        createMaps(input2010, xy2010, xx2010);

        //Creating two arrays //do I want this as Map Arrays
        Map[] boyArray = {xy2001, xy2002, xy2003, xy2004, xy2005, xy2006, xy2007, xy2008, xy2009, xy2010};
        Map[] girlArray = {xx2001, xx2002, xx2003, xx2004, xx2005, xx2006, xx2007, xx2008, xx2009, xx2010};

        //get input from the user
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Enter a year from 2001 through 2010, inclusively ('YYYY'): ");
        int year = userChoice.nextInt();
        System.out.println("Enter a gender (M/F): ");
        String gender = userChoice.next();
        userChoice.nextLine();
        System.out.println("Enter a name to search: ");
        String name = userChoice.nextLine();

        Object rank;
        switch (year){
            case 2001:
                switch (gender){
                    case "M":
                        rank = boyArray[0].get(name);
                        break;
                    case "F":
                        rank = girlArray[0].get(name);
                        break;
                }
                break;
        }



    }
    public static void createMaps(Scanner input, Map xy, Map xx){

        String boyName = "";
        Integer boyRanking;
        String girlName = "";
        Integer girlRanking;

        while (input.hasNextLine())
            boyName = input.nextLine().split("\t")[1];
            boyRanking = Integer.parseInt(input.nextLine().split("\t")[2]);
            xy.put(boyName, boyRanking);
            girlName = input.nextLine().split("\t")[3];
            girlRanking = Integer.parseInt(input.nextLine().split("\t")[4]);
            xx.put(girlName, girlRanking);

    }
}
