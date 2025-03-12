fun main(){
    try {
        println("Введите информацию о вашем сеансе:")
        println("Зал:")
        val hallNumber = readLine()!!.toInt()
        if(hallNumber<=0){
            println("Зал с таким номером не существует")
        }
        else{
            //println("Введите информацию о вашем сеансе (название кинофильма, время сеанса, стоимость билета, количество зрителей на данный момент")
            //var sitting:Cinema=Cinema(readln(), readln(), readLine()!!.toDouble(), readln(), readLine()!!.toInt())
            val hall = when(hallNumber){
                1 -> "Премиум зал"
                2 -> "3D зал"
                else -> "Обычный зал"
            }
            //premierzal.hall= readln()
            if(hall == "Премиум зал"){
                println("В вашем билете есть доступ в зал ожидания? \n 1 - Да \n 2 - Нет")
                val lounge = readLine()!!.toInt()
                val loungeAccess = when(lounge){
                    1 -> true
                    2 -> false
                    else -> return
                }
                println("Введите информацию о вашем сеансе (название кинофильма, время сеанса, стоимость билета, количество зрителей на данный момент")
                val cinema:PremiumCinema = PremiumCinema(readln(), readln(), readLine()!!.toDouble(), hall, readLine()!!.toInt(), loungeAccess)
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
                cinema.Cost()
                cinema.TotalCost(ticket)
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
                println("Введите информацию о вашем сеансе (название кинофильма, время сеанса, стоимость билета, количество зрителей на данный момент, формат фильма (сколько D)")
                val cinema:ThreeDCinema = ThreeDCinema(readln(), readln(), readLine()!!.toDouble(), hall, readLine()!!.toInt(), glassesIncluded, readLine()!!.toInt())
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
                cinema.Cost()
                cinema.TotalCost(ticket)
                cinema.SpecialEffect()
                cinema.PremiumExperience()
                cinema.EnjoyWatching()
            }
            else{
                val cinema:Cinema = Cinema(readln(), readln(), readLine()!!.toDouble(), hall, readLine()!!.toInt())
                println("Сколько билетов вы хотите купить?")
                val ticket = readLine()!!.toInt()
                if(ticket>0)
                {
                    for (i in 1..ticket) {
                        cinema.BuyTicket()
                    }
                }
                cinema.Info()
                cinema.TotalCost(ticket)
                cinema.EnjoyWatching()
            }
        }
    }
    catch (e:Exception){
        println("Некорректный ввод")
    }
}