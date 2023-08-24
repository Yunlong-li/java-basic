package org.example;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum XydSheetNum {
    gender("性别",1),
    age("年龄",2),
    result("表明",3);

    private String name;

    private int index;

}
