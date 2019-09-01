package com.pavel.banking.Banking.controller;

import com.pavel.banking.Banking.model.Currency;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpControler {

    static String getStringFromXML(Element eElement, String tagName){
        return eElement.getElementsByTagName(tagName).item(0).getTextContent();
    };

    public static void main(String[] args) throws Exception{
        try{
            URL url = new URL("http://www.lb.lt//webservices/FxRates/FxRates.asmx/getCurrentFxRates?tp=eu");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);

            }


                String xml = response.toString();

                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                InputSource inputSource = new InputSource(new StringReader(xml));
                Document doc = dBuilder.parse(inputSource);
                doc.getDocumentElement().normalize();

                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            System.out.println( doc.getElementsByTagName("FxRates").item(0).getTextContent());

                NodeList studentXmlElems = doc.getElementsByTagName("currencies");
                System.out.println("----------------------------");

                List<Currency> currencies = new ArrayList<Currency>();

                for (int temp = 0; temp < studentXmlElems.getLength(); temp++) {

                    Node nNode = studentXmlElems.item(temp);
                     System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                    }
                }
//            System.out.println(response.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}
