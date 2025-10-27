#language:es
Característica: Validar funcionalidad plan quinquenal pestaña Plan Quinquenal mas filtros

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu Plan Quinquenal
    Cuando Doy click en pestaña plan quinquenal
    Y Doy click en mas filtros

  @PlanQuinquenal @Regresion @TC577 @TC587
  Esquema del escenario: Filtro periodo PQ
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa descripciòn
      | descripcion | <descripcion> |
    Y doy click en aplicar mas filtros
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                         | descripcion |
      | TC577 - Filtro  por descripción   | PQC_14_18   |
      | TC587 - Validar  link mas filtros | PQC_14_18   |


  @PlanQuinquenal @Regresion @TC578
  Esquema del escenario: Filtro  por fecha de registro
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso fecha de registro
      | fechaRegistro | <fechaRegistro> |
    Y doy click en aplicar mas filtros
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                             | fechaRegistro |
      | TC578 - Filtro  por fecha de registro | 30-11-2023    |

  @PlanQuinquenal @Regresion @TC579
  Esquema del escenario: Filtro  por usuario que registro
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso usuario que registro
      | usuRegistro | <usuRegistro> |
    Y doy click en aplicar mas filtros
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                                | usuRegistro                 |
      | TC579 - Filtro  por usuario que registro | Administrador Administrador |