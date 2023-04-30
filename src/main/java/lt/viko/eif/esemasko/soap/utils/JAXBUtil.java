package lt.viko.eif.esemasko.soap.utils;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lt.viko.eif.esemasko.soap.MovieList;

import java.io.*;

/**
 * This class has one method: transformToXML
 *
 * @version 1.0
 * @since 1.0
 */
public class JAXBUtil {
    /**
     * This is a transformToXML method
     * <p>
     * This method marshalls movieList object into XML format.
     *
     * @param movieList - path to XML file.
     * @throws JAXBException         - this exception occurs when using JAXB to marshal a java object to xml format.
     * @throws FileNotFoundException - this exception occurs when in case XML file is not found.
     */
    public static void transformToXML(MovieList movieList) {
        try {
            JAXBContext context = JAXBContext.newInstance(MovieList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
            OutputStream os = new FileOutputStream("movies.xml");
            marshaller.marshal(movieList, System.out);
            marshaller.marshal(movieList, os);
        } catch (JAXBException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
