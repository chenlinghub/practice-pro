package chen.practice.design.pattern.single.test;


import chen.practice.design.pattern.single.pojo.TaskManageTool;

public class TestMain {
    public static void main(String[] args) {
        TaskManageTool singleInstance = TaskManageTool.getSingleInstance();
        singleInstance.printName();
    }
}