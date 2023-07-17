#language: es
Característica: Validar el correcto diligenciamento del formulario de creacion de usuario
  Esquema del escenario: Rellenar formulario de creacion de usuario
    Dado que el usuario requiere llenar el formulario de creacion de usuario
    Cuando el ingrese a la opcion de creacion de usuario
    Y el ingresen los datos en el formulario
      |<usuario>|<contrasena>|<email>|
    Entonces el ve un mensaje de validacion de captcha
    Ejemplos:
      |usuario|contrasena|email|
      |PepegrilloAuto96|Password123|correotest@test.com|