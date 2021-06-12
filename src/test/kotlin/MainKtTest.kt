import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun add() {
        val post = Post(id = 0)
        val expected = 3
        Wallservice.add(post)
        val result = Wallservice.add(post).id
        assertEquals(expected, result)
    }

    @Test
    fun update_true() {
        val post1 = Post(id = 11)
        val post2 = Post(id = 0, text = "NEW TEXT")
        Wallservice.add(post1)
        val result = Wallservice.update(post2)
        assertTrue(result)

    }

    @Test
    fun update_false() {
        val post1 = Post(id = 11)
        val post2 = Post(id = 12, text = "Hello!")
        Wallservice.add(post1)
        val result = Wallservice.update(post2)
        assertFalse(result)

    }

    @Test
    fun shouldAddComment() {
        val postForComment1 = Post(1)
        val commentForTest1 = Comment(100, "Комментарий добавлен!")
        val expected = "Комментарий добавлен!"

        Wallservice.add(postForComment1)
        Wallservice.createComment(commentForTest1, 0)

        val result = commentForTest1.text

        assertEquals(expected, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val commentForTest2 = Comment(55, "Проверка!")
        Wallservice.createComment(commentForTest2, 42)
    }


}