class PremiumCinema(
    movieTitle: String,
    showTime: String,
    ticketPrice: Double,
    hall: String,
    audienceCount: Int,
    val loungeAccess: Boolean // дополнительное поле для премиум кинотеатра - наличие доступа в зал ожидания
) : Cinema(movieTitle, showTime, ticketPrice, hall, audienceCount){
    fun Lounge() {
        if (loungeAccess)
        {
            println("Зрители имеют доступ в зал ожидания до начала сеанса")
        }
        else
        {
            println("Зрители не имеют доступа в зал ожидания")
        }
    }

    fun Food() {
        println("В нашем премиум кинотеатре предлагаются эксклюзивные закуски и напитки!")
    }

    fun VipSeating() {
        println("У нас VIP места для максимального комфорта!")
    }
}