class Event(
    override val type: String,
    val id: Int? = null,
    val time: Int? = null,
    val address: String? = null
) : Attachment {
}