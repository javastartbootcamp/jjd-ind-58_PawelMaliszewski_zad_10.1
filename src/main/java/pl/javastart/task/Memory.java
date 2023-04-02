package pl.javastart.task;

import java.util.Objects;

public class Memory {

    private String name;
    private int size;

    public Memory(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memory memory = (Memory) o;
        return size == memory.size && Objects.equals(name, memory.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
