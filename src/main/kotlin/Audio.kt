class Audio(
    override val type: String,
    val id: Int? = null,
    val artist: String? = null,
    val title: String? = null
    ) : Attachment {
}