package com.cg.csvdemo;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class demo {

public static void main(String[] args) throws Exception {

CSVReader reader = new CSVReader(new FileReader("D:\\JavaWorkspaceSTS\\CSVXL\\test.csv"));


List<String[]> li=reader.readAll();
System.out.println("Total rows which we have is "+li.size());

Iterator<String[]>i1= li.iterator();

while(i1.hasNext()){
String[] str=i1.next();

System.out.print(" Values are ");

 for(int i=0;i<str.length;i++)
{
System.out.print(" "+str[i]);
}
System.out.println(" � ");
}

}

}
