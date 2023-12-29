package Ex02

object singletonUtilities {

    fun addZeros(integer: Int, length: Int): String {
        var resultat: String = " "
        val size = integer.toString().length
        if (length == size)
            return integer.toString()
        else if (length > size)
            for (i in 0 until length-size)
                resultat += "0"

        return resultat + integer.toString()

    }
    fun splitUsingColon(str: String, partNumber: Int) :Any?{
        return null
    }


}