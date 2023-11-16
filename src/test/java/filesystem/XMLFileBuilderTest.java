package filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLFileBuilderTest {

    @Test
    void deveRetornarNome(){
        XMLFileBuilder builder = new XMLFileBuilder();
        builder.setName("teste.xml");
        XMLFile xmlFile = builder.build();
        assertEquals("teste.xml", xmlFile.getName());
    }

    @Test
    void deveRetornarConteudo(){
        XMLFileBuilder builder = new XMLFileBuilder();
        builder.setName("teste.xml").setContent("<teste></teste>");
        XMLFile xmlFile = builder.build();
        assertEquals("<teste></teste>", xmlFile.getContent());
    }

}