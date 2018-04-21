package com.note.ideaDemo;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public enum Status {
    // 1xx Informational
    CONTINUE(100),
    PROCESSING(102),
    CHECKPOINT(103),

    // 2xx Success
    OK(200),
    CREATED(201),
    ACCEPTED(202),

    // 3xx Redirection
    FOUND(302),

    // 4xx Client Error
    UNAUTHORIZED(401),
    CONFLICT(409),
    GONE(410);

    private int code;

    Status(int code) {
        this.code = code;
    }

    /**
     * age
     */
     private int age;

    /**
     * name
     */
     private String name;









}
