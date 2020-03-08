package com.company;

import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
import java.util.Scanner;

class player {
    private int id;
    private String name;
    public int getId (){
        return this.id;
    }
    public String getName () {
        return this.name;
    }
    public void setId (int p_id) {
        this.id = p_id;
    }
    public void setName (String p_name) {
        this.name = p_name;
    }
    public player(int p_id, String p_name){
        this.id = p_id;
        this.name = p_name;
    }
    public void quit () {
        System.out.println ("Player " + this.name + " left the game!");
    }
}

class Student {
    int nota;
    String nume;
    public Student (){
        this.nota = 0;
        this.nume = " ";
    }
    public Student (int p_nota, String p_nume){
        this.nota = p_nota;
        this.nume = p_nume;
    }
    void setNota (int p_nota) {
        this.nota = p_nota;
    }
    void setNume (String p_nume) {
        this.nume = p_nume;
    }
    int getNota (){
        return this.nota;
    }
    String getNume (){
        return this.nume;
    }
    void show (PrintStream out) {
        out.println("Studentul " + this.nume + " are nota " + this.nota);
    }
}

public class Main {
    public static void task1 (Scanner in, PrintStream out) {
        int[] v = new int[100];
        out.println("Task 1) Introduceti notele si -1 pentru media lor : ");
        int x = in.nextInt(), index = 0, s = 0;
        while (x != -1) {
            v[index++] = x;
            s += x;
            x = in.nextInt();
        }
        if (index == 0)
            out.println ("Nu ati introdus niciun numar!");
        else
            out.println ("Media lor este : " + (double)s / index);
    }

    public static void task2 (Scanner in, PrintStream out) {
        int[][] v = new int [2][100];
        int[] index = {0, 0};
        out.println ("Task 2) Introduceti cate numere sunt : ");
        int x, it, N = in.nextInt();
        out.println ("Introduceti cele " + N + " numere : ");
        for (it = 0; it < N; ++it){
            x = in.nextInt();
            v[x & 1][index[x & 1]++] = x;
        }
        if (index[0] > index[1])
            out.println ("Sunt mai multe numere pare");
        else
            out.println ("Sunt mai multe numere impare");
    }

    public static void task3 (Scanner in, PrintStream out) {
        player A = new player(10, "Ignazio");
        out.println("Task 3) Player " + A.getName() + " has the number " + A.getId());
        A.quit();
    }

    public static void task4 (Scanner in, PrintStream out) {
        out.println ("Task 4) Introduceti numarul de studenti : ");
        int it, N = in.nextInt();
        Student[] catalog = new Student[N];
        out.println ("Introduceti numele si notele celor " + N + " studenti: ");
        in.nextLine();
        for (it = 0; it < N; ++it){
            catalog[it] = new Student();
            String line = in.nextLine();
            String[] params = line.split(" ");

            catalog[it].setNume(params[0]);
            catalog[it].setNota(Integer.parseInt(params[1]));
        }
        for (it = 0; it < N; ++it)
            catalog[it].show (out);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream output = new PrintStream(System.out);
        task1 (sc, output);
        task2 (sc, output);
        task3 (sc, output);
        task4(sc, output);
    }
}
