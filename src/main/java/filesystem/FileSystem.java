package filesystem;

public class FileSystem {
    private static FileSystem instance = new FileSystem();
    private Folder root;

    private FileSystem() {
        root = new Folder();
        root.setName("root");
    }

    public static FileSystem getInstance() {
        return instance;
    }

    public Folder getRoot() {
        return root;
    }
}
