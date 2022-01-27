package org.launchcode.java.demos.lsn6inheritance.technology;

public abstract class AbstractEntity {

    private int Id;
    private static int count = 0;

    public AbstractEntity() {
        this.Id = ++count;
    }
    public int getId(){
        return this.Id;
    }
}
