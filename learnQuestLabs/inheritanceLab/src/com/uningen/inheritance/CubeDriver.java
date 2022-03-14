package com.uningen.inheritance;

public class CubeDriver {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(8);
        System.out.println("Cube1: ");
        cube1.printBox();
        System.out.println("\nCube2");
        cube2.printBox();

        cube1.setWidth(20);
        System.out.println("Cube1: ");
        cube1.printBox();

        cube2.setSide(40);
        System.out.println("\nCube2");
        cube2.printBox();

        cube2.setWidth(-5);
        System.out.println("\nCube2");
        cube2.printBox();

    }
}
