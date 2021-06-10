class Photo(
    override val type: String,
    val id: Int? = null,
    val albumId: Int? = null,
    val text: String? = null
) : Attachment {
}