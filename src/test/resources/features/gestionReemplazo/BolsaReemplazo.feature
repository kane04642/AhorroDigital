#language:es
Característica: Validar funcionalidad gestiòn de reemplazo - impedimentos

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu gestion de reemplazo
    Cuando Doy click en bolsa de reemplazo

  @GestionReemplazo @Regresion @TC648
  Esquema del escenario: Búsqueda por código de proyecto
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso datos de busqueda bolsa de reemplazo
      | codigoAnteProyecto | <codigoAnteProyecto> |
      | distrito           | <distrito>           |
      | constructor        | <constructor>        |
      | longReemplazo      | <longReemplazo>      |
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                                      | codigoAnteProyecto | distrito    | constructor | longReemplazo |
      | TC648 -   Búsqueda por código de ante proyecto | PPE0-21-2424       | Seleccionar | Seleccionar |               |

