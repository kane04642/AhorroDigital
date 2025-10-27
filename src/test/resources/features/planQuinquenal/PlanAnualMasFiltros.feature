#language:es
Característica: Validar funcionalidad plan quinquenal pestaña Plan anual mas filtros

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu Plan Quinquenal
    Cuando Doy click en pestaña plan anual
    Y Doy click en mas filtros

  @PlanQuinquenal @Regresion @TC596 @TC606
  Esquema del escenario: Filtro periodo PQ
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa descripciòn
      | descripcion | <descripcion> |
    Y doy click en aplicar mas filtros
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                         | descripcion |
      | TC596 - Filtro  por descripción   | PQC_14_18   |
      | TC606 - Validar  link mas filtros | PQC_14_18   |


  @PlanQuinquenal @Regresion @TC597
  Esquema del escenario: Filtro  por fecha de registro
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso fecha de registro
      | fechaRegistro | <fechaRegistro> |
    Y doy click en aplicar mas filtros
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                            | fechaRegistro |
      | TC597 - Filtro  por fecha de registro | 30-11-2023    |

  @PlanQuinquenal @Regresion @TC598
  Esquema del escenario: Filtro  por usuario que registro
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso usuario que registro
      | usuRegistro | <usuRegistro> |
    Y doy click en aplicar mas filtros
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                               | usuRegistro                 |
      | TC598 - Filtro  por usuario que registro | Administrador Administrador |