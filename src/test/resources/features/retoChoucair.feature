# Autor: Silvana Fernàndez
# language:es
@stories
Característica: Registrarse en la pagina de la comunidad de tester.
  Yo como usuario quiero tener la posibilidad de registrarme en la pagina de tester para ser parte de la comunidad
    @scenario1
    Esquema del escenario: Registrar un nuevo usuario
      Dado que Silvana quiere registrarse en la comunidad de tester
      Cuando ella diligencia el formulario con su informacion personal
        | nombre   | apellido   | email   | mes_Cumpleanio  | dia_cumpleanio   | anio_cumpleanio    | ciudad  |codigo_postal  | pais  |
        | <nombre> | <apellido> | <email> | <mes_Cumpleanio>| <dia_cumpleanio> | <anio_cumpleanio>  |<ciudad> |<codigo_postal>| <pais>|
      Entonces ella es un nuevo usuario en la pagina de tester

      Ejemplos:
        | nombre  | apellido  | email      | mes_Cumpleanio | dia_cumpleanio | anio_cumpleanio | ciudad   |codigo_postal | pais      |
        | Silvana | Fernandez | sil@gl.com | January        | 31             |1990             | Bogota   |19800         | Colombia  |