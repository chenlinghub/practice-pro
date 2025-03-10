package chen.practice.example.design.pattern.single.pojo;

public class TaskManageTool {
    //1.声明一个静态成员变量，保存单例实例
    private static volatile TaskManageTool singleInstance;

    private String name = "任务管理器";

    //2.私有化构造方法
    private TaskManageTool() {}

    public void printName() {
        System.out.println(this.name);
    }

    //3.提供一个静态方法用于获取单例实例 双重检查
    public static TaskManageTool getSingleInstance() {

        if (singleInstance == null) {
            synchronized (TaskManageTool.class) {
                if (singleInstance == null) {
                    singleInstance = new TaskManageTool();
                }
            }
        }
        return singleInstance;
    }

}