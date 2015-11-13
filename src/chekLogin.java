import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kingv_000 on 13.11.2015.
 */
public class chekLogin implements IModel{

   public boolean checkAccount(String login,String password){
       File checkXML = new File("C:\\Users\\Kingv_000\\IdeaProjects\\Task Manager\\src\\dtd\\user.xml");
       DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
       builderFactory.setIgnoringElementContentWhitespace(true);
       builderFactory.setNamespaceAware(true);
       DocumentBuilder documentBuilder = null;
       try {
           documentBuilder = builderFactory.newDocumentBuilder();
       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       }
       org.w3c.dom.Document document = null;

       try {
           document = documentBuilder.parse(checkXML);
       } catch (SAXException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

       NodeList users = document.getElementsByTagName("user");
       Map<String,String> userData = new HashMap<>();
       for (int i = 0; i < users.getLength(); i++) {
           for (int j = 0; j < users.item(i).getChildNodes().getLength(); j+=2) {
               String userLogin = users.item(i).getChildNodes().item(j).getTextContent();
               String userPassword = users.item(i).getChildNodes().item(j+1).getTextContent();
               userData.put(userLogin,userPassword);


           }
       }

       if (userData.get(login) != null && userData.get(login).equals(password)){
           return true;
       }
       return false;


   }





}
