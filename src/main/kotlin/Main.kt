fun main () {
    val post1 = Post(id = 11)
    val post2 = Post(id = 11, text = "NEW TEXT")

    val comment1 = Comment(10, "Новые новости!" )

    Wallservice.add(post1)
    Wallservice.update(post2)

    Wallservice.createComment(comment1,0)
    println(comment1.text)








}