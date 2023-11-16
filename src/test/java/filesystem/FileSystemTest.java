package filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSystemTest {

    @Test
    void deveRetornarRaiz(){
        FileSystem fs = FileSystem.getInstance();
        Folder root = fs.getRoot();
        root.setName("C:/");
        assertEquals("C:/", fs.getRoot().getPath());
    }


}