<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tradutor - Poli-Libras</title>
<script src="scripts/deployJava.js"></script>
<script src="scripts/prototype.js"></script>
<link href="css/polilibras.css" rel="stylesheet" type="text/css">

<script>
  function traduzir(idEntrada, idSaida) {
      var texto = $(idEntrada).value;
      new Ajax.Request('translator', {
          method: 'post',
          parameters: {texto: texto},
          onSuccess: function(response) {
              $(idSaida).update(texto);
              document.applets['VirtualJonah'].loadSignsFromXmlString(response.getHeader('signsXmlString'));
              document.applets['VirtualJonah'].playSigns();
          }
      });
  }
</script>
</head>
<body>

  <h1>Tradutor Poli-Libras</h1>
  
  <div class="leftPanel">
    <div class="form">
      <textarea id="texto" rows="5" cols="40" name="texto" placeholder="Escreva seu texto aqui"></textarea>
      <br>
      <input type="button" value="Traduzir" onclick="traduzir('texto','fraseTraduzida')">
    </div>
    <div class="frase">
      Frase traduzida:
      <div id="fraseTraduzida"><!-- Preenchido por Ajax --></div>
    </div>
    <div class="ajuda">
      <p>Pressione y para reproduzir a tradução.</p>
      <p>Pressione espaço para reproduzir 1 sinal por vez. </p>
    </div>
  </div>
  <div class="virtualJonah">
    <script>
      var attributes = { id:'VirtualJonah',
                        code:'br.usp.libras.jonah.VirtualJonah.class',
                        archive: 'applets/VirtualJonah.jar',
                        width: '800', 
                        height: '600'};
      var parameters = {java_arguments: '-Xmx256m'}; // customize per your needs
      var version = '1.5' ; // JDK version
      deployJava.runApplet(attributes, parameters, version);
    </script>
  </div>
</body>
</html>