#language: es
Característica: Validacion de historial y comparacion de revisiones
  Escenario: Ingreso al historial con su comparacion
    Dado que el usuario desea ingresar al historial
    Cuando selecciona el boton de historial
    Entonces Se debe mostrar la lista con radio buttons para comparar
    Cuando  el seleccione dos radio button realizar la comparacion
    Entonces el debe ver los campos de texto de la revision comparadas