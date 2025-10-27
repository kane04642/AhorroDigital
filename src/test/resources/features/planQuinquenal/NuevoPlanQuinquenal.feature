#language:es
Característica: Validar funcionalidad plan quinquenal nuevo plan quinquenal

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu Plan Quinquenal
    Cuando Doy click en pestaña plan quinquenal
    Y doy click en boton nuevo registro

  @PlanQuinquenal @Regresion @TC581 @TC585
  Esquema del escenario: Acciones nuevo plan quinquenal
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso los datos del nuevo plan quinquenal
      | periodoPQ    | <periodoPQ>    |
      | estadoAproba | <estadoAproba> |
      | aprobaciones | <aprobaciones> |
      | descripcion  | <descripcion>  |
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                                      | periodoPQ | estadoAproba | aprobaciones | descripcion  |  |
      | TC581 - Acciones nuevo plan quinquenal         | 2016-2018 | APROBADO     | 11-12-2023   | estadoAproba |  |
      | TC585 - Nuevo plan quinquenal estado pendiente | 2016-2018 | PENDIENTE    | 11-12-2023   | estadoAproba |  |

  @PlanQuinquenal @Regresion @TC583
  Esquema del escenario: Nuevo plan quinquenal - Campos obligatorios
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso los datos del nuevo plan quinquenal
      | periodoPQ    | <periodoPQ>    |
      | estadoAproba | <estadoAproba> |
      | aprobaciones | <aprobaciones> |
      | descripcion  | <descripcion>  |
    Entonces Valido mensaje ingreso codigo de proyecto
    Ejemplos:
      | test_case                                           | periodoPQ | estadoAproba | aprobaciones | descripcion  |  |
      | TC583 - Nuevo plan quinquenal - Campos obligatorios |           | Seleccionar  | 11-12-2023   | estadoAproba |  |

  @PlanQuinquenal @Regresion @TC584
  Esquema del escenario: Nuevo plan quinquenal estado aprobado es obligatorio
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso los datos del nuevo plan quinquenal
      | periodoPQ    | <periodoPQ>    |
      | estadoAproba | <estadoAproba> |
      | aprobaciones | <aprobaciones> |
      | descripcion  | <descripcion>  |
    Entonces Valido mensaje estado aprobacion es obligatorio
    Ejemplos:
      | test_case                                     | periodoPQ | estadoAproba | aprobaciones | descripcion  |  |
      | TC584 - Nuevo plan quinquenal estado aprobado | 2012-2013 | Seleccionar  | 11-12-2023   | estadoAproba |  |