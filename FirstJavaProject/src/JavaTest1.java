import java.nio.file.Paths;
import org.xml.sax.SAXException;





import java.util.Properties;
import java.util.ResourceBundle;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.lang.Exception;
import org.w3c.dom.NamedNodeMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

public class JavaTest1 {
		
		public void parse(String xmlFile) {
			try(InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
				DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				Node root = builder.parse(is);
				readRecursive(root);
			} catch (ParserConfigurationException | IOException | SAXException ex) {
				//��O�����͏ȗ�
			}
		}
		
		public void readRecursive(Node node) {
			Node child = node.getFirstChild();
			while (child != null) {
				printNode(child);
				NamedNodeMap attributes = child.getAttributes();
				if(attributes != null) {
					for(int index = 0; index < attributes.getLength(); index++) {
						Node attribute = attributes.item(index);
						System.out.println("Attributee:");
						printNode(attribute);
					}
				}
			}
			readRecursive(child);
			child = child.getNextSibling();
		}
		
		private void printNode(Node node) {
			System.out.println(node.getNodeName() + "=" + node.getNodeValue());
		}
}
	