package br.usp.polilibras.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usp.libras.sign.Sign;
import br.usp.libras.translator.Translator;

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

        if (text != null) {

            // faz a tradução
            Translator translator = new Translator();
            List<Sign> signs = translator.translate(text);
            translator.setVerbose();

            for (Sign sign : signs) {
                System.out.println(sign.getName());
            }

            String dirName = "tmp";
            File dir = new File(this.getServletContext().getRealPath(dirName));
            if (!dir.exists()) {
                dir.mkdir();
            }

            String filename = "signs-" + request.getSession().getId() + "-" + System.currentTimeMillis() + ".txt";
            // gera xml
            File outputFile = new File(this.getServletContext().getRealPath(dirName + "/" + filename));
            FileOutputStream fos = new FileOutputStream(outputFile);
            ObjectOutputStream objw = new ObjectOutputStream(fos);
            objw.writeObject(signs.toArray(new Sign[0]));
            objw.close();
            fos.close();

            // String host = ResourceBundle.getBundle("conf").getString("host");
            //String host = "http://policidada.poli.usp.br";
            String host = "http://localhost:8080";
            String xmlUri = host + this.getServletContext().getContextPath() + "/" + dirName + "/" + filename;
            response.setHeader("xmlUri", xmlUri);
            System.out.println(xmlUri);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
