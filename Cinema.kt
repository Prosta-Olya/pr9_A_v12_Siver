open class Cinema (
    val movieTitle: String, // название кинофильма
    val showTime: String, // сеанс (время)
    val ticketPrice: Double, // стоимость билета
    val hall: String, // зал
    var audienceCount: Int // количество зрителей
){
    fun BuyTicket() {
        audienceCount++
        println("Билет на '$movieTitle' куплен. Количество зрителей: $audienceCount.")
    }

    fun Info() {
        println("Фильм: $movieTitle, Сеанс: $showTime, Стоимость билета: $ticketPrice руб., Зал: $hall, Зрителей: $audienceCount")
    }

    fun EnjoyWatching(){
        println("Приятного просмотра!")
    }
}