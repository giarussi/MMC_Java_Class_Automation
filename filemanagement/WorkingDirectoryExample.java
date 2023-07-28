package filemanagement;

public class WorkingDirectoryExample {
    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Working Directory: " + workingDir);
    }
}
