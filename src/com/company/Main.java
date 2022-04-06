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
        Scanner input2001 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynameranking2001.txt").openStream());
        Scanner input2002 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2002.txt").openStream());
        Scanner input2003 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2003.txt").openStream());
        Scanner input2004 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2004.txt").openStream());
        Scanner input2005 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2005.txt").openStream());
        Scanner input2006 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2006.txt").openStream());
        Scanner input2007 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2007.txt").openStream());
        Scanner input2008 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2008.txt").openStream());
        Scanner input2009 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2009.txt").openStream());
        Scanner input2010 = new Scanner(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt").openStream());

        //populate the map arrays
        populateMaps(input2001, xy2001, xx2001);
        populateMaps(input2002, xy2002, xx2002);
        populateMaps(input2003, xy2003, xx2003);
        populateMaps(input2004, xy2004, xx2004);
        populateMaps(input2005, xy2005, xx2005);
        populateMaps(input2006, xy2006, xx2006);
        populateMaps(input2007, xy2007, xx2007);
        populateMaps(input2008, xy2008, xx2008);
        populateMaps(input2009, xy2009, xx2009);
        populateMaps(input2010, xy2010, xx2010);

        //Creating two arrays //do I want this as Map Arrays
        Map[] xxArray = {xy2001, xy2002, xy2003, xy2004, xy2005, xy2006, xy2007, xy2008, xy2009, xy2010};
        Map[] xyArray = {xx2001, xx2002, xx2003, xx2004, xx2005, xx2006, xx2007, xx2008, xx2009, xx2010};

        //get input from the user
        Scanner userChoice = new Scanner(System.in);
        System.out.print("Enter a year from 2001 through 2010, inclusively ('YYYY'): ");
        int year = userChoice.nextInt();
        System.out.print("Enter a gender (M/F): ");
        String gender = userChoice.next();
        userChoice.nextLine();
        System.out.print("Enter a name to search: ");
        String name = userChoice.nextLine();


        Object rank = -99;
        //maybe I could have declared int variables for the year and index and incremented throughout
        switch (year){
            case 2001:
                switch (gender){
                    case "M":
                        rank = xxArray[0].get(name);
                        break;
                    case "F":
                        rank = xyArray[0].get(name);
                        break;
                } break;
            case 2002:
                    switch (gender) {
                        case "M":
                            rank = xxArray[1].get(name);
                            break;
                        case "F":
                            rank = xyArray[1].get(name);
                            break;
                    } break;
            case 2003:
                switch (gender) {
                    case "M":
                        rank = xxArray[2].get(name);
                        break;
                    case "F":
                        rank = xyArray[2].get(name);
                        break;
                } break;
            case 2004:
                switch (gender) {
                    case "M":
                        rank = xxArray[3].get(name);
                        break;
                    case "F":
                        rank = xyArray[3].get(name);
                        break;
                }break;
            case 2005:
                switch (gender) {
                    case "M":
                        rank = xxArray[4].get(name);
                        break;
                    case "F":
                        rank = xyArray[4].get(name);
                        break;
                }break;
            case 2006:
                switch (gender) {
                    case "M":
                        rank = xxArray[5].get(name);
                        break;
                    case "F":
                        rank = xyArray[5].get(name);
                        break;
                }break;
            case 2007:
                switch (gender) {
                    case "M":
                        rank = xxArray[6].get(name);
                        break;
                    case "F":
                        rank = xyArray[6].get(name);
                        break;
                }break;
            case 2008:
                switch (gender) {
                    case "M":
                        rank = xxArray[7].get(name);
                        break;
                    case "F":
                        rank = xyArray[7].get(name);
                        break;
                }break;
            case 2009:
                switch (gender) {
                    case "M":
                        rank = xxArray[8].get(name);
                        break;
                    case "F":
                        rank = xyArray[8].get(name);
                        break;
                }break;
            case 2010:
                switch (gender) {
                    case "M":
                        rank = xxArray[9].get(name);
                        break;
                    case "F":
                        rank = xyArray[9].get(name);
                        break;
                }
                break;
        }

        System.out.println("The name " + name + " held the rank of " + rank + " in the year " + year + ".");

        }

    public static void populateMaps(Scanner input, Map xy, Map xx){

        int ranking;
        String boyName = "";
        Integer boyRanking;
        String girlName = "";
        Integer girlRanking;

            while (input.hasNext()) {
                ranking = input.nextInt();
                boyName = input.next();
                xy.put(boyName, ranking);
                input.nextInt();
                girlName = input.next();
                xx.put(girlName, ranking);
                input.nextInt();
            }
    }

}
