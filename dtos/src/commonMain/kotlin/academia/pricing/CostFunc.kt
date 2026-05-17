package academia.pricing

import kotlinx.serialization.Serializable

/**
 * This class is modeling a linear equation y = c + mx
 *
 * where
 * c - fixed
 * m - variable
 * x - will be the number of students
 */
@Serializable
data class CostFunc(
    val f: Int,
    val v: Int
) {
    companion object {
        val Zero by lazy { CostFunc(0, 0) }
    }
}