/**
 * Created by Kingv_000 on 13.11.2015.
 */
/*public static boolean authorize(String login, String password){

        File authXML = new File("src\\users\\dtd\\users.xml");
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
        document = documentBuilder.parse(authXML);
        } catch (SAXException e) {
        e.printStackTrace();
        }
        catch (IOException e){
        e.printStackTrace();
        }

        NodeList users = document.getElementsByTagName("user");
        Map<String, String> userData = new HashMap<>();

        for (int i = 0; i < users.getLength(); i++) {
        for (int j = 0; j < users.item(i).getChildNodes().getLength(); j+= 2) {
        String userLogin = users.item(i).getChildNodes().item(j).getTextContent();
        String userPassword = users.item(i).getChildNodes().item(j + 1).getTextContent();
        userData.put(userLogin, userPassword);
        }
        }

        if (userData.get(login) != null && userData.get(login).equals(password)){
        return true;
        }

        return false;
        }*/