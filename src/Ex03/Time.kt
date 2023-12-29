package Ex03

class Time( hour : Int = 0 , minute : Int =0) {
    var hour = hour
        set(value) {
            if (isValidHour(value)==false)
                throw InvalidHourException("Invalid hour ${value} !!!")
            field = value
        }

    var munite = minute
        set(value) {
            if (isValidMinute(value)==false)
                throw InvalidMinuteException("Invalid munite ${value} !!!")
            field = value
        }

   fun isValidMinute(minute: Int): Boolean{
       return if (minute !in 0..59)
          false
       else return true

    }
    fun isValidHour(hour: Int): Boolean{
       return if (hour !in 0..23)
          false
       else return true

    }

    override fun toString(): String {
        return "$hour:$munite"
    }
    fun  addHours(h: Int){
        var hour=this.hour+h
    }



}