package com.zjc.entity;/*
    @author  zjc
    @create 2021-03-03-10:51  
*/

public class Student implements Comparable<Student>{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}' +"总分  " +getSum();
    }

    public int getSum(){
       int sum =  chinese + math+ english;
       return sum;
    }

    @Override
    public int compareTo(Student o) {
        //按总分进行排序
        int result = this.getSum() - o.getSum();

        // 次要排序   总分一样 比语文成绩
        result = result == 0 ? this.getChinese() - o.getChinese() :result;
        //次要排序   总分一样 语文成绩一样 比数学成绩
        result = result == 0 ? this.getMath() - o.getMath() :result;

        //总分一样  语文和数学一样  英语成绩肯定一样 可以直接比较姓名  可以不写着一步
        result = result == 0 ? this.getEnglish() - o.getEnglish() :result;

        //成绩都一样 按照姓名排序

        result = result == 0 ? this.getName().compareTo(o.getName()) :result;


        return result;
    }
}
