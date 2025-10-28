#language:es
Característica: Validar funcionalidad plan quinquenal nuevo plan anual

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu Plan Quinquenal
    Cuando Doy click en pestaña plan anual
    Y doy click en boton nuevo registro

  @PlanQuinquenal @Regresion @TC600
  Esquema del escenario: Acciones nuevo plan anual
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso los datos del nuevo plan anual
      | anPA         | <anPA>    |
      | estadoAproba | <estadoAproba> |
      | aprobaciones | <aprobaciones> |
      | descripcion  | <descripcion>  |
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                                 | anPA | estadoAproba | aprobaciones | descripcion  |  |
      | TC600 - Acciones nuevo plan anual         | 2016 | APROBADO     | 11-12-2023   | estadoAproba |  |
      | TC604 - Nuevo plan anual estado pendiente | 2016 | PENDIENTE    | 11-12-2023   | estadoAproba |  |

  @PlanQuinquenal @Regresion @TC602
  Esquema del escenario: Nuevo plan anual - Campos obligatorios
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso los datos del nuevo plan anual
      | anPA         | <anPA>         |
      | estadoAproba | <estadoAproba> |
      | aprobaciones | <aprobaciones> |
      | descripcion  | <descripcion>  |
    Entonces Valido mensaje ingreso codigo de proyecto
    Ejemplos:
      | test_case                                      | anPA | estadoAproba | aprobaciones | descripcion  |  |
      | TC602 - Nuevo plan anual - Campos obligatorios |      | Seleccionar  | 11-12-2023   | estadoAproba |  |

  @PlanQuinquenal @Regresion @TC603
  Esquema del escenario: Nuevo plan anual estado aprobado es obligatorio
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso los datos del nuevo plan anual
      | anPA         | <anPA>         |
      | estadoAproba | <estadoAproba> |
      | aprobaciones | <aprobaciones> |
      | descripcion  | <descripcion>  |
    Entonces Valido mensaje estado aprobacion es obligatorio
    Ejemplos:
      | test_case                              | anPA | estadoAproba | aprobaciones | descripcion  |  |
      | TC603 - Nuevo plan anual estado aprobado | 2012 | Seleccionar  | 11-12-2023   | estadoAproba |  |