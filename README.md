## SpringBoot - Dog ##

###El primer micro servicio### 
es de configuración y debe contener las urls a consumir por el segundo micro servicio.

###El segundo micro servicio### 
recibe como parámetro la raza a consultar y debe cumplir con lo siguiente:

Haciendo uso de la API publica: https://dog.ceo/dog-api/

Utilizar los siguientes endpoints:

- /api/breeds/list/all 
- /api/breed/{breed name}/images

Para retornar el siguiente JSON.
```json
{
"breed": {Breed},
"subBreeds":[
{subBreed},
{subBreed},
{subBreed}    
],
"images":[
{
"url":"http://some.url.com"
},
{
"url":"http://some.other.url"
}
]
}
```