package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

    HashMap<String, String>  map = new HashMap<String, String>();

    map.put("cat", "Meow");
    map.put ( "ape", "Squeak");
    map.put ("dog", "Woof");
    map.put ("bat", "Squeak");

    System.out.println( "map = " + map);

    System.out.println(" A cat says...." + map.get("cat"));
    System.out.println("a dog says..." +  map.get("dog"));

    //Iterating over values only

    for(String value : map.values() )
    {
        System.out.println("Value  = "  + value);
    }
    //Iterating over keys only
    for(String key : map.keySet() )
    {
        System.out.println("Key  = "  + key);
    }

    System.out.println();
    System.out.println("Iterating over keys and values");

    //Iterating over keys and values

    for(String key : map.keySet() )
    {
        System.out.println(key + "\t" + map.get(key));
    }
    System.out.println();
    }
//
//    //Writing keys and values to a file
//    System.out.println("Writing keys and values  to a file");
//    String filename = (System.get.Property)("user.dir") + file.separatorChar + "aninmalNoises.txt");
//    System.out.println(filename);
//
//    PrintWriter  writer = null;
//    try
//    {
//         writer = new PrintWriter(new file(filename));
//    }catch (FileNotFoundEception  e)
//    {
//        System.out.println("File does not exist");
//    }


}
