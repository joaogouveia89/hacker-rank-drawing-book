import kotlin.math.ceil
import kotlin.math.floor



fun pageCount(n: Int, p: Int): Int {
    val range = if(n % 2 == 0){
        if(n / 2 >= p){
            arrayOf(0, p)
        }else{
            arrayOf(p, n)
        }
    }else{
        if(n / 2.toFloat() > p){
            arrayOf(1, p)
        }else{
            arrayOf(p, n-1)
        }
    }

    val diff = range[1] - range[0]

    return if(range[0] == 0){
        floor(diff/2.toFloat()).toInt()
    }else{
        ceil(diff / 2.toFloat()).toInt()
    }
}