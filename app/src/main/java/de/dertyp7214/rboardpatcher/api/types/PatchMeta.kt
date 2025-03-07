package de.dertyp7214.rboardpatcher.api.types

data class PatchMeta(
    val url: String,
    val author: String,
    val tags: List<String>,
    val size: Long,
    val date: Long,
    val name: String,
    val font: String?,
    val description: String?
) {
    fun getSafeName() = url.split("/").last().removeSuffix(".zip")
}