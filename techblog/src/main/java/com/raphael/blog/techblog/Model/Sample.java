package com.raphael.blog.techblog.Model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sample {
    private String message;

    public Sample() {

    }

    public Sample(String message) {
        this.message = message;
    }
}
