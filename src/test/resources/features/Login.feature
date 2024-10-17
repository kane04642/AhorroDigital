Feature: Login Seguridad

  Como usuario de ti requiero ingresar las credenciales para ingresar al seguridad de SO

  Scenario Outline: Login Exitoso
    Given el usuario navega a la pagina autenticador
    When el usuario ingresa las credenciales para autenticacion
      | usuario  | <usuario>  |
      | password | <password> |
    Then el usuario espera la pagina de home
    Examples:
      | usuario          | password |
      | email0@email.com | asdasd   |

