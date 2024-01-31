package org.example.utill;

public final class IdBuilder { //10A

    private IdBuilder() {
    }

    private static Long id = 0L;
    private static Long teacherid = 0L;

    public static Long getNewId() {
        return id++;
    }
}
