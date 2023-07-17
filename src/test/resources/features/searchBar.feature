#language: es
Característica: Validar la busqueda correcta de una palabra en la barra de busqueda
  Esquema del escenario: Buscar la palabra en la barra de busqueda
    Dado que el usuario  requiere buscar una palabra a la pagina Wikipedia
    Cuando se el ingrese la "<palabra>" a la barra de busqueda
    Entonces el debe ver el titulo del articulo la palabra buscada
    Ejemplos:
    |palabra|
    |Sistema|