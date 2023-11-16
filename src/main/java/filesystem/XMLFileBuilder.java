package filesystem;

public class XMLFileBuilder  implements IFileBuilder{
    private XMLFile xmlFile;

    public XMLFileBuilder() {
        xmlFile = new XMLFile();
    }


    @Override
    public XMLFileBuilder setName(String name) {
        this.xmlFile.setName(name);
        return this;
    }

    @Override
    public XMLFileBuilder setContent(String content) {
        this.xmlFile.setContent(content);
        return this;

    }

    public XMLFile build() {
        return this.xmlFile;
    }

    public XMLFile addElement(String element) {
        this.xmlFile.addElement(element);
        return this.xmlFile;
    }
}
