# language: es

Característica: Busqueda de la palabra prueba en Google
  Como usuario del motor de busqueda google
  Quiero realizar una busqueda en google utilizando una palabra escritamente incorrecta
  Para verificar que el navegador me muestre la palabra correcta y la lista de resultados
  de busqueda con esta palabra


  Esquema del escenario: scenario: Buscar en el motor de busqueda google la palabra pruebas pero ingresando como palabra de busqueda   la palabra pruebaz
    Dado que ingrese al motor de búsqueda Google <URL>
    Cuando cuando ejecuto la búsqueda de la palabra <palabra_incorrecta>
    Entonces el motor de búsqueda  google me muestra la palabra correcta <palabra_correcta>
    Y el link de la palabra correcta carga la búsqueda con una cantidad de resultados mayor a <total>
    Ejemplos:
      | URL                      | palabra_incorrecta|palabra_correcta|total|
      | https://www.google.com.co| pruebaz           |pruebas         |6    |