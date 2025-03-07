fun main(){
    try {
        println("Введите информацию о вашем сеансе:")
        println("Зал:")
        val hallNumber = readLine()!!.toInt()
        if(hallNumber<=0){
            println("Зал с таким номером не существует")
        }
        else{
            val hall = when(hallNumber){
                1 -> "Премиум зал"
                2 -> "3D зал"
                else -> "Обычный зал"
            }
            println("Название кинофильма:")
            val movieTitle = readLine()!!.toString()
            println("Время сеанса:")
            val showTime = readLine()!!.toString()
            println("Стоимость билета:")
            val ticketPrice = readLine()!!.toDouble()
            println("Количество зрителей на данный момент:")
            val audienceCount = readLine()!!.toInt()
            if(ticketPrice <= 0 || audienceCount <= 0){
                println("Ошибка")
                return
            }
            if(hall == "Премиум зал"){
                println("В вашем билете есть доступ в зал ожидания? \n 1 - Да \n 2 - Нет")
                val lounge = readLine()!!.toInt()
                val loungeAccess = when(lounge){
                    1 -> true
                    2 -> false
                    else -> return
                }
                val cinema = PremiumCinema(movieTitle, showTime, ticketPrice, hall, audienceCount, loungeAccess)
                println("Сколько билетов вы хотите купить?")
                val ticket = readLine()!!.toInt()
                if(ticket>0)
                {
                    for (i in 1..ticket) {
                        cinema.BuyTicket()
                    }
                }
                cinema.Info()
                cinema.Lounge()
                cinema.Food()
                cinema.VipSeating()
                cinema.EnjoyWatching()
            }
            else if(hall == "3D зал"){
                println("В вашем билете включены 3D очки? \n 1 - Да \n 2 - Нет")
                val glasses = readLine()!!.toInt()
                val glassesIncluded = when(glasses){
                    1 -> true
                    2 -> false
                    else -> return
                }
                val cinema = ThreeDCinema(movieTitle, showTime, ticketPrice, hall, audienceCount, glassesIncluded)
                println("Сколько билетов вы хотите купить?")
                val ticket = readLine()!!.toInt()
                if(ticket>0)
                {
                    for (i in 1..ticket) {
                        cinema.BuyTicket()
                    }
                }
                cinema.Info()
                cinema.Glasses()
                cinema.SpecialEffect()
                cinema.PremiumExperience()
                cinema.EnjoyWatching()
            }
            else{
                val cinema = Cinema(movieTitle, showTime, ticketPrice, hall, audienceCount)
                println("Сколько билетов вы хотите купить?")
                val ticket = readLine()!!.toInt()
                if(ticket>0)
                {
                    for (i in 1..ticket) {
                        cinema.BuyTicket()
                    }
                }
                cinema.Info()
                cinema.EnjoyWatching()
            }
        }
    }
    catch (e:Exception){
        println("Некорректный ввод")
    }
}