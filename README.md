# continents microservice

This project serves as an external REST API client to the [***countries-microservice***](https://github.com/DRodrigoBL/countries-microservice)


This project was built just with one file: ***ContinentsApplication.kt*** 

```kotlin
@SpringBootApplication  
class ContinentsApplication  
  
fun main(args: Array<String>) {  
   runApplication<ContinentsApplication>(*args)  
}  
 
@RestController  
class ContinentsController{  
   @GetMapping("/api/v1/continents")  
   fun getAvailableContinents(): ResponseEntity<AvailableContinentsResponse>{  
      return ResponseEntity.ok(AvailableContinentsResponse(listOf("NORTH_AMERICA", "EUROPE")))  
   }  
}   
data class AvailableContinentsResponse (val availableContinents: List<String>)
```

### Run the project
```groovy
$ gradle bootRun
```