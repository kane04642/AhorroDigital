#language:es
Característica: Validar funcionalidad plan quinquenal

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu Plan Quinquenal
    Cuando Doy click en pestaña plan quinquenal

  @PlanQuinquenal @Regresion @TC573
  Esquema del escenario: Filtro periodo PQ
    Dado que se ejecuta el caso de prueba "<test_case>"
      Cuando el usuario ingresa periodo
        | periodo | <periodo> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                         | periodo |
      | TC573 - Filtro periodo PQ y fecha | 2022    |

  @PlanQuinquenal @Regresion @TC574
  Esquema del escenario: Filtro estado de aprobación
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso estado de aprobaciòn
      | estadoAprobacion | <estadoAprobacion> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                           | estadoAprobacion |
      | TC574 - Filtro estado de aprobación | APROBADO         |

  @PlanQuinquenal @Regresion @TC575
  Esquema del escenario: Filtro fecha de modificación
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso fecha de modificacion
      | fechaModificacion | <fechaModificacion> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                            | fechaModificacion |
      | TC575 - Filtro fecha de modificación | 30-11-2023        |


  @PlanQuinquenal @Regresion @TC576
  Esquema del escenario:Filtro usuario que modificó
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso usuario modifica
      | usuarioMod | <usuarioMod> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                           | usuarioMod                  |
      | TC576 - Filtro usuario que modificó | Administrador Administrador |

  @PlanQuinquenal @Regresion @TC586
  Esquema del escenario:Validar botón limpiar
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso usuario modifica
      | usuarioMod | <usuarioMod> |
    Y doy click en boton limpiar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                     | usuarioMod                  |
      | TC586 - Validar botón limpiar | Administrador Administrador |