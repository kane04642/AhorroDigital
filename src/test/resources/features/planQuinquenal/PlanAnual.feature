#language:es
Característica: Validar funcionalidad plan quinquenal - pestaña plan anual

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu Plan Quinquenal
    Cuando Doy click en pestaña plan anual

  @PlanQuinquenal @Regresion @TC593
  Esquema del escenario: Filtro estado de aprobación
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso estado de aprobaciòn
      | estadoAprobacion | <estadoAprobacion> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                           | estadoAprobacion |
      | TC593 - Filtro estado de aprobación | APROBADO         |

  @PlanQuinquenal @Regresion @TC595
  Esquema del escenario:Filtro usuario que modificó
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso usuario modifica
      | usuarioMod | <usuarioMod> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                           | usuarioMod                  |
      | TC595 - Filtro usuario que modificó | Administrador Administrador |

  @PlanQuinquenal @Regresion @TC605
  Esquema del escenario:Validar botón limpiar
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso usuario modifica
      | usuarioMod | <usuarioMod> |
    Y doy click en boton limpiar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                     | usuarioMod                  |
      | TC605 - Validar botón limpiar | Administrador Administrador |

  @PlanQuinquenal @Regresion @TC594
  Esquema del escenario: Filtro fecha de modificación
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando Ingreso fecha de modificacion
      | fechaModificacion | <fechaModificacion> |
    Y doy click en aplicar
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                           | fechaModificacion |
      | TC594 - Filtro fecha de modificación | 30-11-2023        |