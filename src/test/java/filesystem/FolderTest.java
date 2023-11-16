package filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FolderTest {

    @Test
    void deveRetornarNome(){
        Folder folder = new Folder();
        folder.setName("C:/");
        assertEquals("C:/", folder.getName());
    }

    @Test
    void deveRetornarCaminho(){
        Folder folder = new Folder();
        folder.setName("C:");
        File file = new File();
        file.setName("teste.txt");
        folder.add(file);
        assertEquals("C:/teste.txt", file.getPath());
    }

}