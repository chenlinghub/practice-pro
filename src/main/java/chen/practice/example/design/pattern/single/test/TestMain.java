package chen.practice.example.design.pattern.single.test;


import chen.practice.example.design.pattern.single.pojo.TaskManageTool;

public class TestMain {
    public static void main(String[] args) {
        TaskManageTool singleInstance = TaskManageTool.getSingleInstance();
        singleInstance.printName();
    }
}
