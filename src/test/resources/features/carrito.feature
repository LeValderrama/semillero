#language:es

  Característica: buscar un producto y agregarlo al carrito
    Escenario: seleccionar el producto y agregarlo al carrito exitosamente
      Dado que el usuario ingresa a la pagina alkomprar
      Cuando realice la busqueda del producto
      Y selecciona el producto aleatoriamente
      Y agrega el producto al carrito
      Entonces se valida que se agrego al carrito exitosamente
