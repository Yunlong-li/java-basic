package org.example;

/**
 * @author 刘伟
 * @program: test
 * @description: 学生
 * @date 2023-05-23 18:46:20
 */
public class Stu {
    private  Integer id;
    private String name;

    public Stu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
