#language:es

Característica: Validar funcionalidad dashboard

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal

  @Dashboard  @Regresion @PlanQuinquenalHD
  Esquema del escenario: Validar plan quinquenal casos de prueba
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña plan quinquenal
    Cuando el usuario ingresa datos de consulta
      | plan      | <plan>      |
      | periodoPQ | <periodoPQ> |
      | anPQ      | <anPQ>      |
      | material  | <material>  |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                          | actor   | plan       | periodoPQ | anPQ | material |
      | TC533 - Validar plan quinquenal con material AC    | cliente | Quinquenal | 2022-2026 |      | AC       |
      | TC534 - Validar plan quinquenal con material PE    | cliente | Quinquenal | 2022-2026 |      | PE       |
      | TC535 - Validar plan quinquenal con material Otros | cliente | Quinquenal | 2022-2026 |      | Otros    |

  @Dashboard  @Regresion @PlanAnualHD
  Esquema del escenario: Validar dashboard plan anual casos de prueba
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña plan quinquenal
    Cuando el usuario ingresa datos de consulta plan anual
      | plan     | <plan>     |
      | PA       | <PA>       |
      | material | <material> |
    Entonces visualizo grafica de resultados
    Ejemplos:
      | test_case                                     | actor   | plan  | PA   | material |
      | TC536 - Validar plan anual con material AC    | cliente | Anual | 2022 | AC       |
      | TC537 - Validar plan anual con material PE    | cliente | Anual | 2022 | PE       |
      | TC538 - Validar plan anual con material Otros | cliente | Anual | 2022 | Otros    |


  @Dashboard  @Regresion @PlanQuinquenalCD
  Esquema del escenario: Validar dashboard Avance Construcción - Distrito plan quinquenal
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Cuando Doy click en pestaña Avance Construcciòn - Distrito
    Cuando el usuario ingresa datos de consulta Construcciòn - Distrito
      | plan      | <plan>      |
      | periodoPQ | <periodoPQ> |
      | anPQ      | <anPQ>      |
      | material  | <material>  |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                          | actor   | plan       | periodoPQ | anPQ | material |
      | TC539 - Validar plan quinquenal con material AC    | cliente | Quinquenal | 2022-2026 |      | AC       |
      | TC541 - Validar plan quinquenal con material PE    | cliente | Quinquenal | 2022-2026 |      | PE       |
      | TC542 - Validar plan quinquenal con material Otros | cliente | Quinquenal | 2022-2026 |      | Otros    |
