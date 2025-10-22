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


  @Dashboard  @Regresion @PlanAnualCD
  Esquema del escenario: Validar dashboard plan anual Construcciòn - Distrito
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Cuando Doy click en pestaña Avance Construcciòn - Distrito
    Cuando el usuario ingresa datos plan anual de consulta Construcciòn - Distrito
      | plan     | <plan>     |
      | PA       | <PA>       |
      | material | <material> |
    Entonces visualizo grafica de resultados
    Ejemplos:
      | test_case                                     | actor   | plan  | PA   | material |
      | TC543 - Validar plan anual con material AC    | cliente | Anual | 2022 | AC       |
      | TC544 - Validar plan anual con material PE    | cliente | Anual | 2022 | PE       |
      | TC545 - Validar plan anual con material Otros | cliente | Anual | 2022 | Otros    |


  @Dashboard  @Regresion @PlanQuinquenalHabP
  Esquema del escenario: Validar plan quinquenal Avance Habilitación - Periodo
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña Habilitación - Periodo
    Cuando el usuario ingresa datos de consulta Habilitación - Periodo
      | plan      | <plan>      |
      | periodoPQ | <periodoPQ> |
      | anPQ      | <anPQ>      |
      | material  | <material>  |
      | categoria | <categoria> |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                                                | actor   | plan       | periodoPQ | anPQ | material | categoria |
      | TC546 - Validar plan quinquenal con material AC y categoría inversión    | cliente | Quinquenal | 2022-2026 |      | AC       | Inversion |
      | TC548 - Validar plan quinquenal con material PE y categoría inversión    | cliente | Quinquenal | 2022-2026 |      | PE       | Inversion |
      | TC549 - Validar plan quinquenal con material otros y categoría inversión | cliente | Quinquenal | 2022-2026 |      | Otros    | Inversion |
      | TC550 - Validar plan quinquenal con material AC y categoría inversión    | cliente | Quinquenal | 2022-2026 |      | AC       | Longitud  |
      | TC551 - Validar plan quinquenal con material PE y categoría longitud     | cliente | Quinquenal | 2022-2026 |      | PE       | Longitud  |
      | TC552 - Validar plan quinquenal con material Otros y categoría longitud  | cliente | Quinquenal | 2022-2026 |      | Otros    | Longitud  |


  @Dashboard  @Regresion @PlanAnualHabP
  Esquema del escenario: Validar plan anual Avance Habilitación - Periodo
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña Habilitación - Periodo
    Cuando el usuario ingresa datos de consulta plan anual Habilitación - Periodo
      | plan      | <plan>      |
      | pa        | <pa>         |
      | material  | <material>  |
      | categoria | <categoria> |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                                           | actor   | plan  | pa   | material | categoria |
      | TC553 - Validar plan anual con material AC y categoría inversión    | cliente | Anual | 2023 | AC       | Inversion |
      | TC554 - Validar plan anual con material PE y categoría inversión    | cliente | Anual | 2023 | PE       | Inversion |
      | TC555 - Validar plan anual con material otros y categoría inversión | cliente | Anual | 2023 | Otros    | Inversion |
      | TC556 - Validar plan anual con material AC y categoría longitud     | cliente | Anual | 2023 | AC       | Longitud  |
      | TC557 - Validar plan anual con material PE y categoría longitud     | cliente | Anual | 2023 | PE       | Longitud  |
      | TC558 - Validar plan anual con material Otros y categoría longitud  | cliente | Anual | 2023 | Otros    | Longitud  |


  @Dashboard  @Regresion @PlanAnualCP
  Esquema del escenario: Validar plan anual Avance Construcciòn - Periodo
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña Construcciòn - Periodo
    Cuando el usuario ingresa datos de consulta plan anual Construcciòn - Periodo
      | plan     | <plan>     |
      | pa       | <pa>       |
      | material | <material> |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                     | actor   | plan  | pa   | material |
      | TC563 - Validar plan anual con material AC    | cliente | Anual | 2023 | AC       |
      | TC565 - Validar plan anual con material PE    | cliente | Anual | 2023 | PE       |
      | TC564 - Validar plan anual con material Otros | cliente | Anual | 2023 | Otros    |

  @Dashboard  @Regresion @PlanQuinquenalCP
  Esquema del escenario: Validar plan quinquenal Avance Construcciòn - Periodo
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña Construcciòn - Periodo
    Cuando el usuario ingresa datos de consulta plan quinquenal Construcciòn - Periodo
      | plan      | <plan>      |
      | periodoPQ | <periodoPQ> |
      | AnPQ      | <AnPQ>      |
      | material  | <material>  |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                     | actor   | plan       | periodoPQ | AnPQ | material |
      | TC563 - Validar plan anual con material AC    | cliente | Quinquenal | 2022-2026 | 2023 | AC       |
      | TC565 - Validar plan anual con material PE    | cliente | Quinquenal | 2022-2026 | 2023 | PE       |
      | TC564 - Validar plan anual con material Otros | cliente | Quinquenal | 2022-2026 | 2023 | Otros    |


  @Dashboard  @Regresion @PlanQuinquenalPD
  Esquema del escenario: Validar plan quinquenal Avance permiso - Distrito
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña Permiso - Distrito
    Cuando el usuario ingresa datos de consulta plan quinquenal permiso - Distrito
      | plan      | <plan>      |
      | periodoPQ | <periodoPQ> |
      | AnPQ      | <AnPQ>      |
      | material  | <material>  |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                          | actor   | plan       | periodoPQ | AnPQ | material |
      | TC569 - Validar plan quinquenal con material AC    | cliente | Quinquenal | 2022-2026 | 2023 | AC       |
      | TC567 - Validar plan quinquenal con material PE    | cliente | Quinquenal | 2022-2026 | 2023 | PE       |
      | TC568 - Validar plan quinquenal con material Otros | cliente | Quinquenal | 2022-2026 | 2023 | Otros    |

  @Dashboard  @Regresion @PlanAnualPD
  Esquema del escenario: Validar plan anual Avance Permiso - Distrito
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando el usuario ingresa las credenciales para autenticacion
      | actor | <actor> |
    Dado el usuario selecciona menu dashboard
    Y el usuario selecciona pestaña Permiso - Distrito
    Cuando el usuario ingresa datos de consulta plan anual Permiso - Distrito
      | plan     | <plan>     |
      | pa       | <pa>       |
      | material | <material> |
    Entonces visualizo grafica de resultados

    Ejemplos:
      | test_case                                     | actor   | plan  | pa   | material |
      | TC570 - Validar plan anual con material AC    | cliente | Anual | 2023 | AC       |
      | TC572 - Validar plan anual con material PE    | cliente | Anual | 2023 | PE       |
      | TC571 - Validar plan anual con material Otros | cliente | Anual | 2023 | Otros    |