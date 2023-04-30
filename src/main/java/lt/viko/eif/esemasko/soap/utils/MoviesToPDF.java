package lt.viko.eif.esemasko.soap.utils;

import org.apache.fop.apps.*;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * This class has one method: convertToPDF
 *
 * @version 1.0
 * @since 1.0
 */
public class MoviesToPDF {
    /**
     * This is a convertToPDF method
     * <p>
     * This method converts data from XML file to PDF file format.
     *
     * @param fileName - new name for PDF file.
     * @throws IOException          - this exception occurs when using writing data into new PDF file.
     * @throws TransformerException - this exception occurs during transformation process of XML to PDF format.
     * @throws FOPException         - this exception occurs during transformation process PDF file.
     */
    public static void convertToPDF(String fileName) throws IOException, TransformerException, FOPException {
        File xsltFile = new File("moviesToPDF.xsl");
        StreamSource xmlSource = new StreamSource(new File("movies.xml"));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

        OutputStream out;
        out = new java.io.FileOutputStream(fileName);

        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            Result result = new SAXResult(fop.getDefaultHandler());

            transformer.transform(xmlSource, result);
        } finally {
            out.close();
        }

    }

}
