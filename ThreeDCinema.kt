class ThreeDCinema (
    movieTitle: String,
    showTime: String,
    ticketPrice: Double,
    hall: String,
    audienceCount: Int,
    val glassesIncluded: Boolean // дополнительное поле для 3D кинотеатра - включены ли очки
) : Cinema(movieTitle, showTime, ticketPrice, hall, audienceCount){
    fun Glasses() {
        if (glassesIncluded) {
            println("Очки для просмотра фильма в 3D формате включены в стоимость билета")
        } else {
            println("Очки для просмотра фильма в 3D формате не включены в стоимость билета")
        }
    }
    fun SpecialEffect() {
        println("На сеансе '$movieTitle' будут использованы специальные эффекты!")
    }
    fun PremiumExperience() {
        println("Премиум 3D опыт для зрителей!")
    }
}