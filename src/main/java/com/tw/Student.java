package com.tw;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Map<String,Integer> grades;
    private int totalGrade;
    private double averageGrade;

    public Student(String input) {
        String[] strs=input.split("，");
        name=strs[0];
        id=strs[1];
        grades =new LinkedHashMap<>();
        for (int i = 0; i < strs.length - 2; i++) {
            String[] strs1=strs[i+2].split("：");
            grades.put(strs1[0],Integer.valueOf(strs1[1]));
        }
        totalGrade =getTotalScoreOfAStudent(grades);
        averageGrade =getAverageScoreOfAStudent(grades);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(int totalGrade) {
        this.totalGrade = totalGrade;
    }


    public int getTotalScoreOfAStudent(Map<String, Integer> scores) {
        int sum=0;
        for(int score:scores.values())
            sum+=score;
        return sum;
    }

    public double getAverageScoreOfAStudent(Map<String, Integer> scores) {
        return (double) getTotalScoreOfAStudent(scores)/scores.size();
    }

    public String getDetailedInfo(){
        return name+"|"+ grades.get("数学")+"|"+ grades.get("语文")+"|"+ grades.get("英语")+"|"+ grades.get("编程")+"|"+ averageGrade +"|"+ totalGrade +"\n";
    }
}