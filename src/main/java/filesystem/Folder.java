package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{
    private List<IFile> children;

    private Folder parent;

    private String name;

    public Folder() {
        this.children = new ArrayList<>();
    }

    public void add(IFile file) {
        this.children.add(file);
        file.setParent(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        String path = "";

        if (parent != null) {
            path = parent.getPath() + "/" + name;
        }else {
            path =this.name;
        }

        return path;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getContent() {
        throw new UnsupportedOperationException("Cannnot get content of a folder");
    }

    public List<IFile> getChildren() {
        return children;
    }

    public void setChildren(List<IFile> children) {
        this.children = children;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

}
