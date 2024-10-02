import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class LeerFicheroXML {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        FileInputStream fisXML=new FileInputStream("C:\\Users\\laura\\Desktop\\fichero.xml");
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder db=factory.newDocumentBuilder();
        Document documentoXML=db.parse(fisXML);


        NodeList listaNombre=documentoXML.getElementsByTagName("nombre");
        ArrayList<String>nombres=new ArrayList<>();
        for (int i=0;i<listaNombre.getLength();i++){
            nombres.add(listaNombre.item(i).getTextContent());

        }
        NodeList listaDni=documentoXML.getElementsByTagName("dni");
        ArrayList<String>dnis=new ArrayList<>();
        for (int i=0;i<listaDni.getLength();i++){
            dnis.add(listaDni.item(i).getTextContent());

        }
        for (int i=0;i<nombres.size();i++){
            System.out.println("El alumno con nombre "+ nombres.get(i) +", tiene el dni "+dnis.get(i));
        }


    }


}
