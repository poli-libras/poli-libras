package br.usp.polilibras.web;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import br.usp.libras.sign.Sign;
import br.usp.libras.translator.Translator;
import br.usp.libras.xml.XMLWriter;

/**
 * Utiliza a API tradutor para traduzir a frase fornecida pelo usuário Devolve a sequência de sinais para a view
 */
@WebServlet("/translator")
public class TranslatorServ extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        String text = request.getParameter("texto");
        System.out.println("Entrada: " + text);

        if (text == null) {
        	System.err.println("Invalid received text null");
        	return;
        }

        List<Sign> signs = translate(text);

        for (Sign sign : signs) {
            System.out.println(sign.getName());
        }

        String xml = signsToXml(signs);
        
        response.setHeader("signsXmlString", xml);
    }

	private List<Sign> translate(String text) {
		Translator translator = new Translator();
        List<Sign> signs = translator.translate(text);
        translator.setVerbose();
		return signs;
	}

	private String signsToXml(List<Sign> signs) {
		StringWriter writer = new StringWriter();
		try {
			XMLWriter.writeXML(signs, writer);
		} catch (JAXBException e) {
			System.err.println("Invalid retrieved signs, cannot be written in XML");
		}
		String xml = writer.getBuffer().toString();
		return xml;
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    
}
