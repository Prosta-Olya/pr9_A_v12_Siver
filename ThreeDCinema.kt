class ThreeDCinema (
    movieTitle: String,
    showTime: String,
    ticketPrice: Double,
    hall: String,
    audienceCount: Int,
    val glassesIncluded: Boolean, // дополнительное поле для 3D кинотеатра - включены ли очки
    val format: Int // дополнительное поле для 3D кинотеатра - формат сколько D
) : Cinema(movieTitle, showTime, ticketPrice, hall, audienceCount){
    fun Glasses() {
        if (glassesIncluded) {
            println("Очки для просмотра фильма в 3D формате включены в стоимость билета")
        } else {
            println("Очки для просмотра фильма в 3D формате не включены в стоимость билета")
        }
    }
    fun Cost(){
        if(format>5){
            ticketPrice = ticketPrice+300
        }
        else if(format>10){
            ticketPrice = ticketPrice+500
        }
        if(glassesIncluded){
            ticketPrice = ticketPrice+200
        }
        println("Итоговая стоимость: $ticketPrice")
    }
    fun SpecialEffect() {
        println("На сеансе '$movieTitle' будут использованы специальные эффекты!")
    }
    fun PremiumExperience() {
        println("Премиум 3D опыт для зрителей!")
    }
}