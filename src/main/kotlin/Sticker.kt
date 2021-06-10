class Sticker(
    override val type: String,
    val stickerId: Int? = null,
    val isAllowed: Boolean? = null
) : Attachment {

}