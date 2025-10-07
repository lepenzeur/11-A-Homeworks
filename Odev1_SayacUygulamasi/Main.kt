fun main() {
    var counter = 10
    val simulatedInputs = listOf("+", "+", "-", "0", "q") // Tarayıcıda kullanıcının girdiği gibi simüle ediyoruz
    for (choice in simulatedInputs) {
        println("Mevcut sayaç değeri: $counter")
        println("Seçiminiz: $choice")

        when (choice) {
            "+" -> counter++
            "-" -> counter--
            "0" -> counter = 0
            "q" -> {
                println("Program bitti!")
                break
            }
            else -> println("Geçersiz seçim")
        }
    }
}