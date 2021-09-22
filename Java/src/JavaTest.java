import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.XMLStreamException;

import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.IOException;
import javax.xml.stream.XMLStreamConstants;
import 
javax.xml.stream.XMLStreamException;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import java.util.Iterator;
import javax.management.Attribute;
public class JavaTest {
	public void parse(String xmlFile) {
		try(InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLEventReader reader = factory.createXMLStreamReader(is);
			
			EventFilter filter = new EventFilter() {
				public boolean accept(XMLEvent event) {
					return event.isStartElement() || event.isCharacters();
				}
			};
			reader = factory.createFilteredReader(reader, filter);
			
			while (reader.hasNext()) {
				XMLEvent event = reader.nextEvent();
				
				if(event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					System.out.println("Name: " + startElement.getName());
					
					Iterator<Attribute> attributes = startElement.getAttributes();
					if(attributes.hasNext()) {
						System.out.println("Attribute:");
						
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							System.out.println(" Name: " + attribute.getName());
							System.out.println(" Value: " + attribute.getValue());
						}
					}
				} else if (event.isCharacters()) {
					Characters characters = event.asCharacters();
					String text = characters.getData().trim();
					if(!text.isEmpty()) {
						System.out.println("Text: " + text);
						System.out.println();
					}
				}
			}
		}catch (IOException | XMLStreamException ex) {
			
		}
	}
	public static void main(String[] args) {
		JavaTest xml = new JavaTest();
		xml.parse("test.xml");
	}
}

