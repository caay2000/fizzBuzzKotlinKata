import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val sut = FizzBuzz()

    @Test
    fun `starting test`() {
        assertThat(sut.fizzBuzz(1)).isEqualTo("1")
    }
}