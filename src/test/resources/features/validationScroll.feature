#language: es
Característica: Validar la busqueda correcta de titulo despues de realizar scoll
  Esquema del escenario: Buscar la palabra despues de realizar barra de busqueda
    Dado que el usuario requiere buscar una palabra al hacer scroll en la pantalla
    Cuando se el usuario realice la busqueda del "<subtitulo>" cuando ingrese la "<palabra>" a la barra de busqueda
    Entonces el debe ver en el articulo el subtitulo buscado
    Ejemplos:
      |palabra|subtitulo|
      |Sistema|Análisis CEEM|