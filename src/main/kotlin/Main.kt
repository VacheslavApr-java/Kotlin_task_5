fun main () {
    val post1 = Post(id = 11)
    val post2 = Post(id = 11, text = "NEW TEXT")

    Wallservice.add(post1)
    Wallservice.update(post2)






}