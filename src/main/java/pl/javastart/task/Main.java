package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static final int MAX_MEMORY = 3;

    public static void main(String[] args) {

        Memory[] memories = new Memory[MAX_MEMORY];
        int memorycount = 0;
        System.out.println("Podaj informację o trzech unikalnych pamięciach RAM");
        while (memorycount < memories.length) {
            Memory tempMemory = createMemory();
            if (checkIfExists(tempMemory, memories)) {
                System.out.println("Duplikat");
            } else {
                memories[memorycount] = tempMemory;
                memorycount++;
            }
        }
        for (Memory memory : memories) {
            System.out.println(memory);
        }
    }

    private static Memory createMemory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rodzaj pamięci");
        String name = sc.nextLine();
        System.out.println("Podaj pojemność pamięci");
        int size = sc.nextInt();
        sc.nextLine();
        return new Memory(name, size);
    }

    static boolean checkIfExists(Memory tmpMemory, Memory[] memories) {
        for (Memory memory : memories) {
            if (tmpMemory.equals(memory)) {
                return true;
            }
        }
        return false;
    }
}