class Album(
    override val type: String,
    val id: Int? = null,
    val title: String? =  null,
    val description: String? = null
) : Attachment {
}