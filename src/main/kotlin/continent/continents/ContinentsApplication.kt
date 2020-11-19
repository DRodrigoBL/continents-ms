package continent.continents

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

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
