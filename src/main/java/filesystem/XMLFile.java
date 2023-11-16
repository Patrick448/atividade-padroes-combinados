package filesystem;

public class XMLFile extends File{

    public void addElement(String element){
        this.setContent(this.getContent() + "<element>"+element+"</element>\n");
    }
}
