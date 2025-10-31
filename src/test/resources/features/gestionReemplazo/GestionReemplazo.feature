#language:es
Característica: Validar funcionalidad gestiòn de reemplazo - impedimentos

  Antecedentes:
    Dado el usuario navega a la pagina plan quinquenal
    Cuando el usuario ingresa las credenciales para autenticacion como "cliente"
    Dado el usuario selecciona menu gestion de reemplazo
    Cuando Doy click en pestaña impedimentos

  @GestionReemplazo @Regresion @TC609
  Esquema del escenario: Búsqueda por código de proyecto
    Dado que se ejecuta el caso de prueba "<test_case>"
    Cuando ingreso datos de busqueda
      | codigoProyecto | <codigoProyecto> |
      | distrito       | <distrito>       |
      | AnPA           | <AnPA>           |
      | inversion      | <inversion>      |
      | impedimentos   | <impedimentos> |
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                                      | codigoProyecto | distrito    | AnPA        | inversion | impedimentos |
      | TC609 - Búsqueda por código de proyecto        | 2016           | ANCON       | 2023        | 200       | 580          |
      | TC610 - Búsqueda por distrito                  |                | ANCON       | Seleccionar |           |              |
      | TC618 - Búsqueda por año PA                    |                | Seleccionar | 2023        |           |              |
      | TC620 - Búsqueda por inversión                 |                | Seleccionar | Seleccionar | 200       | 580          |
      | TC621 - Búsqueda por Long. de Impedimentos (m) |                | Seleccionar | Seleccionar |           | 580          |


  @GestionReemplazo @Regresion @TC622
  Esquema del escenario: Búsqueda por por mas filtros
    Dado que se ejecuta el caso de prueba "<test_case>"
    Y Doy click en link mas filtros
    Cuando ingreso datos de busqueda mas filtros
      | codigoMalla       | <codigoMalla>       |
      | Constructor       | <Constructor>       |
      | causalReemplazo   | <causalReemplazo>   |
      | ingResponsable    | <ingResponsable>    |
      | problemaReal      | <problemaReal>      |
      | estrato1          | <estrato1>          |
      | estrato2          | <estrato2>          |
      | estrato3          | <estrato3>          |
      | estrato4          | <estrato4>          |
      | estrato5          | <estrato5>          |
      | longImpedimentos  | <longImpedimentos>     |
      | longReemplazo     | <longReemplazo>     |
      | fechaPreReem      | <fechaPreReem>      |
      | fechaRegistro     | <fechaRegistro>     |
      | nReemplazo        | <nReemplazo>        |
      | valiCargoPlanos   | <valiCargoPlanos>   |
      | valiCargoSusPermi | <valiCargoSusPermi> |
      | valiCargoSusRRCC  | <valiCargoSusRRCC>  |
      | validaLegal       | <validaLegal>       |
      | importancia       | <importancia>       |
      | usuResponsables   | <usuResponsables>   |
    Entonces Valido se genera consulta

    Ejemplos:
      | test_case                                                | codigoMalla | Constructor | causalReemplazo | ingResponsable              | problemaReal       | estrato1 | estrato2 | estrato3 | estrato4 | estrato5 | longReemplazo | fechaPreReem | fechaRegistro | nReemplazo       | valiCargoPlanos | valiCargoSusPermi | valiCargoSusRRCC | validaLegal | importancia | usuResponsables             | longImpedimentos |
      | TC622 - Búsqueda por código de malla                     | GN          | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC623 - Búsqueda por constructor                         |             | SYE         | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC624 - Búsqueda por causal de reemplazo                 |             | Seleccionar | OTROS           | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC625 - Búsqueda por ingeniero responsable               |             | Seleccionar | Seleccionar     | Administrador Administrador | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC626 - Búsqueda por problemática real                   |             | Seleccionar | Seleccionar     | Seleccionar                 | DEMORA DE PERMISOS |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC627 - Búsqueda por estrato 1                           |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        | 1        |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC628 - Búsqueda por estrato 2                           |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          | 2        |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC629 - Búsqueda por estrato 3                           |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          | 3        |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC630 - Búsqueda por estrato 4                           |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          | 4        |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC631 - Búsqueda por estrato 5                           |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          | 5        |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC621 - Búsqueda por Long. de Impedimentos (m)           |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             | 200              |
      | TC632 - Búsqueda por Long. de Reemplazo (m)              |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          | 200           |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC633 - Búsqueda por Fecha Present. Reemplazo            |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               | 30-11-2023   |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC634 - Búsqueda por Fecha de Registro                   |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              | 30-11-2023    | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC635 - Búsqueda por N° Reemplazo                        |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | PRIMER REEMPLAZO | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC636 - Búsqueda por Validación Cargo Planos             |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Si              | Seleccionar       | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC637 - Búsqueda por Validación Cargo Sustentos Permisos |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Si                | Seleccionar      | Seleccionar | Seleccionar |                             |                  |
      | TC638 - Búsqueda por Validación Cargo Sustentos RRCC     |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | No               | Seleccionar | Seleccionar |                             |                  |
      | TC639 - Búsqueda por Validación Legal                    |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Conforme    | Seleccionar |                             |                  |
      | TC640 - Búsqueda por Importancia                         |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar  | Si          |                             |                  |
      | TC641 - Búsqueda por Usuarios Responsables               |             | Seleccionar | Seleccionar     | Seleccionar                 | Seleccionar        |          |          |          |          |          |               |              |               | Seleccionar      | Seleccionar     | Seleccionar       | Seleccionar      | Seleccionar  | Seeccionar  | Administrador Administrador |                  |

