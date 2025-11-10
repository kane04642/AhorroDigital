#language:es

Característica: Login en aplicativo simulador

    Antecedentes:
    Dado el usuario navega a la pagina login

  @LoginOK @regresion
  Esquema del escenario: : Login Exitoso
    Cuando el usuario ingresa datos correctos del registro
      | actor       | <actor>       |
      | nombre      | <nombre>      |
      | email       | <email>       |
      | telefono    | <telefono>    |
      | pais        | <pais>        |
      | comentarios | <comentarios> |
    Entonces el usuario valida mensaje de creaciòn exitoso
    Ejemplos:
      | actor   | nombre | email             | telefono | pais     | comentarios |
      | cliente | Daniel | daniel@correo.com | 2287897  | Colombia | test        |

   @EmailError @regresion
  Esquema del escenario: Formato de email errado
    Cuando el usuario ingresa datos correctos del registro
      | actor       | <actor>       |
      | nombre      | <nombre>      |
      | email       | <email>       |
      | telefono    | <telefono>    |
      | pais        | <pais>        |
      | comentarios | <comentarios> |
    Entonces el usuario valida mensaje de email incorrecto
    Ejemplos:
      | actor   | nombre | email            | telefono | pais     | comentarios |
      | cliente | Daniel | danielcorreo.com | 2287897  | Colombia | test        |

  @NombreObli @regresion
  Esquema del escenario: Nombre de usuario es obligatorio
    Cuando el usuario ingresa datos correctos del registro
      | actor       | <actor>       |
      | nombre      | <nombre>      |
      | email       | <email>       |
      | telefono    | <telefono>    |
      | pais        | <pais>        |
      | comentarios | <comentarios> |
    Entonces el usuario valida mensaje nombre obligatorio
    Ejemplos:
      | actor   | nombre | email            | telefono | pais     | comentarios |
      | cliente |        | danielcorreo.com | 2287897  | Colombia | test        |